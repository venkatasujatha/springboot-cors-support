package com.example.demo.Config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAutoConfiguration
public class webMvcConfig {
	/*
	 * @Value("${spring.graphql.cors.allowed_origins}") private String
	 * allowedOrigin;
	 */
	@Bean
	public WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/prod").allowedOrigins("http://localhost:9090");

			}
		};

	}

}
