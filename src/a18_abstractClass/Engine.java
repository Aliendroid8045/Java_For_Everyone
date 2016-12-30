package a18_abstractClass;

public abstract class Engine {

	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String type) {
		this.name = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int number) {
		this.id = number;
		}
	
	void intro(){
		
		System.out.println(getName() + " is a Machine and its id is: "+getId());
	}
	public abstract void startEngine();
	public abstract void run();
	public abstract void stopEngine();
	
	void allMethods(){
		
		startEngine();
		run();
		stopEngine();
	}
}
