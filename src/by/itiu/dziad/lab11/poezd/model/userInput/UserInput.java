package by.itiu.dziad.lab11.poezd.model.userInput;

import java.util.InputMismatchException;

import org.apache.log4j.BasicConfigurator;
import java.util.Scanner;
import org.apache.log4j.Logger;

import by.itiu.dziad.lab11.poezd.view.ConsolePrinter;

public class UserInput {
	private static Scanner scanner = new Scanner(System.in);
	private final static Logger LOG = Logger.getRootLogger();


	public static double inputDouble(String msg) {
		double res = 0.0;
		try {
			System.out.print(msg);
			res = scanner.nextDouble();
		} catch (InputMismatchException e) {
			LOG.error("Error!!!!!! Wrong data type - " + e);
			
		} catch (Exception e) {
			LOG.error("Error - " + e);
		}
		return res;
	}

	public static String inputString(String msg) {
		System.out.print(msg);
		return scanner.next();
	}

	public static int inputInt(String msg) {
		int res = 0;
		try {
			System.out.print(msg);
			res = scanner.nextInt();
		} catch (InputMismatchException e) {
			LOG.error("Error!!!!!! Wrong data type - " + e);
			
		} catch (Exception e) {
			LOG.error("Error - " + e);
		}
		return res;

	}

	public static int inputInt(String msg, String msg2, int value) {
		int res = 0;
		try {
			System.out.printf(msg, msg2, value);
			return scanner.nextInt();
			
		} catch (InputMismatchException e) {
			LOG.error("Error!!!!!! Wrong data type - " + e);
			
		} catch (Exception e) {
			LOG.error("Error - " + e);
		}
		
		return res;
	}

	public static int inputInt(String msg, int value) {
		int res = 0;
		try {
			System.out.printf(msg, value);
			res = scanner.nextInt();
		} catch (InputMismatchException e) {
			LOG.error("Error!!!!!! Wrong data type - " + e);
			
		} catch (Exception e) {
			LOG.error("Error - " + e);
		}
		return res;

	}

}