package sumit.springframework.sfgpetclinic.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sumit.springframework.sfgpetclinic.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller  = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
	
		System.out.println(controller.getGreeting());
	}

}
