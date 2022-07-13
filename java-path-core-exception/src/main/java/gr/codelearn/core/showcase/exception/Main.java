package gr.codelearn.core.showcase.exception;

import gr.codelearn.core.showcase.exception.exception.BusinessException;
import gr.codelearn.core.showcase.exception.exception.NumberBelowZero;
import gr.codelearn.core.showcase.exception.exception.NumberIsZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		//checkedException();
		//uncheckedException();
		getIntegerFromUser();
		/*
		logger.info("{}", uncheckedFinallyException());

		forClient(1, 2);
		try {
			final int parsedResult = Integer.parseInt("5");
		} catch (NumberFormatException e) {
			logger.error(""your input was wrong");
		}

		try {
			getFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			final int number = insertNumber(-4);
		} catch (BusinessException e) {
			logger.error("{}", e.getMessage());
		}
		*/
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
				logger.info("hello its me");
			} catch (IOException e) {
				logger.error("{}", e.getMessage());
			}
		}
	}

	private static void uncheckedException() {
		try {
			int result = 10 / 0;
			logger.info("{}", result);
		} catch (ArithmeticException e) {
			logger.error("an error happened");
		}
		logger.info("test");
	}

	private static void forClient(int n1, int n2) throws ArithmeticException {
		int result = n1 / n2;
	}

	private static int uncheckedFinallyException() {
		try {
			int result = 10 / 0;
			logger.info("{}", result);
			return result;
		} catch (ArithmeticException e) {
			logger.error("an error happened");
		} finally {
			logger.info("finally");
		}
		return -1;
	}

	private static void getIntegerFromUser(){


		boolean failure;
		//https://stackoverflow.com/a/58026671, read this answer, should help you understand what is probably going
		// on here
		Scanner sc = new Scanner(System.in);
		do {
			try {
				String answer = readUserInput(sc);
				parseToInt(answer);
				failure = false;
			} catch (NumberFormatException e) {
				logger.error("{}", e.getMessage());
				failure = true;
			}
		} while (failure);
		sc.close();
	}

	private static void parseToInt(String answer) throws NumberFormatException {
		try {
			logger.info("Trying to convert the answer to a number...");
			Integer.parseInt(answer);
			logger.info("success!");
		} catch (NumberFormatException e) {
			logger.info("failure!");
			logger.error(e.getMessage());
			throw new NumberFormatException("number was not a number");
		}
	}

	private static String readUserInput(Scanner sc) {
		logger.info("Please input a number");
		String answer = sc.nextLine();
		logger.info("Your answer was: {}", answer);
		return answer;
	}
}
