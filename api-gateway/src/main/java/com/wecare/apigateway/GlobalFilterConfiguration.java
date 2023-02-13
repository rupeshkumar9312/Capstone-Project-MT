//package com.wecare.apigateway;
//
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Configuration
//public class GlobalFilterConfiguration {
//
//    @Bean
//    @Order(1)
//    public GlobalFilter filter(){
//        return (exchange, chain) -> {
//            String header = exchange.getRequest().getHeaders().getFirst("Auth");
//            if(header==null || header.isEmpty()){
//                return onError(exchange, "No Authorization Header", HttpStatus.UNAUTHORIZED);
//            }
//            System.out.println(exchange.getRequest().getURI());
//            System.out.println("Global first Pre Filter Executed...");
//            return chain.filter(exchange)
//                    .then(Mono.fromRunnable(()->{
//                        System.out.println("Global first Post Filter");
//                    }));
//        };
//    }
//
//    @Bean
//    @Order(2)
//    public GlobalFilter secondFilter(){
//        return (exchange, chain) -> {
//            System.out.println("Global second Pre Filter Executed...");
//            return chain.filter(exchange)
//                    .then(Mono.fromRunnable(()->{
//                        System.out.println("Global second Post Filter");
//                    }));
//        };
//    }
//
//    @Bean
//    @Order(3)
//    public GlobalFilter thirdFilter(){
//        return (exchange, chain) -> {
//            System.out.println("Global third Pre Filter Executed...");
//            return chain.filter(exchange)
//                    .then(Mono.fromRunnable(()->{
//                        System.out.println("Global third Post Filter");
//                    }));
//        };
//    }
//
//    private Mono<Void> onError(ServerWebExchange exchange, String no_authorization_header, HttpStatus unauthorized) {
//        ServerHttpResponse response = exchange.getResponse();
//        response.setStatusCode(HttpStatus.UNAUTHORIZED);
//        return response.setComplete();
//    }
//}
