package observer;

public interface Observable {
	void subscribe(Observer onlineViewers);
	void unsubscribe(Observer onlineViewers);
	void notifyObservers();
	String getUpdate();
}
