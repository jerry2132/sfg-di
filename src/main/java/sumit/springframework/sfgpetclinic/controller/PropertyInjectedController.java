package sumit.springframework.sfgpetclinic.controller;

import sumit.springframework.sfgpetclinic.services.GreetingService;

public class PropertyInjectedController {
public GreetingService greetingserrvice;
public String getGreeting() {
	return greetingserrvice.sayGreeting();
}
}
