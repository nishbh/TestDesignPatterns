package com.dp.simple.car;

public class CarFactory {
	
	//this is Factory Method
	public static Car getCar(String type) {
		if(type.equals("ferrari"))
			return new Ferrari();
		else
			return new BMW();
	}

}
