package com.demo.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("product-service", r -> r.path("/product-service/**").filters(f -> f.stripPrefix(1)).uri("lb://PRODUCT-SERVICE"))
				.route("order-service", r -> r.path("/order-service/**").filters(f -> f.stripPrefix(1)).uri("lb://ORDER-SERVICE"))
				.route("inventory-service", r -> r.path("/inventory-service/**").filters(f -> f.stripPrefix(1)).uri("lb://INVENTORY-SERVICE"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
