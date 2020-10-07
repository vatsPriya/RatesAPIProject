package com.ratesapi.service;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;

import com.ratesapi.model.ForeignExchangeRates;

@Service
public class RatesService {
	
	@Autowired
	private RatesAPIRepository repo;
	
	
	/*
	 * @Autowired(required=false) private ForeignExchangeRates foreignExchangeRates;
	 */
	
	public void getRatesInMemory(String symbols) {
		String url = "https://api.ratesapi.io/api/latest?symbols="+symbols ;
		System.out.println(url);
	}
	
	public void storeRatesInMemory(String symbols) {
		String url = "https://api.ratesapi.io/api/latest?symbols="+symbols ;
		System.out.println(url);
		RestTemplate restTemplate = new RestTemplate();
		
		 ResponseEntity<String> response =
				 restTemplate.exchange(url,HttpMethod.GET, null, String.class);
		
		Gson g  = new Gson();
		
		ForeignExchangeRates foreignExchangeRates = g.fromJson( response.getBody(), ForeignExchangeRates.class);
		System.out.println(foreignExchangeRates);
	}

}
