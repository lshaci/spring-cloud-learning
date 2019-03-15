package com.lshaci.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.net.URI;

@Configuration
public class GlobalFilterConfig {

    @Bean
    @Order(99)
    public GlobalFilter authenticationFilter() {
        return ((exchange, chain) -> {
            System.err.println("==========>测试一下过滤器");
            URI uri = exchange.getRequest().getURI();
            System.err.println(uri.getPath());
            return chain.filter(exchange);
        });
    }
}
