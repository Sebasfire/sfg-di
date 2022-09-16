package nl.sebastiaan.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World. I am the king of the services";
	}

	
}
