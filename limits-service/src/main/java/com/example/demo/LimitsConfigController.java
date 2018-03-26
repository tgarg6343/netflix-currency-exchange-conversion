package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.LimitConfig;


@RestController
public class LimitsConfigController {

	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsFromConfig() {
		return new LimitConfig(configuration.getMaximum(), configuration.getMinimum());
	}
}
