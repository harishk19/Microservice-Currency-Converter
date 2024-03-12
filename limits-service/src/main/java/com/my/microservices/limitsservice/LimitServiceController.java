package com.my.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {
	
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limit getLimits() {
		
//		return new Limit(9,99);
		return new Limit(config.getMin(), config.getMax());
	}

}
