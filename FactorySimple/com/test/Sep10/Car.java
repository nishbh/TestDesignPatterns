package com.test.Sep10;

public class Car {
	public static class Builder {
		private String manufacturer;
		private int mileage;
		private String countryOfManufacture;
		
		public Car build() {
			return new Car(this);
		}
		public Builder manufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}
		public Builder mileage(int mileage) {
			this.mileage = mileage;
			return this;
		}
		public Builder countryOfManufacture(String countryOfManufacture) {
			this.countryOfManufacture = countryOfManufacture;
			return this;
		}
	}
	public Car() {
		
	}
	private Car(Builder builder) {
		this.countryOfManufacture=builder.countryOfManufacture;
		this.mileage=builder.mileage;
		this.manufacturer=builder.manufacturer;		
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getMileage() {
		return mileage;
	}

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	private String manufacturer;
	private int mileage;
	private String countryOfManufacture;
	public Builder builder;

}
