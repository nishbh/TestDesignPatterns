package com.test.Sep10;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car.Builder builder= new Car.Builder();
		
		builder.manufacturer("Ford").mileage(12333);
		
		Car car= builder.build();
		System.out.println(car.getCountryOfManufacture());
		System.out.println(car.getManufacturer());
		System.out.println(car.getMileage());

	}

}
