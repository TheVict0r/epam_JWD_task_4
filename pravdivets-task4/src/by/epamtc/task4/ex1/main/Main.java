package by.epamtc.task4.ex1.main;

import java.io.FileNotFoundException;

import by.epamtc.task4.ex1.logic.CharArrayOperations;
import by.epamtc.task4.ex1.logic.RegexOperations;
import by.epamtc.task4.ex1.logic.StringOperations;
import by.epamtc.task4.ex1.scanner.TextDataScanner;

public class Main {

	public static void main(String[] args) {
		
		//text = TextDataScanner.enterStringFromConsole(); //проверял - работает
		
		String text1 = "";
		try {
			text1 = TextDataScanner.enterStringFromFile("./src/by/epamtc/task4/ex1/source/text1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String text2 = "";
		try {
			text2 = TextDataScanner.enterStringFromFile("./src/by/epamtc/task4/ex1/source/text2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String text3 = "";
		try {
			text3 = TextDataScanner.enterStringFromFile("./src/by/epamtc/task4/ex1/source/text3.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//ex1
		System.out.println("ex 1 - String    - " + StringOperations.replaceByStep(text1, 4, 'Ы'));
		System.out.println("ex 1 - CharArray - " + CharArrayOperations.replaceByStep(text1, 4, 'Ы'));
		System.out.println("ex 1 - Regex     - " + RegexOperations.replaceByStep(text1, 4, 'Ы'));
		System.out.println();
		
		//ex2
		System.out.println("ex 2 - String    - " + StringOperations.fixAtoO(text2));
		System.out.println("ex 2 - CharArray - " + CharArrayOperations.fixAtoO(text2));
		System.out.println("ex 2 - Regex     - " + RegexOperations.fixAtoO(text2));
		System.out.println();

		//ex3
		System.out.println("ex 3 - String    - " + StringOperations.replaceByLength(text1, 5, "[цензура]"));
		System.out.println("ex 3 - CharArray - " + CharArrayOperations.replaceByLength(text1, 5, "[цензура]"));
		System.out.println("ex 3 - Regex     - " + RegexOperations.replaceByLength(text1, 5, "[цензура]"));
		System.out.println();

		
		//ex4
		System.out.println("ex 4 - String    - " + StringOperations.remove(text3));
		System.out.println("ex 4 - CharArray - " + CharArrayOperations.remove(text3));
		System.out.println("ex 4 - Regex     - " + RegexOperations.remove(text3));
		System.out.println();

		//ex5
		System.out.println("ex 5 - String    - " + StringOperations.deleteСonsonantWords(text1, 3));
		System.out.println("ex 5 - CharArray - " + CharArrayOperations.deleteСonsonantWords(text1, 3));
		System.out.println("ex 5 - Regex     - " + RegexOperations.deleteСonsonantWords(text1, 3));
		
	}

}
