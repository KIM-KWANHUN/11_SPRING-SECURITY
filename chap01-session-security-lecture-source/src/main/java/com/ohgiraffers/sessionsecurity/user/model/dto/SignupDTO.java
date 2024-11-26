package com.ohgiraffers.sessionsecurity.user.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignupDTO {
// 회원가입 시 데이터를 묶기 위한 클래스 생성

    private String userId;
    private String userName;
    private String userPass;
    private String role;

}
