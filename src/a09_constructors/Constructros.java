//Here we are looking at constructors.
//constructor runs every time when we initialize object of that class.
// constructor can be called within another constructor.
package a09_constructors;

class Male {

	private String name;
	private int id;

	Male() {

		System.out.println("This is male");
	}

	Male(String name) {

		this.name = name;
		System.out.println(name + " is his name");
	}

	Male(String name, int id) {
    this("kaushik");
       this.name = name;
		this.id = id;
System.out.println("This is the "+name+ "  and his id is " +id);
	}
}

public class Constructros {

	public static void main(String[] args) {

		Male male = new Male("kaushik", 34);
	}

}
