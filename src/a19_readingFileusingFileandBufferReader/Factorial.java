package a19_readingFileusingFileandBufferReader;

class FactorialMethod{
	
	void factorialMethod(int value){
		
		while(value !=0){
			
			System.out.println(value);
			value = value -1;
		}
		
	}
	
}

public class Factorial {
    

	public static void main(String[] args) {
		
		FactorialMethod f = new FactorialMethod();
		f.factorialMethod(7);
	}

}
