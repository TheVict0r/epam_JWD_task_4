package by.epamtc.task4.ex1.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOperations {
	
	// 1- В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		Check.textAndLengthCheck(text, k);

		String[] array = convertToStringArray(text);

		StringBuilder builder = new StringBuilder();

		Pattern wordPattern = Pattern.compile("\\W{" + k + "}");

		for (String word : array) {
			if (word.length() >= k) {
				Matcher matcher = wordPattern.matcher(word);
				while (matcher.find()) {
					String newWord = matcher.group();
					StringBuilder wordBuilder = new StringBuilder();
					wordBuilder.append(newWord).delete(newWord.length() - 1, newWord.length()).append(ch);//формируем основную часть слова с добавленным по шагу символом
					builder.append(wordBuilder);
				}
				builder.append(word.substring(word.length() - (word.length() % k))).append(" ");//в случае, если есть окончание, которое короче чем k, добавляем его
			} else {
				builder.append(word).append(" ");
			}
		}

		deleteLastChar(builder);
		
		String result;
		result = builder.toString();
		return result;
	}
	
	//2-В тексте после буквы Р, если она не последняя в слове, 
	//ошибочно напечатана буква А вместо О. Внести исправления в текст. 
	public static String fixAtoO(String text) {
		Check.textCheck(text);

		Pattern pattern1 = Pattern.compile("ра");
		Matcher matcher1 = pattern1.matcher(text);
		text = matcher1.replaceAll("ро");
		
		Pattern pattern2 = Pattern.compile("Ра");
		Matcher matcher2 = pattern2.matcher(text);
		text = matcher2.replaceAll("Ро");

		return text;
	}
	
	//3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaceByLength(String text, int wordLength, String substring) {
		Check.textAndLengthCheck(text, wordLength);
		Check.textCheck(substring);

		String[] array = convertToStringArray(text);
		
		String regex = "\\W{" + wordLength + "}";
		
		StringBuilder builder = new StringBuilder();
		for (String word : array) {
			if(Pattern.matches(regex, word)) {
				word = substring;
			}
			builder.append(word).append(" ");
		}
		
		deleteLastChar(builder);
		
		String result = new String(builder);
		
		return result;
	}
	
	//4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
		Check.textCheck(text);
		
		Pattern alphabet = Pattern.compile("[^А-Яа-яA-Za-z]");
		Matcher matcher = alphabet.matcher(text);
		
		String result = "";
		result = matcher.replaceAll(" ");
		
		Pattern spacePattern = Pattern.compile("\\s{2,}");
		Matcher spaceMatcher = spacePattern.matcher(result);
		result = spaceMatcher.replaceAll(" ");
		
		return result;
	}
	
	//5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		Check.textAndLengthCheck(text, wordLength);

		String[] array = convertToStringArray(text);
		
		String regex = "[БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщBCDFGJKLMNPQSTVXZHRWYbcdfgjklmnpqstvxzhrwy]{1}\\W{" + (wordLength - 1) + "}";

		StringBuilder builder = new StringBuilder();
		
		for (String word : array) {
			if(Pattern.matches(regex, word)) {
				word = "";
			}
			builder.append(word).append(" ");
		}
		
		deleteLastChar(builder);
		
		String result; 
		result = new String(builder).replaceAll("\\s{2,}", " ");
		
		return result;
	}
	
	public static String[] convertToStringArray(String text) {
		Check.textCheck(text);
		Pattern patternSpace = Pattern.compile("\\s+");
		String[] array = patternSpace.split(text);
		return array;
	}	
	
	public static void deleteLastChar(StringBuilder builder) {
		if (builder == null) {
			//throw new NullStringBuilderException(builder);
			//пока не реализовано
		}
		builder.deleteCharAt(builder.length()-1);
	}
}
