package com.cos.security1.config.auth;

import com.cos.security1.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class PrincipalDetails implements UserDetails {

    private User user;

    public PrincipalDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getRole();
            }
        })
        return collect;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() { // 계정이 만료되었는지
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // 계정이 잠겨있는지
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // 비밀번호 변경 주기(?)
        return true;
    }

    @Override
    public boolean isEnabled() { // 계정 활성화되어 있는지
        // 1년동안 로그인 안 한 회원 휴면계정으로 변경
        return true;
    }
}
