package com.sdixit.springboot.jenkins.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkinsDockerApplication {
	public static Logger log=LoggerFactory.getLogger("SpringbootJenkinsDockerApplication");
	
	@PostConstruct
	public void init() {
		log.info("SpringbootJenkinsDockerApplication Postconstruct executed..............");
		
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerApplication.class, args);
	}

}
