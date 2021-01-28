package com.wander.securitydemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wander.securitydemo01.mapper")
@SpringBootApplication
public class SecurityDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemo01Application.class, args);
	}

}
