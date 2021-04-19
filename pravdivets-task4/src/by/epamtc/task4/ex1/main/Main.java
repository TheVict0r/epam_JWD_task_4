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

		
		//ex1
		String byStep = "Я спрятался в лесу и решил на плоты больше не садиться, раз там расхаживают с фонарями взад и вперед.";
		System.out.println("ex 1 - String -    " + StringOperations.replaceByStep(byStep, 4, 'Ы'));
		System.out.println("ex 1 - CharArray - " + CharArrayOperations.replaceByStep(byStep, 4, 'Ы'));
		System.out.println();
		
		//ex2
		String textAandO = "Карапуз ракета гитара ветер.";
		System.out.println("ex 2 - String -    " + StringOperations.fixAtoO(textAandO));
		System.out.println("ex 2 - CharArray - " + CharArrayOperations.fixAtoO(textAandO));
		System.out.println("ex 2 - Regex -     " + RegexOperations.fixAtoO(textAandO));
		System.out.println();

		//ex3
		String byLength = "Я спрятался в лесу и решил на плоты больше не садиться, раз там расхаживают с фонарями взад и вперед.";
		System.out.println("ex 3 - String -    " + StringOperations.replaceByLength(byLength, 5, "[цензура]"));
		System.out.println("ex 3 - CharArray - " + CharArrayOperations.replaceByLength(byLength, 5, "[цензура]"));
		System.out.println("ex 3 - Regex -     " + RegexOperations.replaceByLength(byLength, 5, "[цензура]"));
		System.out.println();

		
		//ex4
		String forRemove = "Температура воздуха минимальная ночью +1…6°С, максимальная днем +7…13°С, по западу до +15°С.";
		System.out.println("ex 4 - String -    " + StringOperations.remove(forRemove));
		System.out.println("ex 4 - CharArray - " + CharArrayOperations.remove(forRemove));
		System.out.println("ex 4 - Regex -     " + RegexOperations.remove(forRemove));
		System.out.println();

		//ex5
		String consonant = "Я спрятался в лесу и решил на плоты больше не садиться, раз там расхаживают с фонарями взад и вперед.";
		System.out.println("ex 5 - String -    " + StringOperations.deleteСonsonantWords(consonant, 3));
		System.out.println("ex 5 - CharArray - " + CharArrayOperations.deleteСonsonantWords(consonant, 3));
		System.out.println("ex 5 - Regex -     " + RegexOperations.deleteСonsonantWords(consonant, 3));
		

		
		
		
	}

}
