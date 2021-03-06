package com.spring.insta.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("resources/**")
				.addResourceLocations("classpath:/static/**", "classpath:/resources/**");
		registry.addResourceHandler("/**")
				.addResourceLocations("file:src/main/resources/templates/", "file:src/main/resources/static/");
		registry
				.addResourceHandler("/image/**")
				.addResourceLocations("file:/home/ec2-user/app/project/outsta/upload/");
	}

}
