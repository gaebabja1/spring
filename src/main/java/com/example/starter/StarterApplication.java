package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
//mapping 안되서 Whitelabel오류
@ComponentScan()
@Configuration
@EnableAutoConfiguration
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}
	//mapping 안되서 Whitelabel오류
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
