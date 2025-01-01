package com.odaimzabi.art_institute_chicago_search_engine.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }
}
