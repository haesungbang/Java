package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 새로 인스턴스를 생성하는 것이 아니라!
    // Autowired 스프링 컨테이너에서 관리하는 MemberService 를 스프링이 실행 될 때 딱 넣어준다.
    // 이것을 설정하기 위해서는 MemberService 에 controller 와 @Service 연결

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
