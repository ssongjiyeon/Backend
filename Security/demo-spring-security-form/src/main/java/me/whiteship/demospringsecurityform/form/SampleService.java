package me.whiteship.demospringsecurityform.form;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public void dashboard() {
		// 로그인한 사용자 정보 참조
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities(); // 사용자의 권한을 나타냄
		
		// 인증을 한 다음에는 credential 값이 필요 없음
		Object credentials = authentication.getCredentials();
		boolean authenticated = authentication.isAuthenticated();
	}

}
