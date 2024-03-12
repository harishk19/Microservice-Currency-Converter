package com.my.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@Autowired
	private Environment environment;

	@Autowired
	CurrencyExchangeRepository repo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		//INFO [currency-exchange,f69c48f1aa5fcb294b8216ccb70dba32,919bed571b16f737] 29148 --- [currency-exchange] [nio-8000-exec-1] [f69c48f1aa5fcb294b8216ccb70dba32-919bed571b16f737] c.a.m.c.CurrencyExchangeController       : retrieveExchangeValue called with USD to INR
		logger.info("retrieveExchangeValue called with {} to {}", from , to);
		CurrencyExchange currencyExchange = repo.findByFromAndTo(from, to);
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;

	}

}
