package com.dp.Prototype;

public class PrototypeDemo {
	
	
	public static void main(String[] args) {
		
		Registry registry= new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java...Tesing 1");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie =(Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Movie 2 on Design Pattern...SOLID");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
		
	}

}
