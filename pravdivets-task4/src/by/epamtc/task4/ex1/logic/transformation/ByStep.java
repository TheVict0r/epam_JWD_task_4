package by.epamtc.task4.ex1.logic.transformation;

public class ByStep implements Transformation{

	@Override
	public String transform(char[] oneWord, int length, String substring, char ch) {
		if (oneWord.length - 1 >= length) {// 1 это пробел в конце слова, его не трогаем
			for (int h = length - 1; h < oneWord.length - 1; h += length) {
				oneWord[h] = ch;
			}
		}

		String result = new String(oneWord);
		return result;
	}

}
