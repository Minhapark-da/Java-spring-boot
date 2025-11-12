package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.example.demo.model.domain.Board;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    /**
     * 게시글 목록 (검색 + 페이징)
     * page: 0-base, size: 페이지당 글 수
     */
    @GetMapping("/board_list")
    public String boardList(Model model,
                            @RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "3") int size,
                            @RequestParam(defaultValue = "") String keyword) {

        PageRequest pageable = PageRequest.of(page, size);

        Page<Board> list = keyword.isEmpty()
                ? blogService.findAll(pageable)
                : blogService.searchByKeyword(keyword, pageable);

        // PPT 요구: 현재 페이지의 시작 글번호 (1 ~ n)
        int startNum = (page * size) + 1;

        model.addAttribute("boards", list);                 // Page<Board>
        model.addAttribute("currentPage", page);            // 현재 페이지
        model.addAttribute("totalPages", list.getTotalPages());
        model.addAttribute("keyword", keyword);
        model.addAttribute("pageSize", size);
        model.addAttribute("startNum", startNum);           // 글번호 시작값
        return "board_list";
    }

    /**
     * 게시글 상세
     */
    @GetMapping("/board_view/{id}")
    public String boardView(Model model, @PathVariable Long id) {
        Optional<Board> opt = blogService.findById(id);
        if (opt.isEmpty()) {
            return "/error_page/article_error";
        }
        model.addAttribute("boards", opt.get());   // (기존 뷰 이름과 맞춰 "boards"로 유지)
        return "board_view";
    }

    /**
     * 글쓰기 화면
     */
    @GetMapping("/board_write")
    public String boardWrite() {
        return "board_write";
    }

    /**
     * 글 저장
     */
    @PostMapping("/api/boards")
    public String addBoards(@ModelAttribute AddArticleRequest request) {
        blogService.save(request);
        return "redirect:/board_list";
    }

    /**
     * 글 삭제
     * - 경로/리다이렉트를 boards 컨벤션에 맞게 정리
     */
    @DeleteMapping("/api/board_delete/{id}")
    public String deleteBoard(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/board_list";
    }

    /**
     * 공통 예외 처리
     * - 내부 클래스로 두되 static으로 선언(권장)
     */
    @ControllerAdvice
    public static class GlobalExceptionHandler {

        @ExceptionHandler(MethodArgumentTypeMismatchException.class)
        public String handleTypeMismatch(MethodArgumentTypeMismatchException ex, Model model) {
            model.addAttribute("message", "잘못된 게시글 접근입니다.");
            return "error_page/article_error";
        }
    }
}
