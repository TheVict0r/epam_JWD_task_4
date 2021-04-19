package by.epamtc.task4.ex1.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOperations {
	
	//--1- В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		if(text == null) {
			//throw new NullStringException(string);
			//пока не реализовано
		}
		if(k <= 0 ) {
			//throw new IncorrectStepException("Step can't be less than zero");
			//пока не реализовано
		}
		

	
		return null;
	}

	//+2-В тексте после буквы Р, если она не последняя в слове, 
	//ошибочно напечатана буква А вместо О. Внести исправления в текст. 
	public static String fixAtoO(String text) {
		if(text == null) {
			//throw new NullStringException(string);
			//пока не реализовано
		}

		Pattern pattern1 = Pattern.compile("ра");
		Matcher matcher1 = pattern1.matcher(text);
		text = matcher1.replaceAll("ро");
		
		Pattern pattern2 = Pattern.compile("Ра");
		Matcher matcher2 = pattern2.matcher(text);
		text = matcher2.replaceAll("Ро");

		return text;
	}
	
	//-3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaseByLength(String text, int wordLength, String substring) {
		
		return null;
	}
	
	//+4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
		if(text == null) {
			//throw new NullStringException(string);
			//пока не реализовано
		}
		
		Pattern pattern = Pattern.compile("[^А-Яа-я]");
		Matcher matcher = pattern.matcher(text);
		
		String result = "";
		result = matcher.replaceAll(" ");
		
		Pattern spacePattern = Pattern.compile("\\s{2,}");
		Matcher spaceMatcher = spacePattern.matcher(result);
		result = spaceMatcher.replaceAll(" ");
		
		return result;
	}
	
	//-5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		
		return null;
	}
	
	
}
