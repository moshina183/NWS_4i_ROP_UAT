package com.mtcit.rop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mtcit.rop.interceptor.BaseInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Autowired
    private BaseInterceptor baseInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Check a condition to decide whether to add the interceptor
        if (shouldAddBaseInterceptor()) {
            registry.addInterceptor(baseInterceptor);
        }
    }

    private boolean shouldAddBaseInterceptor() {
        // Add your logic here to determine if the interceptor should be excluded
        // For example, you can use a configuration property or environment variable
        return false; // Change to true if you want to include it
    }

}
