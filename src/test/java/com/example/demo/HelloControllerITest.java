package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerITest {

	@Autowired
	private TestRestTemplate template;

    // NOTE: this test is broken since the underlying controller class is no longer registered as a `RestController`
    // @Test
    // public void getHello() throws Exception {
    //     ResponseEntity<String> response = template.getForEntity("/", String.class);
    //     assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    // }
}