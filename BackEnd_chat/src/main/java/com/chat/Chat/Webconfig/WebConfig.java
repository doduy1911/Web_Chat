package com.chat.Chat.Webconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Áp dụng cho tất cả endpoint
                .allowedOrigins("http://localhost:4200") // Chỉ cho phép origin này
                .allowedMethods("GET", "POST", "OPTIONS", "PUT", "DELETE") // Các phương thức
                .allowedHeaders("Content-Type", "Authorization");// Các header
    }
}
