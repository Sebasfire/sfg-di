package nl.sebastiaan.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nl.sebastiaan.sfgdi.services.PrimaryGreetingService;

class MyControllerTest {

	MyController controller;
	PrimaryGreetingService service;
	
	@BeforeEach
	void setUp() throws Exception {
		service = new PrimaryGreetingService();
		controller = new MyController(service);
	}

	@Test
	void test() {
		System.out.println(controller.sayHello());
	}

}
