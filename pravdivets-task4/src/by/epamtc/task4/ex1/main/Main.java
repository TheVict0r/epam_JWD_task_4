package by.epamtc.task4.ex1.main;

import java.io.FileNotFoundException;

import by.epamtc.task4.ex1.logic.CharArrayOperations;
import by.epamtc.task4.ex1.logic.RegexOperations;
import by.epamtc.task4.ex1.logic.StringOperations;
import by.epamtc.task4.ex1.scanner.TextDataScanner;

public class Main {

	public static void main(String[] args) {
		
//		String text = "";
//		
		//text = TextDataScanner.enterStringFromConsole();
//		try {
//			text = TextDataScanner.enterStringFromFile("C:\\file.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(text);
		
		String text = "В начале 2020 года, $ & по данным Белстата, в Белараси праживало 9 410 259 человек, а за двенадцать месяцев количество населения в нашей стране снизилось до 9 349 645 жителей";

		System.out.println(StringOperations.fixAtoO(text));
		
//		System.out.println(StringOperations.deleteСonsonantWords(text, 6));
//		System.out.println(StringOperations.replaceByStep(text, 3, 'Ы'));
		
//		System.out.println(CharArrayOperations.fixAtoO(text));
//
//		System.out.println(RegexOperations.remove(text));
		
		
		
	}

}
