package com.random.number.rng;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test class for API.
 * @author Ramesh
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RngApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	private String getRootUrl() {
		return "http://localhost:8080"+"/api/v1";
	}

	/**
	 * Test to check if API returns not null Integer
	 */
	@Test
	public void test_generate_random_number() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Integer> entity = new HttpEntity<Integer>(null, headers);
		ResponseEntity<Integer> response = restTemplate.exchange(getRootUrl() + "/randomnumber",
				HttpMethod.GET, entity, Integer.class);
		assertNotNull(response.getBody());
	}


}
