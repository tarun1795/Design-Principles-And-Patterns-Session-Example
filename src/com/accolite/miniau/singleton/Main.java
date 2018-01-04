package com.accolite.miniau.singleton;

public class Main  extends Thread{

	@Override
	public void run() {
		while(true)
		{
			Singleton s = Singleton.getSingleton();
			System.out.println(s);	
		}
		
	}
	public static void main(String[] args) {
//		Singleton obj = Singleton.getSingleton();
//		System.out.println(obj);
//		obj = null;
//		obj = Singleton.getSingleton();
//		System.out.println(obj);
		
		Main m1 = new Main();
		Main m2 = new Main();
		m1.start();
		m2.start();
		
		
	}
}
