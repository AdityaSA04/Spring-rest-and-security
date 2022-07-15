package com.sonata.interceptor.config;
import com.sonata.interceptor.LogTimeInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class IntercepterConfig implements WebMvcConfigurer{ 
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogTimeInterceptor()).addPathPatterns("/");
	}
}
