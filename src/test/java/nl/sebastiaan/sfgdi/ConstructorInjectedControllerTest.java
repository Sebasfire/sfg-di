package nl.sebastiaan.sfgdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nl.sebastiaan.sfgdi.controllers.ConstructorInjectedController;
import nl.sebastiaan.sfgdi.services.PropertyGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		
		controller = new ConstructorInjectedController(new PropertyGreetingService());
		
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
		
	}

}
