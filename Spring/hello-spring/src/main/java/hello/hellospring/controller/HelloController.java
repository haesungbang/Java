package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        // hello 의 의미는 기본적으로 templates 의 파일명
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    // Body 에 내가 Data 를 직접 넣어 주겠다.
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        // html 파일이 아닌 문자 그대로를 내린다.
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    // 객체를 내리면 Json 방식으로 내린다.
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
