package a15_casting;
// Here we are going to cast numerical values only.
public class CastingNumericalValues {

	public static void main(String[] args) {
		
		int intValue = 333;
		double doubleValue = 55.88;
		short shortvalue = 5555;
		// now here we will cast values.
		// let's try to store double value in int datatype, here we need to caste it.
		
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//here we can see how .88 got chopped
	}

}
