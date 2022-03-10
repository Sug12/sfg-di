package com.springframework.sfggi;

import com.springframework.sfggi.controllers.ConstructorInjectedController;
import com.springframework.sfggi.controllers.I18nController;
import com.springframework.sfggi.controllers.MyController;
import com.springframework.sfggi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgGiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgGiApplication.class, args);
        //run spins up an application context and creates an instance of myController
        //MyController myController = (MyController) ctx.getBean("myController");
        // here we go about asking the spring framework to give us the instance of my controller from the application context
        // we never called the new keyword to create , this is a fundamental form of dependency injection (how an object receives the dependent object)

//		String greeting = myController.sayHello();
//		System.out.println(greeting);


        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        MyController myController1 = (MyController) ctx.getBean("myController");
        System.out.println(myController1.sayHello());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

    }

}
