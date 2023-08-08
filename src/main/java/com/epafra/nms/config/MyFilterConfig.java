package com.epafra.nms.config;

import com.epafra.nms.Filter.myNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean<myNewFilter> registrationBean() {
        FilterRegistrationBean<myNewFilter> registrationBean = new FilterRegistrationBean<myNewFilter>();
    registrationBean.setFilter(new myNewFilter());
    registrationBean.addUrlPatterns("/customers/");
        return registrationBean;
    }

    }
