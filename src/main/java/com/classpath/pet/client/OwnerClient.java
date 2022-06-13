package com.classpath.pet.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.AbstractApplicationEventMulticaster;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classpath.pet.model.Owner;
import com.classpath.pet.repository.OwnerRepository;
import com.classpath.pet.service.OwnerService;

public class OwnerClient {
	
	public static void main(String[] args) {
		 
		//creating the objects and performing the dependency injection
		/*
		 * this is done automatically by Spring framework
		 * OwnerRepository ownerRepository = new OwnerRepository(); OwnerService
		 * ownerService = new OwnerService(ownerRepository);
		 */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml"); 
		
		OwnerService ownerService = applicationContext.getBean("ownerService", OwnerService.class);
		
		Owner owner = new Owner("Ramesh", "ramesh@gmail.com", LocalDate.of(1985, 5, 25));
		
		
		Owner savedOwner = ownerService.saveOwner(owner);
		System.out.println("Saved owner :: "+ savedOwner );
		
		
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
