package com.accolite.miniau.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Modal {

	List<PropertyChangeListener> listeners = new ArrayList<>();
	Score score = new Score();
	class Score
	{
		int score;
		
		public Score(){}
		int getScore(){return score;}
		void setScore(int x){notifyListeners(this, "score", score+"", (score=x)+"");}
	}
	
	private void notifyListeners(Object object,String property,String oldValue,String newValue)
	{
		for(PropertyChangeListener listener:listeners)
			listener.propertyChange(new PropertyChangeEvent(this, "score", oldValue, newValue));
	}
	public void addChangeListener(PropertyChangeListener listener)
	{
		listeners.add(listener);
	}
}
