package com.builder.dp;

public class BuilderDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car.Builder builder= new Car.Builder();
		
		//first time when we are constructing...we dont use the first field...ie manufacturer...and its fine
		Car car1=builder.mileage(100000).originCountry("USA").build();
		System.out.println("Car1  mileage " + car1.getManufacturer());
		System.out.println("Car1  manufacturer " + car1.getMileage());
		System.out.println("Car1  origin Country " + car1.getOriginCountry());
		
		Car car2=builder.manufacturer("Honda").mileage(2000).originCountry("Japan").build();
		System.out.println("Car2  mileage " + car2.getManufacturer());
		System.out.println("Car2  manufacturer " + car2.getMileage());
		System.out.println("Car2  origin Country " + car2.getOriginCountry());

		
	}

}
