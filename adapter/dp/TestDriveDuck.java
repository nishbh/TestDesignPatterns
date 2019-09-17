package com.adapter.dp;

public class TestDriveDuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck duck= new MallardDuck();
		Turkey turkey= new WildTurkey();
		Duck turkeyAdapter= new TurkeyAdapter(turkey);
		
		testDuck(duck);
		testDuck(turkeyAdapter);

	}
	
	static void testDuck(Duck duck)
	{
		duck.fly();
		duck.quack();
	}

}
