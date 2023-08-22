package sumit.springframework.sfgpetclinic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import sumit.springframework.sfgpetclinic.controller.I18nController;
import sumit.springframework.sfgpetclinic.controller.MyController;

@SpringBootApplication
//@Configuration
@ComponentScan(basePackages = {"sumit.springframework.sfgpetclinic.controller","sumit.springframework.sfgpetclinic.services"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
