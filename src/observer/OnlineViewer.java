package observer;

public class OnlineViewer implements Observer {

	private String name;
	private Observable instructor;

	public OnlineViewer(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(this.instructor == null) {
			System.out.println(this.getName() + " has no instructor set");
			return;
		}
		String updatedInstructor = this.instructor.getUpdate();
		System.out.println(this.getName() + " received an update from instructor: " + updatedInstructor);
	}

	@Override
	public void setInstructor(Observable instructor) {
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
