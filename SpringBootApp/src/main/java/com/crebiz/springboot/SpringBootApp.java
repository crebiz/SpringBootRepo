package com.crebiz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.crebiz.springboot.configuration.JpaConfiguration;

/**
 * Spring Boot + Spring MVC + Spring Security + MySQL
 * https://medium.com/@gustavo.ponce.ch/spring-boot-spring-mvc-spring-security-mysql-a5d8545d837d
 * @author Gustavo Ponce
 * 2017.12.14
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.crebiz.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}
}
