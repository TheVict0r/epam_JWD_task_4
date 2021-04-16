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
		
		if(k > text.length()) {
			return text;
		}

	
		return null;
	}

	
	//+4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
		if(text == null) {
			//throw new NullStringException(string);
			//пока не реализовано
		}
		Pattern pattern = Pattern.compile("\\p{Punct}|\\d");
		Matcher matcher = pattern.matcher(text);
		
		String result = "";
		result = matcher.replaceAll("");
		
		return result;
	}
	
	
	
	
}
