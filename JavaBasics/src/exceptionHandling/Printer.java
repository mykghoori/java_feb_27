package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printer {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Class object = new Class();
		File file = new File("Desktop"); //where the file is present
		
		PrintWriter printWriter = new PrintWriter(file); // where the output is to be printed
		printWriter.print("Hello! It is Monday today");
		printWriter.close();
	}

}
