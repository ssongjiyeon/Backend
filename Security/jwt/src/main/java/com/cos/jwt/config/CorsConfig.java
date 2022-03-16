package com.cos.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 내 서버가 응답을 할 때 json을 자바스크립트에서 처리할 수 있게 할 지를 설정
        config.addAllowedOrigin("*"); // 모든 ip 응답 허용
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/api/**", config); // 해당 주소로 오는 것들은 모두 이 필터를 거쳐야 된다.
        return new CorsFilter(source);
    }
}
