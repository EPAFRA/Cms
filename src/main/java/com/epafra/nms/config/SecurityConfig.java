package com.epafra.nms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public  PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails user1= User.builder()
                .username("myUser1")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
        UserDetails user2= User.builder()
                .username("myUser2")
                .password(passwordEncoder.encode("password"))
                .roles("USER","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user1,user2);
        }
    }
