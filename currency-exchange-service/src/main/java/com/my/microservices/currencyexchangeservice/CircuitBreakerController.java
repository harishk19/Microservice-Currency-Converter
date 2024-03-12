package com.my.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/test-api")
	//@Retry(name = "test-api", fallbackMethod = "hardCodedResponse")
	//@CircuitBreaker(name = "default", fallbackMethod = "hardCodedResponse")
	//10s -> 100 calls to the test-api
	//@RateLimiter(name = "default")
	//@Bulkhead(name = "test-api")
	//@TimeLimiter(name = "test-api")
	public String testApi() {
		logger.info("test-api call Received");
		//ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
		//return forEntity.getBody();
		return "Test API";
	}
	
	public String hardCodedResponse(Exception ex) {
		logger.info(ex.getMessage());
		 return "fallback-response";
	}

}	