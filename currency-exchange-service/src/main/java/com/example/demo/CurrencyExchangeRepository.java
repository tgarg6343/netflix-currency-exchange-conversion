package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long>{

	
	public ExchangeValue findByFromAndTo(String from,String to);
}
