package com.accolite.miniau.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main implements PropertyChangeListener{

	String name;
	Main(String name)
	{
		this.name = name;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("new Score update to "+name+": "+evt.getNewValue());
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Modal modal = new Modal();
		modal.addChangeListener(new Main("tarun"));
		modal.addChangeListener(new Main("mohan"));
		modal.addChangeListener(new Main("piyush"));
		int score = 0;
		while(true)
		{
			modal.score.setScore(score);
			score+=(int)Math.ceil(Math.random()*3);
			Thread.sleep(2000);
		}
	}	
}
