package com.ezbob.hw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class EzbobConfiguration {

	@Bean
	public ObjectMapper createObjectMapper() {
		return new ObjectMapper();
	}
}