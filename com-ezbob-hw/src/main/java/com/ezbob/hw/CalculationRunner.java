package com.ezbob.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ezbob.hw.data.CalculatingNumbers;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CalculationRunner implements CommandLineRunner {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void run(String... args) throws Exception {
		CalculatingNumbers calculatingNumbers = objectMapper.readValue(args[0], CalculatingNumbers.class);
		calculatingNumbers.getNumbers().stream().reduce(calculatingNumbers.getOperator()::apply)
				.ifPresent(result -> {
					System.out.println("The result is " + result);
					log.info("The result is " + result);
				});
	}
}