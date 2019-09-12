package com.dp.factorySimple;

public class TestSimpleFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimplePizzaFactory factory= new SimplePizzaFactory();
		PizzaStore store= new PizzaStore(factory);
		store.orderPizza("veggie");
		store.orderPizza("cheese");
		

	}

}
