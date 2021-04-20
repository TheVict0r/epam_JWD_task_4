package by.epamtc.task4.ex1.logic;

public class CharArrayOperations {

	final static char[] ALPHABET = { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
			'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', ' ', 'а', 'б', 'в',
			'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
			'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
			'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	final static char[] CONSONANTS = { 'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х',
			'Ц', 'Ч', 'Ш', 'Щ', 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х',
			'ц', 'ч', 'ш', 'щ', 'B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z', 
			'H', 'R', 'W', 'Y', 'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 
			'h', 'r', 'w', 'y' };

	// 1-В каждом слове k-ю букву заменить заданным символом.
	// Если k больше длины слова, корректировку не выполнять.
	public static String replaceByStep(String text, int k, char ch) {
		Check.textAndLengthCheck(text, k);

		/*
		 * строки с 28 по 53 неплохо бы вынести в отдельный метод (DRY), который будет
		 * использоваться и в других заданиях ниже, но пока не придумал, как это можно
		 * сделать корректно. Возможно через паттерн "Команда". Буду думать.
		 */
		char[] textArray = text.toCharArray();
		char[] bigBuffer = new char[textArray.length];

		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = 0; i < textArray.length; i++) {
			bigBuffer[count] = textArray[i];
			count++;
			if (textArray[i] == ' ' || i == textArray.length - 1) {
				char[] oneWord = new char[count];
				for (int j = 0; j < oneWord.length; j++) {
					oneWord[j] = bigBuffer[j];
				}

				if (oneWord.length - 1 >= k) {
					for (int h = k - 1; h < oneWord.length - 1; h += k) {
						oneWord[h] = ch;
					}
				}

				String word = new String(oneWord);
				builder.append(word);
				count = 0;
			}
		}

		String result = new String(builder);

		return result;
	}

	// 2-В тексте после буквы Р, если она не последняя в слове,
	// ошибочно напечатана буква А вместо О. Внести исправления в текст.
	public static String fixAtoO(String text) {
		Check.textCheck(text);

		char[] array = text.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 'р' && array[i + 1] == 'а') {
				array[i + 1] = 'о';
			}
		}

		String result = new String(array);
		return result;
	}

	// 3-В тексте слова заданной длины заменить указанной подстрокой,
	// длина которой может не совпадать с длиной слова.
	public static String replaceByLength(String text, int wordLength, String substring) {

		Check.textAndLengthCheck(text, wordLength);
		Check.textCheck(substring);
		
		char[] textArray = text.toCharArray();
		char[] bigBuffer = new char[textArray.length];

		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = 0; i < textArray.length; i++) {
			bigBuffer[count] = textArray[i];
			count++;
			if (textArray[i] == ' ' || i == textArray.length - 1) {
				char[] oneWord = new char[count];
				for (int j = 0; j < oneWord.length; j++) {
					oneWord[j] = bigBuffer[j];
				}

				if (oneWord.length - 1 != wordLength) {
					builder.append(oneWord);
				} else {
					builder.append(substring);
					builder.append(" ");
				}
				count = 0;
			}
		}
		String result = new String(builder);
		return result;
	}

	// 4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
	// Между последовательностями подряд идущих букв оставить хотя бы один пробел.
	public static String remove(String text) {
		Check.textCheck(text);

		char[] array = text.toCharArray();
		char[] newArray = new char[array.length];
		int idx = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < ALPHABET.length; j++) {
				if (array[i] == ALPHABET[j]) {
					newArray[idx] = array[i];
					idx++;
				}
			}
		}
		String result = new String(newArray);
		return result;
	}

	// 5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		Check.textAndLengthCheck(text, wordLength);

		char[] textArray = text.toCharArray();
		char[] bigBuffer = new char[textArray.length];

		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = 0; i < textArray.length; i++) {
			bigBuffer[count] = textArray[i];
			count++;
			if (textArray[i] == ' ' || i == textArray.length - 1) {
				char[] oneWord = new char[count];
				for (int j = 0; j < oneWord.length; j++) {
					oneWord[j] = bigBuffer[j];
				}

				boolean firstLetterConsonant = false;
				for (int k = 0; k < CONSONANTS.length; k++) {
					if (oneWord[0] == CONSONANTS[k]) {
						firstLetterConsonant = true;
					}
				}

				if (!(count - 1 == wordLength && firstLetterConsonant)) {
					builder.append(oneWord);
				}

				count = 0;
			}

		}
		String result = new String(builder);
		return result;
	}
}
