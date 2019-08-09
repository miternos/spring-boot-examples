package com.miternos.sbexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
 * @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
 * @Configuration: allow to register extra beans in the context or import additional configuration classes
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/**
		 * If you need to run some specific code once the SpringApplication has started, you can implement
		 * the ApplicationRunner or CommandLineRunner interfaces.
		 */
		SpringApplication.run(Application.class, args);
	}

}
