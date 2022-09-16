package nl.sebastiaan.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("setterGreetingService")
@Service
public class SetterGreeingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Get Set! muahaha";
	}

}
