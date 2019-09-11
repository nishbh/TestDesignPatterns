package com.builder.dp;

public class Car {
	
	public static class Builder{
		
		private  int mileage;
		private  String manufacturer;
		private  String originCountry;
		
		public Builder() {
			
		}
		
		public Builder mileage(int mileage) {
			this.mileage=mileage;
			return this;
		}
		public Builder manufacturer(String manufacturer) {
			this.manufacturer=manufacturer;
			return this;
		}
		public Builder originCountry(String originCountry) {
			this.originCountry=originCountry;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
	}
	
	private Car(Builder builder)
	{
		this.manufacturer=builder.manufacturer;
		this.mileage=builder.mileage;
		this.originCountry=builder.originCountry;
	}
	
	private  final int mileage;
	private  final String manufacturer;
	private  final String originCountry;
	public int getMileage() {
		return mileage;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	
	

}
