package by.epamtc.task4.ex1.logic.transformation;

public class ByConsonsnt implements Transformation{

	final static char[] CONSONANTS = { 'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х',
			'Ц', 'Ч', 'Ш', 'Щ', 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х',
			'ц', 'ч', 'ш', 'щ', 'B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z', 
			'H', 'R', 'W', 'Y', 'b', 'c', 'd', 'f', 'g', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 
			'h', 'r', 'w', 'y' };

	
	
	@Override
	public String transform(char[] oneWord, int length, String substring, char ch) {

		boolean firstLetterConsonant = false;
		for (int k = 0; k < CONSONANTS.length; k++) {
			if (oneWord[0] == CONSONANTS[k]) {
				firstLetterConsonant = true;
			}
		}

		String result = "";
		
		if (!(oneWord.length - 1 == length && firstLetterConsonant)) {
			result = new String(oneWord);
		}
		
		return result;
	}

}
