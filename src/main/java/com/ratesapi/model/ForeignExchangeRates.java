package com.ratesapi.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ForeignExchangeRates {
	@Id
	@GeneratedValue
	private int id;
	public String base;
	@ElementCollection 
	public Map<String, BigDecimal> rates;
	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate  date;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBase() {
		return base;
	}


	public void setBase(String base) {
		this.base = base;
	}


	public Map<String, BigDecimal> getRateList() {
		return rates;
	}


	public void setRateList(Map<String, BigDecimal> rates) {
		this.rates = rates;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public ForeignExchangeRates(String base, Map<String, BigDecimal> rates, LocalDate date) {
		this.base = base;
		this.rates = rates;
		this.date = date;
	}
	
	


	public ForeignExchangeRates(int id, String base, Map<String, BigDecimal> rates, LocalDate date) {
		this.id = id;
		this.base = base;
		this.rates = rates;
		this.date = date;
	}


	public ForeignExchangeRates() {
	
	}
	

}
