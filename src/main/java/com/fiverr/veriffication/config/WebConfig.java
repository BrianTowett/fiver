package com.fiverr.veriffication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Change * to "http://localhost:5500" etc. for security
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
