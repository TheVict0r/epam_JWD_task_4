package by.epamtc.task4.ex1.logic;

public class CharArrayOperations {

		// +1-В каждом слове k-ю букву заменить заданным символом.
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

		if (k > text.length()) {
			return text;
		}

		char[] array = text.toCharArray();

		for(int i = k - 1; i < array.length; i += k) {
			array[i] = ch;
		}
		
		String result = new String(array);
		
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
			if(array[i] == 'р' && 
			   array[i + 1] != ' ' && 
			   array[i + 1] == 'а') {
				
				 array[i + 1] = 'о';
			}
			
		}
		
		String result = new String(array);
		return result;
	}
	
	//--3-В тексте слова заданной длины заменить указанной подстрокой, 
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
			
			if(array[i] == ' ') {
				if(count == wordLength)
			
			count++;
			}
			
			
		}
		
		return null;
		
	}
	
	
	//4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	
	
}
