package by.epamtc.task4.ex1.logic;

public class StringOperations {

	// +1- В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}
		if (k <= 0) {
			// throw new IncorrectStepException("Step can't be less than zero");
			// пока не реализовано
		}

		String[] array = text.split(" ");
		StringBuilder resultBuilder = new StringBuilder();

		for (String word : array) {
			if (word.length() >= k) {
				StringBuilder builder = new StringBuilder(word);
				for (int i = k - 1; i < word.length(); i += k) {

					builder.replace(i, i + 1, String.valueOf(ch));

				}
				word = builder.toString();
			} else {
				resultBuilder.append(word).append(" ");
				continue;
			}
			resultBuilder.append(word).append(" ");
		}

		String result;
		result = resultBuilder.toString();

		return result;
	}
	
	// +2-В тексте после буквы Р, если она не последняя в слове,
	// ошибочно напечатана буква А вместо О. Внести исправления в текст.
	public static String fixAtoO(String text) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}
			//кириллица
			text = text.replaceAll("ра", "ро");
			text = text.replaceAll("Ра", "Ро");
			
		return text;
	}

	
	
	
	//+3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaceByLength(String text, int wordLength, String substring) {
		
		if (text == null) {
			// throw new NullStringException(text);
			//пока не реализовано
		}

		if(wordLength <= 0) {
			//throw new IncorrectLengthException("Length can't be less than zero");
			//пока не реализовано
		}

		String result = "";
		
			String[] array = text.split(" ");
			for(int i = 0; i < array.length; i++) {
				if(array[i].length() == wordLength) {
					array[i] = substring;
				}
				
				result = result.concat(array[i]).concat(" ");
			}
			
			return result;
	}
	
	
	//+4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
	
		if (text == null) {
			// throw new NullStringException(text);
			//пока не реализовано
		}

		StringBuilder builder = new StringBuilder();
		String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ абвгдеёжзийклмнопрстуфхцчшщъыьэюяABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < alphabet.length(); j++) {
				if(text.charAt(i) == alphabet.charAt(j)) {
					builder.append(text.charAt(i));
				}
			}
		}
		
		text = builder.toString();
		
		return text;
	}

	
	
	//+5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		if (text == null) {
			// throw new NullStringException(text);
			//пока не реализовано
		}
		if(wordLength <= 0) {
			//throw new IncorrectLengthException("Length can't be less than zero");
			//пока не реализовано
		}

		final String CONSONANT = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщBCDFGJKLMNPQSTVXZHRWYbcdfgjklmnpqstvxzhrwy";
		StringBuilder builder = new StringBuilder();
		
		String[] array = text.split(" ");
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() == wordLength) {
				for(int j = 0; j < CONSONANT.length(); j++) {
					if(array[i].charAt(0) == CONSONANT.charAt(j)) {
						array[i] = " ";
					}
				}
				
			}
			builder.append(array[i]).append(" ");
		}
		
		String result;
		result = builder.toString().replaceAll("  ", "");
		
		return result;
	}
	
	
}
