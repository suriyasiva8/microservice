package com.microservice.usersservice;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;

@RestController
public class UserController {
	private Logger log=org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/users")
	public List<String> getUsers(){
		log.info("User service is called.......");
		return Arrays.asList("Siva","Ravi","Hardeep","Joseph","John","Patel","");
	}
	

	@Bean
	public Sampler alwaysSampler() {
	    return Sampler.ALWAYS_SAMPLE;
	}

}
