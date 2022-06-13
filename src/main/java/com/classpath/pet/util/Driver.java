package com.classpath.pet.util;

public class Driver {
	
	private String name;
	private int age;
	
	public Driver(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void trip(String source, String destination) {
		System.out.println("Commuting from "+ source + " to "+ destination);
	}

}
