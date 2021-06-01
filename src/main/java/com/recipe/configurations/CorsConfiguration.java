//package com.recipe.configurations;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfiguration implements WebMvcConfigurer {
//    private static final Logger LOGGER = LoggerFactory.getLogger(CorsConfiguration.class);
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        LOGGER.info("Using HST Consumer Controls CORS configuration");
//        registry.addMapping("/**")
//            .allowedHeaders("Authorization", "Content-Type", "institutionCode", "accountId", "userId", "requestID")
//            .allowedMethods("GET", "POST", "PUT", "DELETE");
//    }
//}
