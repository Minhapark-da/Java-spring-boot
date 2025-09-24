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

## 4주차 스프링부트 기

링크 대괄호 안으로 묶고 값이 들어가는것만 소괄호
컨트롤러를 통해서 위 데이터 전달
<!-- <input type="text" th:value="${data2}">
<input type="checkbox" th:field="*{data2}" th:value="true"> 동의합니다.
태그의 속성 값 여러 개 지정(링크는 @)
<p><a th:href="@{/posts/(id=${link})}">글 상세보기</a> -->

spring.datasource.url=jdbc:mysql://localhost:3306/spring?serverTimezone=Asia/Seoul