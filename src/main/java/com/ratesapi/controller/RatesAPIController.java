package com.ratesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratesapi.service.RatesService;

@RestController
public class RatesAPIController {
	@Autowired
	RatesService service;
	
	@GetMapping("/ratesapi/{symbols}")
	public String homeInit(@PathVariable String symbols) {
		service.getRatesInMemory(symbols);
	    return symbols;
	}
	
	@PostMapping("/ratesapi/{symbols}")
	public String loadData(@PathVariable String symbols) {
		service.storeRatesInMemory(symbols);
	    return symbols;
	}

}
