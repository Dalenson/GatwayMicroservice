package com.Dale.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwayApplication.class, args);
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder routeLocatorBuilder){
		return routeLocatorBuilder.routes()
				.route("route_id",
						route -> route
								.path("/api/produtos/**")
								.filters(f -> f.rewritePath("/api/produtos/(?<RID>.*)","/api/produtos/${RID}"))
								.uri("http://localhost:8080"))
				.route("route_id",
						route -> route
								.path("/api/usuarios/**")
								.filters(f -> f.rewritePath("/api/usuarios/(?<RID>.*)","/api/usuarios/${RID}"))
								.uri("http://localhost:8081"))
				.build();
	}
}
