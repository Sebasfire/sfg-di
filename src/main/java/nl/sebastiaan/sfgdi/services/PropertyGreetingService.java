package nl.sebastiaan.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("propertyGreetingService")
@Service
public class PropertyGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Are you ready?";
	}
	
}
