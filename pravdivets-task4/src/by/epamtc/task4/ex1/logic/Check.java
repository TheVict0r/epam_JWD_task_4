package by.epamtc.task4.ex1.logic;

public class Check {
	public static void textAndLength(String text, int length) {
		text(text);
		length(length);
	}

	public static void text(String text) {
		if (text == null) {
			// throw new NullStringException(text);
			// пока не реализовано
		}
	}

	public static void length(int length) {
		if (length <= 0) {
			// throw new IncorrectLengthException("" + length +" can't be less than zero");
			// пока не реализовано
		}

	}

}
