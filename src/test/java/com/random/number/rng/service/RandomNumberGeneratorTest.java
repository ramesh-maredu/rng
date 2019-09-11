package com.random.number.rng.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RandomNumberGeneratorTest {
	
	private RandomNumberGenerator randomNumberGenerator = new RandomNumberGeneratorImpl();
	
	/**
	 * Test to check if API returns not null integer
	 */
	@Test
	public void test_random_number_not_null() {
		
		Integer randomNumber = randomNumberGenerator.generateRandomNumber();
		assertNotNull(randomNumber);
	}

}
