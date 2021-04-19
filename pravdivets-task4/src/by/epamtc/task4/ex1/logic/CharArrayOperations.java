package by.epamtc.task4.ex1.logic;

public class CharArrayOperations {

	// +1-В каждом слове k-ю букву заменить заданным символом.
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

	// +2-В тексте после буквы Р, если она не последняя в слове,
	// ошибочно напечатана буква А вместо О. Внести исправления в текст.
	public static String fixAtoO(String text) {

		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}

		char[] array = text.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 'р' && array[i + 1] == 'а') {
				array[i + 1] = 'о';
			}

		}

		String result = new String(array);
		return result;
	}

	// +3-В тексте слова заданной длины заменить указанной подстрокой,
	// длина которой может не совпадать с длиной слова.
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

				if (count - 1 != wordLength) {
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

	// +4-Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
	// Между последовательностями подряд идущих букв оставить хотя бы один пробел.
	public static String remove(String text) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}

		char[] array = text.toCharArray();
		char[] newArray = new char[array.length];
		int idx = 0;
		char[] letters = { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
				'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', ' ', 'а', 'б', 'в', 'г', 'д',
				'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш',
				'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я' };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (array[i] == letters[j]) {
					newArray[idx] = array[i];
					idx++;
				}
			}
		}
		String result = new String(newArray);
		return result;
	}

	// +5-Из текста удалить все слова заданной длины, начинающиеся на согласную букву
	public static String deleteСonsonantWords(String text, int wordLength) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}

		if (wordLength <= 0) {
			// throw new IncorrectLengthException("Length can't be less than zero");
			// пока не реализовано
		}

		char[] textArray = text.toCharArray();
		char[] bigBuffer = new char[textArray.length];
		final char[] CONSONANT = { 'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х',
				'Ц', 'Ч', 'Ш', 'Щ', 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х',
				'ц', 'ч', 'ш', 'щ' };

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
				for (int k = 0; k < CONSONANT.length; k++) {
					if (oneWord[0] == CONSONANT[k]) {
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
