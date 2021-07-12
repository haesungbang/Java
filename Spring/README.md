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