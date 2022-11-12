package introduction.springintroduction.controller;

import introduction.springintroduction.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) { // 의존 관계 주입
        this.memberService = memberService;
    }
}
