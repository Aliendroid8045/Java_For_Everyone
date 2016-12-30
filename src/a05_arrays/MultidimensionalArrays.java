package a05_arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
// This is primarily used when we want to read data from xl or any two dimensional data.		

		int [][] table = {{1,3,89}, 
				                    {5,23,786,887}, 
				                    {44,76,98} };
		
		// values can be printed as value[rows][columns]
		//System.out.println(table[1][2]);
		//here program will check the for condition and if it satisfies it will go within the for loop.
		for(int rows =0; rows < table.length; rows++){
			//within the for loop there is another for loop now again program will check the condition if it satisfies it will iterate the loop till 
			//condition is satisfied and loop control will go to the main for loop.
			for (int column =0; column < table[rows].length; column++){
				
				
				System.out.print(table[rows][column]+ "\t");
				
			}
			System.out.println();
			
		}
	}

}
