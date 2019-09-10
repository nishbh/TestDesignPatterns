package com.singleton.dp;

public class SingletonThreadSafeCheck {

	public static void main(String[] args) {

		// first lets create multiple threads...and then check this thing

		Runnable runnable1 = () -> {
			
			Singleton singletonNon1 = Singleton.getInstance();
			System.out.println("testing Non Safe inside thread 1" + singletonNon1);
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
			System.out.println("testing inside thread 1" + singleton);
		};

		Runnable runnable2 = () -> {
			
			Singleton singletonNon1 = Singleton.getInstance();
			System.out.println("testing Non Safe inside thread 2" + singletonNon1);
			
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
			System.out.println("testing inside thread 2" + singleton);
		};

		Runnable runnable3 = () -> {
			
			Singleton singletonNon1 = Singleton.getInstance();
			System.out.println("testing Non Safe inside thread 3" + singletonNon1);
			
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
			System.out.println("testing inside thread 3" + singleton);
		};

		Runnable runnable4 = () -> {
			
			Singleton singletonNon1 = Singleton.getInstance();
			System.out.println("testing Non Safe inside thread 4" + singletonNon1);
			
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
			System.out.println("testing inside thread 4" + singleton);
		};

		Runnable runnable5 = () -> {
			
			
			Singleton singletonNon1 = Singleton.getInstance();
			System.out.println("testing Non Safe inside thread 5" + singletonNon1);
			
			SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
			System.out.println("testing inside thread 5" + singleton);
		};

		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		Thread t3 = new Thread(runnable3);
		Thread t4 = new Thread(runnable4);
		Thread t5 = new Thread(runnable5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("real test begins now");
		
		for( int i= 0; i<100; i++)
		{
			Thread tloop = new Thread(runnable1);
			tloop.start();
		}

	}

}
