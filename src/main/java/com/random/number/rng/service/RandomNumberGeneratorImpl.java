package com.random.number.rng.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

/**
 * Implementation for RandomNumberGenerator
 * @author Ramesh
 *
 */
@Service
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

	@Override
	public Integer generateRandomNumber() {
		return ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}
