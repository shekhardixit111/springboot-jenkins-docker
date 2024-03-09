package com.sdixit.springboot.jenkins.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetController {
	
	public static Logger log=LoggerFactory.getLogger(GreetController.class);
	
	
	@GetMapping("/hello")
	public String greeting() {
		log.info("hello from SpringbootJenkinsDockerApplication");
		return "hello from SpringbootJenkinsDockerApplication";
	}

}
