package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/*
@Configuration(proxyBeanMethods=false)
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfiguration {
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
	      return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

    // In-memory authentication example
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("ss") // Username
            .password("ss") // Password (plaintext)
            .roles("USER"); // Role(s) assigned to the user
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .httpBasic();
    }

   /* @Bean
    public PasswordEncoder passwordEncoder() {
    	 return new BCryptPasswordEncoder();
    }
}
*/