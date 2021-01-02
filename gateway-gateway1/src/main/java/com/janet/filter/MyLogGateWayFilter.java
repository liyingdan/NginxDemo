package com.janet.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author Janet
 * @date 2020/5/12            网关   http://localhost:9527/payment/lb?userName=l
 * 连接 nginx 之后：http://192.168.10.13:9011/payment/lb?userName=l
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("--------------------come in MyLogGateWayFilter:  "+new Date());
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if(userName == null) {
            log.info("------------用户名为null，非法用户，o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;  //数据越小，优先级越高
    }
}
