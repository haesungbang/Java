Spring Start

start.spring.io 스프링 부트에서 프로젝트를 만든다.
요즘은 Gradle 사용
group 회사명 같은 느낌? artifact 는 프로젝트 이름
Spring web, themeleaf 선택하고 generate

요즘 개발에서는 test 가 정말 중요하다.

preference 에서 gradle 을 intelij 로 하면 빨리 실행

thymeleaf 는 템플릿 엔진.

실행은 어플리케이션 들어가서 main 을 실행

---

기본적으로 src/resources/index 를 welcome page 로 인식한다. 정적페이지
thymeleaf 템플릿 엔진을 사용해서 동적으로 바꿀 수 있다

**console 을 활용한 실행**

- ./gradlew build
- cd build
- cd libs
- java -jar copy&paste
- 실행 확인

---

웹개발 3가지가 있다. : 정적컨텐츠, MVC와 템플릿 엔진, API

1. static 주소: localhost8080/hello-static.html
2. mvc
   hello-mvc?name=spring!!!
   에서 ?뒤에가 params, ? 뒤에 name 은 params 내에 "name" 이다. 값은 컨트롤러에 String name 이고 이 name 이 attribute value? 로 들어간다.
3. api
   객체를 내리면 JsonConverter 를 통해서 Json 으로 보낸다
   String 이면 StringConverter 를 통해서 String 반환
   @ResponseBody 하면 html 이 아니라 그냥 글자를 내보낸다.

> Tip: getter setter 은 Cmd+N

---

회원관리예제(데이터베이스가 정해지지 않았을 때)

java junit 테스트한다.

controller 에서 요청을 받고, service 에서 비지니스 로직을 만들고, repository에서 데이터 저장하고

스프링 빈을 등록하는 2가지 방법

- 컴포넌트 스캔과 자동 의존관계 : 우리가 돌리는 application 에 포함된 패키지만 돈다.
  기본적으로 싱글톤으로 등록한다.(유일하게 하나만 등록해서 공유한다.)
- 자바 코드로 직접 스프링 빈 등록하기

---

회원관리예제 mvc

Localhost:8080 으로 가면, controller 를 먼저 뒤지고 없으면, static

작성 순서: Controller -> templates

Member Form 을 만든이유, Member 로 받을 경우 무관한 데이터를 추가로 받아야되서 좋지 않다.

왜 redirect 가 안 되나....