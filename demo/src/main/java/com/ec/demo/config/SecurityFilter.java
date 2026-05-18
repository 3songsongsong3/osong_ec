package com.ec.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
public class SecurityFilter {

    @Bean
    public DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                        "/",
                        "/products",
                        "/products/**",
                        "/css/**",
                        "/js/**",
                        "/images/**"
                    ).permitAll()

                .anyRequest().authenticated()
            ).formLogin(form->form
            		.loginPage("/login")
            		.permitAll()
            );

        return http.build();
    }
}
