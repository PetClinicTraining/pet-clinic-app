package com.classpath.pet.util;

public class Passenger {
	
	private Driver driver;
	
	public Passenger(Driver driver) {
		this.driver = driver;
	}
	
	public Driver getDriver() {
		return this.driver;
	}
	
	public void commute(String from, String to) {
		this.driver.trip(from, to);
	}

}
