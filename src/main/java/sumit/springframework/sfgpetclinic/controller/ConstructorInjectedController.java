package sumit.springframework.sfgpetclinic.controller;

import sumit.springframework.sfgpetclinic.services.GreetingService;

public class ConstructorInjectedController {

private final GreetingService greetingservice;

public ConstructorInjectedController(GreetingService greetingservice) {
	super();
	this.greetingservice = greetingservice;
}	
public String getGreeting() {
	return greetingservice.sayGreeting();
}
}
