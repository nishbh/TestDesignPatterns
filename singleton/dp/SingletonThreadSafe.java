package com.singleton.dp;


//this is Regular Singleton Object....Lazy initialized Version...
public class SingletonThreadSafe {
	
	private SingletonThreadSafe() {	
	}
	
	private static SingletonThreadSafe instance=null;
	
	public static SingletonThreadSafe getInstance() {
		//this following line ensures the  object is constructed lazily as well as Thread Safe
		
		if(instance==null) {
			synchronized(SingletonThreadSafe.class) {
				//this following is called double checking lock for thread safety
				if(instance==null) {
			       instance= new SingletonThreadSafe();
				}
			
			}
		}
		return instance ;
	}

}
