package com.digital.gateway.instacargateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstacarGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstacarGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/vehicles")
						.filters(f -> f.circuitBreaker(config -> config
								.setName("scott")
								.setFallbackUri("https://google.com")))
						.uri("http://localhost:8080"))
						.build();
	}

}
