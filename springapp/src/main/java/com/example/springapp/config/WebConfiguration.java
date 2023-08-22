package com.example.springapp.config;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET",
				"HEAD", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");
		WebMvcConfigurer.super.addCorsMappings(registry);
	}
}