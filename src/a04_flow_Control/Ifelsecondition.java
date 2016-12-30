package a04_flow_Control;

public class Ifelsecondition {

	public static void main(String[] args) {
		
// if condition is used to execute program only if it is true.		
		int a =20;
		
		if(a <10) {
			
			System.out.println("It is true ");
		}
		//else is used if 'if condition' is false and we want to run plan B block.
		
		/*we have elseif condition which is used to hop over all the if condition to find true condition
		if non of the conditions are true then it will execute else block*/
		else if(a>15){
			
			System.out.println("this is condition 2");
		}
		else{
			
			System.out.println("It is false");
		}
	}

}
