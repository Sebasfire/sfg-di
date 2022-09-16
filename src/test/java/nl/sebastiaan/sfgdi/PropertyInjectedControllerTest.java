package nl.sebastiaan.sfgdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nl.sebastiaan.sfgdi.controllers.PropertyInjectedController;
import nl.sebastiaan.sfgdi.services.PropertyGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setup() {
		controller = new PropertyInjectedController();
		controller.greetingService = new PropertyGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
