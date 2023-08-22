package sumit.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;

import sumit.springframework.sfgpetclinic.services.GreetingService;

@Controller
public class MyController {
	 private final GreetingService greetingService;

	    public MyController(GreetingService greetingService) {
	        this.greetingService = greetingService;
	    }

	public String sayHello()
	{
		 return greetingService.sayGreeting();
	}
	
}
