package sumit.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Mycontroller {

	public String sayHello()
	{
		System.out.println("hello world");
		return "hi folks";
	}
	
}
