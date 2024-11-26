package com.ohgiraffers.sessionsecurity.auth.controller.model;

import com.ohgiraffers.sessionsecurity.user.model.dto.LoginUserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// implements UserDetails 전부 오버라이딩 시켜줘야함
public class AuthDetails implements UserDetails {
    /* comment.
    *   UserDetaiService 에서 사용자의 이름을 기준으로 조회한 결과가
    *   반환되는 사용자 타입으로 해당 객체에 조회 된 사용자의 정보가 담겨
    *   Session 에 저장이 되게 한다. */
    // 로그인 시 사용하는 사용자 정보 DTO 를 필드로 갖는다.
    private LoginUserDTO loginUserDTO;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /* comment.
        *   권한 정보를 반환하는 메소드이다. 다중 권한을 위한 Collection 타입으로
        *   return 타입이 지정되어 있으며, 사용자의 권한 정보를 넣을 때
        *   사용되는 메소드이다. */

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // GrantedAuthority 여기에 사용자나 관리자를 담아준다.
        loginUserDTO.getRole().forEach(role -> authorities.add(() -> role));
        // 여러가지 권한을 담아주게 된다. 그리고 return 에 authorities 반환
        return authorities;
    }

    @Override
    public String getPassword() {
        /* comment.
        *   사용자의 비밀번호를 반환하는 메소드 이다.
        *   UsernamePasswordAuthenticationToken 과 사용자의 비밀번호를
        *   비교할 때 사용된다.
        *   즉 우리가 입력한 비밀번호와 암호화된 비밀번호를 알아서 비교해준다. */
        return loginUserDTO.getPassword();
    }

    @Override
    public String getUsername() {
        /* comment.
        *   사용자의 아이디를 반환하는 메소드이다.
        *    UsernamePasswordAuthenticationToken 과 사용자의 아이디를
        *   비교할 때 사용된다.
        *   즉 우리가 입력한 아이디를 알아서 비교해준다. */
        return loginUserDTO.getUserId();
        // 한명의 유저를 식별할 수 있는 unique 값 즉 UserId 를 넣어준다.
    }

    @Override
    public boolean isAccountNonExpired() {
        /* comment.
        *   계정의 만료 여부를 표현하는 메소드이다.
        *   return 값이 false 이면 해당하는 계정을 사용할 수 없게 된다. */
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        /* comment.
        *   잠겨있는 계정을 확인하는 메소드
        *   false 이면 해당 계정이 잠겨 사용이 불가능하다.
        *   ex) 비밀번호 반복 실패 시 일시적인 lock or 오랜기간 비접속 휴먼계정 */
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        /* comment.
         *   탈퇴 계정 여부를 표현하는 메소드
         *   false 이면 해당 계쩡 사용 불가. */
        return true;
    }

    @Override
    public boolean isEnabled() {
        /* comment.
        *   계정의 비활성화 여부로 사용자가 사용할 수 없는 상태
        *   false 이면 계정 사용 불가
        *   ex) 삭제 처리 같은 경우 */
        return true;
    }
}
