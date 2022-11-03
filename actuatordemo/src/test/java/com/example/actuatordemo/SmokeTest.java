package com.example.actuatordemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

	// inject HomeController object here
	@Autowired
	private HomeController hc;

	@Autowired
	private SimpleRestController src;

	// define a method to test whether object hc injected successfully or not
	// if object is null, means injection failed
	// if object is not null, means injection succeed
	@Test
	public void testInjection() throws Exception {
		assertThat(hc).isNotNull();
//		assertThat(hc).isNull();
	}

	@Test
	public void testSRC() throws Exception {
		assertThat(src).isNotNull();
	}
	
	// write another test method to call greeting() from HomeController
	// and check the return value
	@Test
	public void testGreeting() throws Exception {
		assertEquals("Hello, World!", hc.greeting());
	}
	
	// write another test to call add() from SimpleRestController
	// and check the return value
	@Test
	public void testAdd() throws Exception {
		assertEquals(10, src.add(2, 8));
		assertEquals(10, src.add(1, 9));
		assertEquals(8, src.add(2, 6));
		assertEquals(10, src.add(5, 5));
	}
}
