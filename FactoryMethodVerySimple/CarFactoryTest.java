package com.dp.simple.car;

public class CarFactoryTest {

	
	public static void main(String[] args) {
		Car car= CarFactory.getCar("BMW");
	    car.drive();
	
	    Car car2= CarFactory.getCar("ferrari");
	    car2.drive();
		
	}
}
