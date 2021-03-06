package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication
public class SpringBootDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo3Application.class, args);
	}
}
