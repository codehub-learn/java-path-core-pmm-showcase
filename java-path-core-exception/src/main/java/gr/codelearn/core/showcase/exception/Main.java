package gr.codelearn.core.showcase.exception;

import gr.codelearn.core.showcase.exception.exception.BusinessException;
import gr.codelearn.core.showcase.exception.exception.NumberBelowZero;
import gr.codelearn.core.showcase.exception.exception.NumberIsZero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//checkedException();
		//uncheckedException();
		/*
		boolean failure;
		do {
			String answer = readUserInput();
			try {
				parseToInt(answer);
				failure = false;
			} catch (NumberFormatException e){
				System.out.println(e.getMessage());
				failure = true;
			}
		} while (failure);


		System.out.println(uncheckedFinallyException());

		forClient(1, 2);
		try {
			final int parsedResult = Integer.parseInt("5");
		} catch (NumberFormatException e) {
			System.out.println("your input was wrong");
		}

		try {
			getFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		try {
			final int number = insertNumber(-4);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int insertNumber(int number) throws BusinessException {
		if (number < 0) {
			throw new NumberBelowZero("The number was lower than 0");
		} else if (number == 0) {
			throw new NumberIsZero("The number was 0");
		}
		return number;
	}

	private static void getFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("fileName");
	}

	private static void checkedException() {
		String fileName = "Ioannis";
		if (fileName != null) {
			try (FileReader fileReader = new FileReader(fileName)) {
				System.out.println("hello its me");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void uncheckedException() {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(" an error happened");
		}
		System.out.println("test");
	}

	private static void forClient(int n1, int n2) throws ArithmeticException {
		int result = n1 / n2;
	}

	private static int uncheckedFinallyException() {
		try {
			int result = 10 / 0;
			System.out.println(result);
			return result;
		} catch (ArithmeticException e) {
			System.out.println(" an error happened");
		} finally {
			System.out.println("finally");
		}
		return -1;
	}

	private static void parseToInt(String answer) throws NumberFormatException {
		try {
			System.out.println("Trying to convert the answer to a number...");
			Integer.parseInt(answer);
			System.out.println("success!");
		} catch (NumberFormatException e) {
			System.out.println("failure!");
			System.out.println(e.getMessage());
			throw new NumberFormatException("number was wrong");
		}
	}

	private static String readUserInput() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please input a number");
			String answer = sc.nextLine();
			System.out.println("Your answer was: " + answer);
			return answer;
		}
	}
}
