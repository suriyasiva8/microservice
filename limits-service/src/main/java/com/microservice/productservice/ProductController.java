package com.microservice.productservice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;


@RestController
public class ProductController {
	private Logger log=org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment env;
	
    @Value("${products-service-discountPercentage}")
    private Integer discountPercentage;
    
	
	@GetMapping("/products")
	public Product retrieveProductList(){
		log.info("Product Service is Called..........");
		List<String> productList=Arrays.asList("Product_1","Product_2","Product_3","Product_4","Product_5","Product_6");
		return new Product(discountPercentage,Integer.valueOf(env.getProperty("local.server.port")),productList);
	}
	

	@Bean
	public Sampler alwaysSampler() {
	    return Sampler.ALWAYS_SAMPLE;
	}

}
