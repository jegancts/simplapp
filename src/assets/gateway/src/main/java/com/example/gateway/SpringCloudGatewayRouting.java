package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("paymentId", r->r.path("/payment/**").uri("http://localhost:9009")) //static routing
                .route("orderId", r->r.path("/order/**").uri("lb://ORDER-SERVICE")) //dynamic routing
                .route("gatewayId", r->r.path("/gateway/**").uri("http://localhost:8080")) //static routing
                .build();
    }
}