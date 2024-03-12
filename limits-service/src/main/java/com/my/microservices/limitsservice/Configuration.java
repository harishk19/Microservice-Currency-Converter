package com.my.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;



@ConfigurationProperties("limit-service")
@Data
@Component
public class Configuration {
	
	private int min;
	private int max;
	

}
