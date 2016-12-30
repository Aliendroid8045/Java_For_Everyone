
//Here we have read file from notepad.
package a17_readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFiles {

	public static void main(String[] args) {
		
		File textfile = new File("C:\\Users\\abhishek\\Desktop\\InputTestFileJava.txt");
		
		try {
			Scanner in = new Scanner(textfile);
			int count = 1;
			// Only scanner class has "hasNextLine" method file reader and bufferreader don't have that.
			while(in.hasNextLine()){
				
				String line = in.nextLine();
				System.out.println(count + " : "+line);
				count = count +1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
         
		
		
	}

}
