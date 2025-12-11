새로운 시작! 스프링 부트의 세계로 떠나보아요~
## Getting Started
 - [프로젝트 메인 주소] (https://github.com/Minhapark-da)

## 2주차 스프링부트 기초 수업 총정리

프론트엔드 프로그래밍 
- 라이브러리(jQuery/D3/js/Bootstrap 등), 프레임워크(React/Angular/Vue 등)

백엔드 프로그래밍 
- 서버언어(Python/Java/PHP 등), 프레임워크(Node.js/Spring/Django)
- 서버 기반 정보 요청/응답 처리, 데이터 처리를 서버에 의존

기존 라이브러리의 한계로 "프레임워크" 등장 
-> 독립 개발보다 공통 표준 모듈 사용

## 프레임워크 vs 라이브러리 비교

- 프레임워크 규칙에 따라 작성 / 독자적으로 
- 프레임워크가 코드 실행 제어 (제어 반전) / 사용자가 직접 호출
- 프레임워크가 주도 / 사용자가 주도
- 결과물 연동 구조·표준화된 방식 지원 / 독자적이고 자유로운 방식

## 스프링부트
- 스프링 프레임 워크 (2004년) / 오픈 소스 기반 대표 웹 프레임워크
- 스프링 기반 eGOV (2010년 이후) / 국내 주요 공공기관 웹 프로젝트 (자바, JSP, jQuery, eGOV 기술 요구)
- 스프링 부트 (2014년) / 작은 규모 및 서블릿 관리 (자바언어, JVM 위에서 실행)

## 기본 화면 실행
HTML5 - CSS+HTML+JavaScript
static - 이미지
templates - html

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>index 메인페이지</title>
</head>
<body>
  <h1>안녕하세요!</h1>
  </body>
</html>

package com.example.demo; - 현재 폴더 위치

import org.springframework.boot.SpringApplication; - 스프링 핵심 클래스
Import org.springframework.boot.autoconfigure.SpringBootApplication; - 자동 설정 기능 활성화

* @SpringBootApplication - 애노테이션(스프링 부트 APP 명시, 하위 다양한 설정을 자동 등록)
 public class DemoApplication { - 클래스 이름

 public static void main(String[] args) { - 메인 메서드(프로그램 시작점)
 SpringApplication.run(DemoApplication.class, args); - run 메서드로 실행
  }
}

## 자바 클래스 파일
자바 언어의 JVM(자바 가상 머신)

- 플랫폼 독립성
자바 프로그램은 운영체제나 하드웨어에 의존하지 않고, 어떤 환경에서도 동일하게 실행 가능
장점: 다양한 환경에서 실행 가능
단점: 초기 컴파일 과정이 필요함

- 바이트코드 실행
자바 소스 코드를 바이트코드로 컴파일하여 실행 -> 플랫폼 독립성 확보
장점: 다양한 플랫폼 지원
단점: 인터프리터 또는 JIT 컴파일 과정이 필요함

- 가비지 컬렉션(Garbage Collection)
개발자가 직접 메모리 관리를 하지 않아도 됨
장점: 메모리 누수 방지
단점: 초기 실행 시 성능 저하 가능성

- 보안(Security)
샌드박스 방식으로 실행되어 시스템 보안을 강화함
장점: 안전한 실행 환경 제공
단점: 구현이 복잡함

- 성능(Performance)
JIT(Just-In-Time) 컴파일러를 사용하여 실행 성능을 향상시킴
장점: 빠른 실행 속도
단점: 초기 컴파일 과정이 필요함

## 스프링 부트 동작 과정
대표 웹애플리케이션 서버 - NGINX, APACHE, IIS 등
정적 -> 동적 웹 페이지 개발 / 스프링 프레임워크 내부 WAS 기반 동작

스프링 부트 프레임워크 - APACHE 웹 서버 + 톰캣(TOMCAT)

내부 컨테이너 전체 동작 과정 요약
(1) 클라이언트 요청(URI 매핑)
(2) 어댑터 조회 및 컨트롤러 호출 
(3) 응답 반환(응답) 
(4) 뷰 리졸버 실행(뷰 렌더링) 
(5) 화면 리턴 
= 단일 컨테이너를 통해 동작함 (내부에 다양한 기능 통합)

서블릿(DispatcherServlet) 내부 동작
프론트 컨트롤러 역할(페이지 요청/응답 처리)
(1) html 페이지 요청
(2) uri 읽은 후 .java 파일 → .class 변환
(3) html 파일 생성 후 페이지 응답

기본 MVC 디자인 패턴 적용
• M(MODEL) : 페이지 정보 저장
• V(VIEW) : 페이지 화면 구성
• 템플릿 엔진 : jsp, thymeleaf 등
• C(CONTROLLER) : 페이지 흐름 제어

## Thymeleaf
- HTML 기반 템플릿 엔진 
• 템플릿 엔진은 다양한 엔진 존재 
• 고전 JSP는 선호 X 
• HTML, XML, JS, CSS 등 지원 

- MVC에서 화면 출력 : 뷰(V) 역할 
• DispatcherServlet을 통해 동작 
• TemplateEngine 내장 

- 주요 기능 
• 데이터 바인딩, 연산, 객체 호출 등 
• 템플릿 Fragment 
• 전용 제어문(반복/조건 등)

- 모든 링크는 컨트롤러를 통해 동작
•URL 요청 이후 컨트롤러는 viewName 리턴
•메인화면 index.html의 위치 확인
•리턴 받은 이름의 페이지 연결 (viewName.html)

- 참고 : 기본 템플릿 엔진
• 최상위 폴더 : pom.xml 설정 파일

html에서 어떻게 사용되나?
<html lang="en" xmlns:th="http://www.thymeleaf.org"> 선언
* This code will be removed at thymeleaf parsing time! 주석
<span th:text="${data}"> 텍스트 출력

## URL 맵핑 & 컨트롤러

* DemoController.java 파일에 아래 컨트롤러 추가
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 어노테이션 명시
Public class DemoController {
  @GetMapping(＂/hello＂) // 전송 방식 GET
  public String hello(Model model) { 
    model.addAttribute("data", " 방갑습니다."); // model 설정
    return "hello"; // hello.html 연결
  }
} 

* tmaplates / hello.html, index html 수정
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>index 메인페이지</title>
</head>
<body>
    <h1>안녕하세요!</h1>
    **<a href="/hello">홈페이지 메인</a>
</body>
</html> 

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
    <title>Hello 페이지</title>
</head>
<body>
    <h1>안녕하세요!</h1>
    <p th:text="${data}"></p>
    <a href="/">홈페이지 메인</a>
</body>
</html>

## 3주차 스프링부트 기초 수업 총정리

## 포트폴리오 작성하기 
최상단 네비게이션 바 / 한글 일부 수정
내 프로필 페이지 수정 및 이미지 수정
버튼 클릭 경우 상세페이지 연결 구현

## 4주차 스프링부트 기초 수업 총정리

대표 RDBMS: Oracle, MySQL, PostgreSQL, MariaDB, SQLite 
오픈소스 DBMS와 클라우드 서비스, NoSQL 점차 성장
프로젝트에 따라 속도, 일관성, 확장성, 비용 등을 고려해 데이터베이스를 선택

JPA(Java Persistence API)
ORM(Object Relational Mapping) 기술로, 클래스와 테이블 매핑
SQL 쿼리 없이 자바 메서드로 데이터 생성, 수정, 삭제, 조회가 가능
영속성 컨텍스트를 통해 객체 상태를 자동으로 관리

MVC 패키지 구조 정리
Controller : 사용자 요청과 응답 처리
Service : 중간 로직과 데이터 가공 담당
Repository : 데이터베이스 접근과 CRUD 기능 수행
Domain(Model) : 실제 데이터 구조를 담당하는 엔티티 클래스 포함
View(Templates) : HTML과 Thymeleaf를 이용해 화면 구성

테스트 페이지 구성
Entity(TestDB.java) : @Entity, @Id 등 이용해 DB 테이블과 매핑
Repository(TestRepository.java) : JpaRepository를 상속받아 CRUD 기능 자동 제공
Service(TestService.java) : Repository를 주입받아 데이터 처리 로직 구현
Controller(DemoController.java) : /testdb 요청을 받아 데이터를 View로 전달
View(testdb.html) : th:text 등을 이용해 DB 데이터 출력

실습 요약
JPA와 MySQL을 연동 -> 데이터베이스 자동 생성 및 매핑
MVC 구조 계층별로 분리하여 유지보수 쉬워짐
VS Code의 MySQL 확장을 통해 DB 상태를 직접 확인
SQL 명령어로 데이터를 추가하면 브라우저에서 바로 출력됨
INSERT INTO testdb (name) VALUES ('홍길동');

## 5주차 스프링부트 기초 수업 총정리

Rest API 개념
REST (Representational State Transfer): 웹 자원을 URI로 식별하고, 표준 HTTP 메서드로 상태를 주고받는 방식
자원(Resource) : 데이터 또는 객체
행위(Method) : CRUD(생성, 조회, 수정, 삭제)
표현(Representation) : JSON 또는 XML 형식
장점: 확장성, 유연성, 언어 독립성
주의점: 세션 비사용, 캐싱 및 복잡한 트랜잭션 처리에 부적합

HTTP 메서드와 CRUD 매핑
POST → Create (데이터 생성)
GET → Read (데이터 조회)
PUT / PATCH → Update (데이터 수정)
DELETE → Delete (데이터 삭제)

URI 설계 원칙:
명사형 사용 (동사 금지)
소문자, 하이픈 사용 (언더바 금지)
확장자 생략 (예: /article/1)

블로그 게시판 만들기
1. 게시판 화면 구성
2. 게시글 조회 기능 구성
게시글 작성 기능
데이터 연동 및 확인

페이지 리다이렉트 기능
BlogController에 아래 코드 추가
return "redirect:/article_list";
@RestController 대신 @Controller로 변경하면 HTML 뷰 리턴 가능

favicon.ico 자동 요청 오류 시
BlogRestController에 아래 코드 추가

@GetMapping("/favicon.ico")
public void favicon() {}


GitHub에 코드 업로드 시
README에 프로젝트 링크 기재

[index.html : 실행/수정 완료](https://github.com/Minhapark-da/Java-spring-boot)

## 6주차 스프링부트 기초 수업 총정리

ORM(Object-Relational Mapping) 개념
객체와 관계형 데이터베이스 간의 매핑을 자동으로 처리하는 기술
복잡한 SQL 쿼리를 직접 작성하지 않고도 데이터 조작 가능
주요 구조: Spring Data JPA → Hibernate → JDBC → DB
대표 ORM 구현체: Hibernate (JPA 인터페이스 구현)
JDBC를 내부적으로 사용하며 객체 지향 쿼리 언어 지원

ORM 매핑과 영속성(Persistence)
객체와 DB는 ORM 매핑을 통해 연결
영속화: 객체를 메모리에서 벗어나 DB에 저장해 생명주기를 관리
프로그램 종료 후에도 데이터 유지됨
EntityManager: 객체 생명주기 및 SQL 실행 관리

주요 기능:
캐싱(Cache)
쓰기 지연(Write Delay)
변경 감지(Change Detection)
지연 로딩(Lazy Loading)

블로그 게시판 수정 기능
1. 수정 버튼 추가
<a class="btn btn-warning" th:href="@{/article_edit/{id}(id=${article.id})}">수정</a>
<a class="btn btn-danger" th:href="@{/article_delete/{id}(id=${article.id})}">삭제</a>
2. 게시글 수정 페이지 연결
Controller (BlogController.java)
/article_edit/{id} 경로 매핑 추가

@GetMapping("/article_edit/{id}")
public String article_edit(Model model, @PathVariable Long id) {
    Optional<Article> list = blogService.findById(id);
    if (list.isPresent()) {
        model.addAttribute("article", list.get());
    } else {
        return "/error_page/article_error";
    }
    return "article_edit";
}
3. 수정 화면 작성
PUT 방식 지정 (_method hidden 필드 사용)
4. Service 수정
BlogService.java에 findById()와 update() 메서드 추가
Optional로 null 방지
Article 객체의 상태를 변경 후 저장

public void update(Long id, AddArticleRequest request) {
    Optional<Article> optionalArticle = blogRepository.findById(id);
    optionalArticle.ifPresent(article -> {
        article.update(request.getTitle(), request.getContent());
        blogRepository.save(article);
    });
}
5. Controller에 PUT 매핑 추가
게시글 수정 완료 후 다시 목록으로 리다이렉트
@PutMapping("/api/article_edit/{id}")
public String updateArticle(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
    blogService.update(id, request);
    return "redirect:/article_list";
}
6. Entity 수정
Article.java에 update() 메서드 추가

public void update(String title, String content) {
    this.title = title;
    this.content = content;
}

7. HTML PUT/DELETE 지원 설정
기본 HTML은 GET/POST만 지원하므로 아래 속성 추가 후 서버 재시작
spring.mvc.hiddenmethod.filter.enabled=true

블로그 게시판 삭제 기능
Controller (BlogController.java)
@DeleteMapping("/api/article_delete/{id}") 추가

삭제 후 목록 페이지로 리다이렉트

@DeleteMapping("/api/article_delete/{id}")
public String deleteArticle(@PathVariable Long id) {
    blogService.delete(id);
    return "redirect:/article_list";
}

Service (BlogService.java)

삭제 로직 추가

public void delete(Long id) {
    blogRepository.deleteById(id);
}


HTML 버튼 추가 (article_list.html)

<form th:action="@{/api/article_delete/{id}(id=${article.id})}" method="post" style="display:inline;">
    <input type="hidden" name="_method" value="delete">
    <button type="submit" class="btn btn-danger">삭제</button>
</form>

예외 처리 추가
잘못된 ID 또는 접근 시 에러 페이지 표시
<h4 class="alert-heading">잘못된 게시판 접근입니다!</h4>
<a href="javascript:history.back()" class="btn btn-primary">이전 페이지로</a>


잘못된 매개변수(문자열 등) 처리 시
@ControllerAdvice 를 사용해 공통 예외 페이지 연결 가능

박민하 깃허브 링크 (https://github.com/Minhapark-da/Java-spring-boot)


-----기말-----

1. 7주차 스프링부트 정리
게시판 구조 확장 (Board 게시판)

핵심 개념
기존 Article 게시판을 확장하여 Board 전용 게시판 분리
Entity / Repository / Service / Controller 계층 분리
테이블 기반 게시판 구조로 개선
게시글 상세보기, 수정, 삭제 기능 구현

핵심 코드
Board Entity

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String user;
    private String newdate;
    private String count;
    private String likec;
}

BoardRepository

public interface BoardRepository extends JpaRepository<Board, Long> {
}

게시판 목록 컨트롤러

@GetMapping("/board_list")
public String boardList(Model model) {
    List<Board> list = blogService.findAll();
    model.addAttribute("articles", list);
    return "board_list";
}

게시글 상세보기
@GetMapping("/board_view/{id}")
public String boardView(Model model, @PathVariable Long id) {
    Board board = blogService.findById(id);
    model.addAttribute("board", board);
    return "board_view";
}

2. 9주차 스프링부트 정리
게시판 검색 & 페이징

핵심 개념
데이터 증가에 따른 성능 문제 대응
전체 조회 방식의 한계 → 검색 + 페이징 도입
Pageable / Page 객체 활용
검색 결과에도 페이징 유지

핵심 코드
Repository (검색 + 페이징)

public interface BoardRepository extends JpaRepository<Board, Long> {
    Page<Board> findByTitleContaining(String keyword, Pageable pageable);
}

Service

public Page<Board> searchBoards(String keyword, Pageable pageable) {
    return boardRepository.findByTitleContaining(keyword, pageable);
}

Controller

@GetMapping("/board_list")
public String boardList(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(required = false) String keyword,
        Model model) {

    Pageable pageable = PageRequest.of(page, 5);

    Page<Board> boards = (keyword == null)
        ? boardRepository.findAll(pageable)
        : boardRepository.findByTitleContaining(keyword, pageable);

    model.addAttribute("boards", boards);
    model.addAttribute("keyword", keyword);
    return "board_list";
}

3. 10주차 스프링부트 정리
로그인 · 로그아웃 (기본)

핵심 개념
스프링 시큐리티 기반 인증 구조 이해
세션 기반 로그인
비밀번호 암호화(BCrypt)
로그인 / 로그아웃 기본 흐름 구현

핵심 코드
SecurityConfig

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            .formLogin()
            .and()
            .logout();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

4. 11주차 스프링부트 정리
로그인 · 로그아웃 (심화)

핵심 개념
자체 로그인 로직 구현
이메일 기반 회원 인증
Validation을 이용한 입력값 검증
로그인 실패 처리

핵심 코드
Member Entity

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
}

로그인 Service

public Member login(String email, String password) {
    Member member = memberRepository.findByEmail(email)
        .orElseThrow(() -> new IllegalArgumentException("회원 없음"));

    if (!passwordEncoder.matches(password, member.getPassword())) {
        throw new IllegalArgumentException("비밀번호 불일치");
    }
    return member;
}

Validation DTO
public class LoginRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}

5. 12주차 스프링부트 정리
포트폴리오 완성

핵심 개념

지금까지 구현한 기능 전체 통합
게시판 + 검색 + 페이징 + 인증 기능 결합
MVC 구조 최종 점검
실서비스 구조에 가까운 웹 애플리케이션 완성

핵심 코드 흐름 요약
Client
 ↓
Controller (요청 처리)
 ↓
Service (비즈니스 로직)
 ↓
Repository (DB 접근)
 ↓
Entity (데이터)

CRUD → 검색 → 페이징 → 인증으로 단계적 확장
데이터 규모 증가에 따른 구조 변화 이해
스프링 부트 MVC 패턴 실전 적용
포트폴리오로 활용 가능한 프로젝트 완성