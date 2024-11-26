package com.ohgiraffers.sessionsecurity.user.model.service;

import com.ohgiraffers.sessionsecurity.user.model.dao.UserMapper;
import com.ohgiraffers.sessionsecurity.user.model.dto.LoginUserDTO;
import com.ohgiraffers.sessionsecurity.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;
    //  우리가 만든 SecurityConfig 에 있는 PasswordEncoder 를 가져다 쓰겠다는 의미

    @Transactional
    public int regist(SignupDTO signupDTO) {

        /* comment.
        *   Service 계층은 본격적으로 DB 에 값을 넣기 위한
        *   데이터를 가공하는 계층이다.
        *   현재 signUpDTO 에 userPass 필드는 아직 비밀번호가
        *   암호화가 되어있지 않다. 따라서 DB 에 insert 하기 전
        *   비밀번호를 암호화 할 것이다. */
        // 비밀번호 암호화 처리
        signupDTO.setUserPass(passwordEncoder.encode(signupDTO.getUserPass()));

        int result = userMapper.regist(signupDTO);

        return result;
    }

    /* comment.
    *   사용자의 ID 를 전달받아 회원을 조회하는 메소드
    *   username : 사용자의 ID */
    public LoginUserDTO findByUsername(String username) {

        LoginUserDTO login = userMapper.findByUsername(username);

        if(login == null) {
            return null;
        } else {
            return login;
        } // 검증하는 로직
    }
}
