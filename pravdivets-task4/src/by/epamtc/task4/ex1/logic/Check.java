package by.epamtc.task4.ex1.logic;

public class Check {
	public static void textLengthTransformationCheck(String text, int length, Transformation t) {
		textCheck(text);
		lengthCheck(length);
		transformationCheck(t);
	}

	public static void textAndLengthCheck(String text, int length) {
		textCheck(text);
		lengthCheck(length);
	}
	
	public static void textCheck(String text) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}
	}

	public static void lengthCheck(int length) {
		if (length <= 0) {
			// throw new IncorrectLengthException("" + length +" can't be less than zero");
			// пока не реализовано
		}
	}

	public static void transformationCheck(Transformation t) {
		if(t == null) {
			// throw new NullTransformationException(t);
			// пока не реализовано
		}
	}
	
	
}
