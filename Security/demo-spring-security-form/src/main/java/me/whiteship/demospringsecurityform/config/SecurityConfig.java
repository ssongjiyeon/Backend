package me.whiteship.demospringsecurityform.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import me.whiteship.demospringsecurityform.account.AccountService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	AccountService accountService; // 이걸 명시적으로 선언
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.mvcMatchers("/", "/info", "/account/**").permitAll()
				.mvcMatchers("/admin").hasRole("ADMIN")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.and()
			.httpBasic();
	}
	
//	@Override // 명시적으로 선언 -> 근데 빈이 등록만 되어 있으면 알아서 갔다 써서 필요 없음
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(accountService); // 이걸 써서 유저 정보를 가져온다.
//	}
	
// DB를 사용해서 인증을 하기때문에 이제 이 부분이 필요 없음
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//				.withUser("Jiyeon").password("{noop}123").roles("USER").and()
//				.withUser("admin").password("{noop}!@#").roles("ADMIN");
//	}
}
