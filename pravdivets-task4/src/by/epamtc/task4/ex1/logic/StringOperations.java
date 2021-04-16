package by.epamtc.task4.ex1.logic;

public class StringOperations {
	
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
		
		String result = "";
		
		for(int i = k - 1; i < text.length(); i += k) {
			char chSource = text.charAt(i);
			//result = string.
		}
		
		
		return result;
	}
	
	
	//+3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaseByLength(String text, int wordLength, String substring) {
		
		if (text == null) {
			// throw new NullStringException(string);
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
	
	//Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		if (text == null) {
			// throw new NullStringException(string);
			//пока не реализовано
		}
		if(wordLength <= 0) {
			//throw new IncorrectLengthException("Length can't be less than zero");
			//пока не реализовано
		}

		String result = "";
		
		String consonant = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ";
		
		String[] array = text.split(" ");
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() == wordLength) {
				for(int j = 0; j < consonant.length(); j++) {
					if(array[i].charAt(0) == consonant.charAt(j)) {
						array[i] = "";
					}
				}
				
			}
			result = result.concat(array[i]).concat(" ");
		}
		return result;
	}
	
	
}
