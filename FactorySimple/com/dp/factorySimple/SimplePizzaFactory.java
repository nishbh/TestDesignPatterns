package com.dp.factorySimple;


//this is not actual design pattern...but simplest way to create Factory
public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza= null;
		
		if(type.equals("cheese")) {
			pizza= new CheesePizza();
		}
		else if (type.equals("pepperoni")){
			pizza=new PepperoniPizza();
			
		}
		else if(type.equals("Clam")) {
			pizza=new ClamPizza();
			
		}
		
		else if (type.equals("veggie"))
		{
			pizza= new VeggiePizza();
		}
		
		return pizza;
	}

}
