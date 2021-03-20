package observer;

public class ObserverMain {

	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		Observer obs1 = new OnlineViewer("Viewer 1");
		Observer obs2 = new OnlineViewer("Viewer 2");
		Observer obs3 = new OnlineViewer("Viewer 3");

		instructor.subscribe(obs1);
		instructor.subscribe(obs2);
		instructor.subscribe(obs3);

		instructor.setInstructor("New Exercise - Push Ups");
		instructor.setInstructor("New Exercise - Squats");
		instructor.setInstructor("New Exercise - Crunches");

	}
}
