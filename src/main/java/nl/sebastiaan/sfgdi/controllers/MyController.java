 package nl.sebastiaan.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import nl.sebastiaan.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		return greetingService.sayGreeting();
	}
	
}
