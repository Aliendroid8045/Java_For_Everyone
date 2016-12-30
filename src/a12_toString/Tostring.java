//Here we have used toString Method.
package a12_toString;

class Tester {
	
	private String name;
	private int id;
	
	Tester(String name, int id){
		
		this.name = name;
		this.id = id;
	//	System.out.println(name+id);
	}
	
	
	public String toString(){
		
	
				StringBuilder sb = new StringBuilder();
				sb.append(name).append(id);
				return sb.toString();
	}
}
public class Tostring {

	public static void main(String[] args) {
		
    Tester tester = new Tester("Abhishek", 1);
    System.out.println(tester);
	}
	

}
