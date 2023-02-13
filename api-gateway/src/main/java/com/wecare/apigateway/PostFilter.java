//package com.wecare.apigateway;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class PostFilter implements GlobalFilter {
//
//    static class Config{
//
//    }
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//        System.out.println("Post filter executed");
//
//        return chain.filter(exchange)
//                .then(Mono.fromRunnable(()->{
//                    System.out.println("Post Filter executed");
//                }));
//    }
//}
