package by.epamtc.task4.ex1.logic.transformation;

public class ByLength implements Transformation{

	@Override
	public String transform(char[] oneWord, int length, String substring) {
		
		String result;
		
		if (oneWord.length - 1 != length) {
			result = new String(oneWord);
		} else {
			result = substring + " ";
		}

		return result;
	}

}
