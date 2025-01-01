package com.odaimzabi.art_institute_chicago_search_engine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SecurityConfig {

  @Bean
  public CorsFilter corsConfigurationSource() {
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(false);
    config.setAllowedOrigins(List.of("http://localhost:4200"));
    config.setAllowedMethods(List.of("POST", "PUT", "PATCH", "GET", "OPTIONS", "DELETE"));

    config.setAllowedHeaders(
        List.of(
            "Authorization",
            "Accept",
            "X-Requested-With",
            "Content-Type",
            "Access-Control-Request-Method",
            "Access-Control-Request-Headers"));

    config.setExposedHeaders(
        List.of("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));

    config.setMaxAge(3600L);

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);

    return new CorsFilter(source);
  }
}
