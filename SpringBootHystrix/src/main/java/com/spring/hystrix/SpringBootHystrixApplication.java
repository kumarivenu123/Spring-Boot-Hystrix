package com.spring.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class SpringBootHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHystrixApplication.class, args);
	}
}
