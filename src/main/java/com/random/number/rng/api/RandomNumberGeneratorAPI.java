package com.random.number.rng.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * API to generate random number
 * @author Ramesh
 *
 */
public interface RandomNumberGeneratorAPI {
	
	/**
	 * API to get random number
	 * @return ResponseEntity 
	 * @throws Exception
	 */
	@GetMapping("/randomnumber")
	public ResponseEntity<Integer> getRandomNumber() throws Exception;
	
	/**
	 * API to return current time
	 * @return ResponseEntity
	 * @throws Exception
	 */
	@GetMapping("/currenttime")
	public ResponseEntity<String> getCurrentTime() throws Exception;

}
