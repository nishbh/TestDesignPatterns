package com.dp.factorySimple;

public class VeggiePizza  extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
		System.out.println("prepare Cheese pizza");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		
		System.out.println("bake Cheese pizza");
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut Cheese pizza");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		
		System.out.println("box Cheese pizza");
		
	}
	

}
