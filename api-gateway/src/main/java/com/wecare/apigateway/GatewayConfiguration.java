//package com.wecare.apigateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfiguration {
//
//    @Configuration
//    public class GatewayRoutesConfig {
//
//        @Bean
//        public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//            return builder.routes()
//                    .route(r -> r.path("/iam-service/api/auth/**")
//                            .filters(f -> f.rewritePath("/api/auth/(?<segment>.*)", "/${segment}"))
//                            .uri("http://localhost:8000/")
//                            )
//                    .build();
//        }
//    }
//
//}
