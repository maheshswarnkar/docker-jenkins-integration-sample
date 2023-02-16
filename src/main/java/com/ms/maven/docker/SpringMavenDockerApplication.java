package com.ms.maven.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMavenDockerApplication {

	@GetMapping("/message")
	public String helloMessage() {
		return "Hello Mahesh!! Congratulations you have created and deployed application into Docker.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenDockerApplication.class, args);
	}

}
