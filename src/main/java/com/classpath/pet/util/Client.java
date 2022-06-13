package com.classpath.pet.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Passenger passenger = applicationContext.getBean("passenger", Passenger.class);
		
		Driver driver = passenger.getDriver();
		System.out.println("Name of the driver is "+ driver.getName());

		System.out.println("Age of the driver is "+ driver.getAge());
		passenger.commute("Malleshwaram", "Airport");
	}

}
