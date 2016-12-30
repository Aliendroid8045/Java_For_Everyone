package a19_readingFileusingFileandBufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Brfr {

	public static void main(String[] args) {
	    File file = new File("C:\\Users\\abhishek\\Desktop\\Myfile.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			
		}
		catch(FileNotFoundException e){
			
			System.out.println("Unable to find file" +file.toString() );
		}
		catch(IOException ex){
			
			System.out.println("Unable to read file: "+file.toString());
		}

		try (BufferedWriter brw = new BufferedWriter(new FileWriter(new File("C:\\Users\\abhishek\\Desktop\\Myfile.txt")))){
			
			brw.write("Hello the line added from java program");
			brw.newLine();
			brw.write("Hello this is a second line");
			
			
			
		}
		 catch (IOException e) {
			System.out.println("Unable to write the file");
		}
	}
	
	

}
