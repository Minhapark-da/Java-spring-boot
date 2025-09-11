package com.example.demo;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller // 컨트롤러 어노테이션 명시
// public class DemoController
// {
//      @GetMapping("/hello") // 전송 방식 GET
//      public String hello(Model model) {
//      model.addAttribute("data", " 반갑습니다."); // model 설정
//      return "hello"; // hello.html 연결
//     }
// }

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "방문을 환영합니다.");
        return "hello"; // hello.html
    }

    // 새로 추가
    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 25);
        model.addAttribute("email", "hong@test.com");
        model.addAttribute("city", "서울");
        model.addAttribute("job", "학생");
        return "hello2"; // hello2.html
    }
}


