package com.Springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringaopApplicationTests {

	@Test
	public void mytest() {
		assertThat(10).equals(10);
	}

}
