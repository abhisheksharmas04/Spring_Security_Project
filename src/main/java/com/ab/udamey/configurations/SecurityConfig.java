package com.ab.udamey.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.ab.udamey.constants.ApplicationConstants;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity)throws Exception{
        
        httpSecurity.authorizeRequests()
        .antMatchers(ApplicationConstants.BASE_URL+"/**").authenticated()
        .antMatchers(ApplicationConstants.BASE_URL+ApplicationConstants.NOTICE_ULR).permitAll()
        .and().formLogin()
        .and().httpBasic();
        return httpSecurity.build();


        /*  httpSecurity.authorizeRequests()
        .anyRequest().permitAll() // Allow all the request
        .and()
        .formLogin()
        .and().httpBasic();
        return httpSecurity.build();*/
    }
}
