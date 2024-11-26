package com.ohgiraffers.sessionsecurity.user.controller;

import com.ohgiraffers.sessionsecurity.user.model.dto.SignupDTO;
import com.ohgiraffers.sessionsecurity.user.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/*")
public class UserController {

    @Autowired //필드 주입
    private MemberService memberService;

    @GetMapping("signup")
    public void signupPage() {}

    @PostMapping("signup")
    public ModelAndView signup(@ModelAttribute SignupDTO signupDTO, ModelAndView mv) {

    // 회원가입은 insert 1이 반환된다.
        Integer result = memberService.regist(signupDTO);
        // 원시타입은 null 값이 될 수 없다. 그래서 Integer 타입으로 변경 해주어야함.
        String message = null;

        /* comment.
        *   controller 의 역활은 어떠한 view 를 보여줄 지 선택하는 것. */
        if (result == null) {
            message = "중복 된 회원이 존재합니다.";
        } else if (result == 0) {
            message = "서버 내부에서 오류가 발생했습니다.";
            mv.setViewName("user/signup");
            // 오류가 발생하면 다시 user/signup 페이지로 가게 하는 구문
        } else if (result >= 1) {
            message = "회원 가입이 완료되었습니다.";
            mv.setViewName("auth/login");
            // 회원가입이 완료 되면 auth/login 페이지로 가게 하는 구문
        }

        mv.addObject("message", message);
        // 메세지도 함께 전달

        return mv;
    }

}
