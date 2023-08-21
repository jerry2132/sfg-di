package sumit.springframework.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import sumit.springframework.sfgpetclinic.services.GreetingService;

public class I18nController {
	  private final GreetingService greetingService;

	    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
	        this.greetingService = greetingService;
	    }

	    public String sayHello(){
	        return greetingService.sayGreeting();
	    }
}
