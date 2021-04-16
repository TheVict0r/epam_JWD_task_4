package by.epamtc.task4.ex1.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextDataScanner {

	public static String enterStringFromConsole() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String output = "";
			output = scanner.nextLine();

		return output;
	}
	
	public static String enterStringFromFile(String filePath) throws FileNotFoundException{
		if(filePath == null) {
			//throw new NoFileNameException("No file name")
		}
		
		File file = new File(filePath);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		
		StringBuilder builder = new StringBuilder();
				
		while (scanner.hasNext()) {
			builder.append(scanner.nextLine());
			builder.append(" ");
		}
		
		String output;
		output = builder.toString();
		
		return output;
	}

}
