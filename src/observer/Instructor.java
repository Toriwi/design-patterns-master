package observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Observable {

	private List<Observer> observers;
	private String instructor;

	public Instructor() {
		this.observers = new ArrayList<>();
	}

	public void setInstructor(String newInstructor) {
		this.instructor = newInstructor;
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer onlineViewer) {
		this.observers.add(onlineViewer);
		onlineViewer.setInstructor(this);
	}

	@Override
	public void unsubscribe(Observer onlineViewer) {
		this.observers.remove(onlineViewer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.instructor;
	}

}
