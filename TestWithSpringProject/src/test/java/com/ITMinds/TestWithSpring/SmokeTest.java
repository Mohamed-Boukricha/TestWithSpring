package com.ITMinds.TestWithSpring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest // This annotation tells Spring Boot to look for a main configuration class (one with @SpringBootApplication, for instance
	public class SmokeTest {

		@Autowired // We inject the controller  before the test methods are run
		private HomeController controller;

		@Test 
		public void contexLoads() throws Exception {
			assertThat(controller).isNotNull();
		}
	}

