package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    // get 으로 들어오면 그냥 createMemberForm 으로 보낸다.
    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    // post 방식으로 넘어온다.
    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        // 날라온 것을 넣는다.
        member.setName(form.getName());
        // 회원가입 구현해놓은 서비스
        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        // list 자체를 model 에 담아서 화면에 넘긴다.
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
