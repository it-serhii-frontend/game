package ua.univer.mvc;

public class View {
	public static final String INPUT_INT_DATA = "Input INT value = ";
	public static final String YOU_WON = "YOU WON";
	public static final String BETWEEN = "The right number is between";
	public static final String OUT_RANGE = "The number is out of range";
	public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
	public static final String OUR_INT = "The right INT value = ";

	public void printMessage(String message) {
		System.out.print(message);
	}

	public void printMessage(String message, int value) {
		System.out.printf("%s %s.\n ", message, value);
	}

	public void printMessage(String message, int min, int max) {
		System.out.printf("%s %s - %s.\n ", message, min, max);
	}

}
