import com.example.demo.model.service.Testservice; // 최상단 서비스 클래스 연동 추가

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

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

    @GetMapping("/about_detailed")
    public String about() {
        return "about_detailed";}

        @GetMapping("/test1")
public String thymeleaf_test1(Model model) {
model.addAttribute("data1", "<h2> 방갑습니다 </h2>");
model.addAttribute("data2", "태그의 속성 값");
model.addAttribute("link", 01);
model.addAttribute("name", "홍길동");
model.addAttribute("para1", "001");
model.addAttribute("para2", 002);
return "thymeleaf_test1";
}
    }


    // 클래스 하단 작성
@Autowired
 Testservice testService; // DemoController 클래스 아래 객체 생성
// 하단에 맵핑 이어서 추가
@GetMapping("/testdb")
 public String getAllTestDBs(Model model) {
 TestDB test = testService.findByName("홍길동");
 model.addAttribute("data4", test);
 System.out.println("데이터 출력 디버그 : " + test);
 return "testdb";
 }
 
 @GetMapping("/article_list") // 게시판 링크 지정
public String article_list(Model model) {
 List<Article> list = blogService.findAll(); // 게시판 리스트
model.addAttribute("articles", list); // 모델에 추가
return "article_list"; // .HTML 연결
}
}
