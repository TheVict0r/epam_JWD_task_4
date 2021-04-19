package by.epamtc.task4.ex1.logic;

public class CharArrayOperations {

		// +-1-В каждом слове k-ю букву заменить заданным символом.
		// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		if (text == null) {
			// throw new NullStringException(string);
			//пока не реализовано
		}
		if (k <= 0) {
			// throw new IncorrectStepException("Step can't be less than zero");
			//пока не реализовано
		}

		
		char[] textArray = text.toCharArray();
		char[] bigBuffer = new char[textArray.length];
		//char[] resultArr = new char[textArray.length];
		//int resIdx = 0;
		StringBuilder builder = new StringBuilder();
		int count = 0;
		
		for(int i = 0; i < textArray.length; i++) {
			bigBuffer[count] = textArray[i];
			count++;
			if(textArray[i] == ' ' || i == textArray.length - 1) {
				char[] oneWord = new char[count - 1];
				for(int j = 0; j < oneWord.length; j++) {
					oneWord[j] = bigBuffer[j];
				}
				
				if(oneWord.length >= k) {
					for(int h = k - 1; h < oneWord.length; h += k) {
						oneWord[h] = ch;
					}
				}	
				
				String word = new String(oneWord);
				builder.append(word);
				builder.append(" ");
				count = 0;
				
//					for(int g = resIdx, m = 0; g < (resIdx + oneWord.length); g++, m++) {
//							resultArr[g] = oneWord[m];
//						}
//						resultArr[resIdx + oneWord.length] = ' '; 
//						resIdx += oneWord.length + 1;
//						count = 0;
						
				}
				
			}
		
		
		
		String result = new String(builder);
		
		
		
		return result;
	}
	
	//+2-В тексте после буквы Р, если она не последняя в слове, 
	//ошибочно напечатана буква А вместо О. Внести исправления в текст. 
	public static String fixAtoO(String text) {
		
		if (text == null) {
			// throw new NullStringException(string);
			//пока не реализовано
		}
		
		char[] array = text.toCharArray();

		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] == 'р' && array[i + 1] == 'а') {
				 array[i + 1] = 'о';
			}
			
		}
		
		String result = new String(array);
		return result;
	}
	
	//-3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaseByLength(String text, int wordLength, String substring) {
		
		if (text == null) {
			// throw new NullStringException(string);
			//пока не реализовано
		}
		
		if (substring == null) {
			// throw new NullStringException(substring);
			//пока не реализовано
		}

		if(wordLength <= 0) {
			//throw new IncorrectLengthException("Length can't be less than zero");
			//пока не реализовано
		}
		
		char[] array = text.toCharArray();
		
		int count = 0;
		for(int i = 0; i < array.length - 1; i++) {
			count++;
			if(array[i] == ' ') {
				if(count - 1 == wordLength) {
					count = 0;
				}
			
			
			}
			
			
		}
		
		return null;
		
	}
	
	
	//+4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
		char[] array = text.toCharArray();
		char[] newArray = new char[array.length];
		int idx = 0;
		char[] letters = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', ' ', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < letters.length; j++) {
				if(array[i] == letters[j]) {
					newArray[idx] = array[i];
					idx++;
				}
			}
		}
		 String result = new String(newArray);
		return result;
	}
	
	
	//-5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		
		return null;
	}

	
	
}
