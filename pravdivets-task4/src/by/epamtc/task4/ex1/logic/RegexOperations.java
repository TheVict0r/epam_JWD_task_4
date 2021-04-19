package by.epamtc.task4.ex1.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOperations {
	
	//--1- В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		//*******Этот метод ещё не готов****************
		if(text == null) {
			//throw new NullStringException(text);
			//пока не реализовано
		}
		if(k <= 0 ) {
			//throw new IncorrectStepException("Step can't be less than zero");
			//пока не реализовано
		}
		
		Pattern patternSpace = Pattern.compile("\\s");
		String[] array = patternSpace.split(text);
		

		StringBuilder builder = new StringBuilder();
		
		for (String word : array) {
			
		}

		//String result = new String(builder);
		String result = "*******Ещё не готово****************";
		
		return result;
	}

	//+2-В тексте после буквы Р, если она не последняя в слове, 
	//ошибочно напечатана буква А вместо О. Внести исправления в текст. 
	public static String fixAtoO(String text) {
		if(text == null) {
			//throw new NullStringException(text);
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
	
	//+3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaceByLength(String text, int wordLength, String substring) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}

		if (substring == null) {
			// throw new NullStringException(substring);
			// пока не реализовано
		}

		if (wordLength <= 0) {
			// throw new IncorrectLengthException("Length can't be less than zero");
			// пока не реализовано
		}

		Pattern patternSpace = Pattern.compile("\\s");
		String[] array = patternSpace.split(text);
		
		String regex = "\\W{" + wordLength + "}";
		
		StringBuilder builder = new StringBuilder();
		for (String word : array) {
			if(Pattern.matches(regex, word)) {
				word = substring;
			}
			builder.append(word).append(" ");
		}
		
		String result = new String(builder);
		
		return result;
	}
	
	//+4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
		if(text == null) {
			//throw new NullStringException(text);
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
	
	//+5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}

		if (wordLength <= 0) {
			// throw new IncorrectLengthException("Length can't be less than zero");
			// пока не реализовано
		}

		Pattern patternSpace = Pattern.compile("\\s");
		String[] array = patternSpace.split(text);
		
		String regex = "[БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]{1}\\W{" + (wordLength - 1) + "}";

		StringBuilder builder = new StringBuilder();
		
		for (String word : array) {
			if(Pattern.matches(regex, word)) {
				word = "";
			}
			builder.append(word).append(" ");
		}
		
		String result; 
		result = new String(builder).replaceAll("\\s{2,}", " ");
		
		return result;
	}
	
	
}
