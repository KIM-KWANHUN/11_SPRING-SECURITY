package com.ohgiraffers.sessionsecurity.user.model.dto;

import com.ohgiraffers.sessionsecurity.common.UserRole;
import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class LoginUserDTO {
    /* comment.
    *   로그인 시 사용할 DTO 클래스는
    *   화면상에서 입력 받는 ID, PASSWORD 뿐만 아니라
    *   로그인에 성공 했을 시 필요한 정보들을 추가적으로 담는다. */

    private int userCode;
    private String userId;
    private String userName;
    private String password;
    private UserRole userRole; // 권한

    public List<String> getRole() {
    // 다중 권한을 위해 List 를 쓴다.
        if(this.userRole.getRole().length() > 0) {

            return Arrays.asList(this.userRole.getRole().split(","));
        }
        return new ArrayList<>();
    }
}
