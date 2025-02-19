package com.example.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                // Route vers Practitioner Service
                .route("practitioner-service", r -> r.path("/practitioners/**")
                        .uri("lb://practitioner-service"))

                // Route vers Patient Service
                .route("patient-service", r -> r.path("/patients/**")
                        .uri("lb://patient-service"))

                // Route vers Eureka Server (permet d'accéder à Eureka via l'API Gateway)
                .route("eureka", r -> r.path("/eureka/**")
                        .filters(f -> f.rewritePath("/eureka/(?<segment>.*)", "/${segment}"))
                        .uri("http://localhost:8761"))

                .build();

    }

}
