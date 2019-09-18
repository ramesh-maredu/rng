package com.random.number.rng.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.random.number.rng.TimePublisher;
import com.random.number.rng.service.RandomNumberGenerator;

/**
 * Implementation for RandomNumberGeneratorAPI
 * @author Ramesh
 *
 */
@RestController
@RequestMapping("/api/v1")
public class RandomNumberGeneratorAPIImpl implements RandomNumberGeneratorAPI {

	@Autowired
	private RandomNumberGenerator randomNumberGenerator;

	@Autowired
	private TimePublisher timePublisher;

	@Override
	public ResponseEntity<Integer> getRandomNumber(){

		return ResponseEntity.ok().body(randomNumberGenerator.generateRandomNumber());
	}

	@Override
	public ResponseEntity<String> getCurrentTime(){

		String currentTime = timePublisher.getCurrentTime();

		return ResponseEntity.ok().body(currentTime);
	}

}
