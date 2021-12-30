package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	//TODO: Write tests!
	@Test
	@DisplayName("Verify greeting message")
	void testHelloMessage() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port, String.class)).contains("");
	}

	//TODO: Unit Testing for Interfaces, Chapter 8, Section 5, "The best practices to testing interfaces are very similar to those of testing inheritance. You want to focus on testing the contract that the interface is supposed to be upholding as opposed to the interface itself."

	@Test
	void contextLoads() {
	}

}
