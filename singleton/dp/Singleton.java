package com.singleton.dp;


//this is Regular Singleton Object....Lazy initialized Version...
public class Singleton {
	
	
	private Singleton() {
		
	}
	
	private static Singleton instance=null;
	
	public static Singleton getInstance() {
		//this following line ensures the  object is constructed lazily as required s
		if(instance==null) {
			instance= new Singleton();
		}
		return instance ;
	}

}
