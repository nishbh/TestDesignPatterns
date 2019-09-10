package com.singleton.dp;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton singleton= Singleton.getInstance();
		
		//Singleton singleton= new Singleton();   
		//this above line will not work...this ensures its Singleton
		
		Singleton singleton2= Singleton.getInstance();
		//both these instance should point to same address of object...as there is only one..
		
		System.out.println(singleton);
		System.out.println(singleton2);
		
		
	}

}
