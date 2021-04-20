package by.epamtc.task4.ex1.logic;

public class StringOperations {

	static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ абвгдеёжзийклмнопрстуфхцчшщъыьэюяABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static final String CONSONANTS = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщBCDFGJKLMNPQSTVXZHRWYbcdfgjklmnpqstvxzhrwy";
	
	// 1- В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		Check.textAndLengthCheck(text, k);

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
	
	// 2-В тексте после буквы Р, если она не последняя в слове,
	// ошибочно напечатана буква А вместо О. Внести исправления в текст.
	public static String fixAtoO(String text) {
			Check.textCheck(text);

			//кириллица
			text = text.replaceAll("ра", "ро");
			text = text.replaceAll("Ра", "Ро");
			
		return text;
	}

	
	//3-В тексте слова заданной длины заменить указанной подстрокой, 
	//длина которой может не совпадать с длиной слова. 
	public static String replaceByLength(String text, int wordLength, String substring) {

		Check.textAndLengthCheck(text, wordLength);
		Check.textCheck(substring);

		String[] array = text.split(" ");
		String result = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() == wordLength) {
				array[i] = substring;
			}

			result = result.concat(array[i]).concat(" ");
		}

		return result;
	}	
	
	//4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами. 
	//Между последовательностями подряд идущих букв оставить хотя бы один пробел. 
	public static String remove(String text) {
	
		Check.textCheck(text);

		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < ALPHABET.length(); j++) {
				if(text.charAt(i) == ALPHABET.charAt(j)) {
					builder.append(text.charAt(i));
				}
			}
		}
		
		String result;
		result = builder.toString();
		
		return result;
	}

	
	
	//5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		Check.textAndLengthCheck(text, wordLength);

		StringBuilder builder = new StringBuilder();
		
		String[] array = text.split(" ");
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() == wordLength) {
				for(int j = 0; j < CONSONANTS.length(); j++) {
					if(array[i].charAt(0) == CONSONANTS.charAt(j)) {
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
