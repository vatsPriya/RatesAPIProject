package com.ratesapi.service;

import org.springframework.data.repository.CrudRepository;

import com.ratesapi.model.ForeignExchangeRates;

public interface RatesAPIRepository extends CrudRepository<ForeignExchangeRates, String> {

}
