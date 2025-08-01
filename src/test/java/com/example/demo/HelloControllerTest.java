package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

	@Test
	public void sayHello_ShouldReturnHelloWorld() {
		HelloController controller = new HelloController();
		assertThat(controller.sayHello()).isEqualTo("Hello, World!");
	}
}