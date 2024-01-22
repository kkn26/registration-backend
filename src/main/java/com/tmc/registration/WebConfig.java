package com.tmc.registration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 @Configuration
 public class WebConfig implements WebMvcConfigurer {
	
 	@Value("${allowed.origins}")
     private String allowedOrigins;
	
     @Override
     public void addCorsMappings(CorsRegistry registry) {
     	// Add your Angular app URL 
         registry.addMapping("/**")
 	        .allowedOrigins(allowedOrigins.split(","))
 	        .allowedMethods("GET", "POST", "PUT", "DELETE")
 	        .allowedHeaders("*");
     }
 
 }

 
