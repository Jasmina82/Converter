package uniqe.converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);

	/*method converts value */
	public static void doConvert(int option) {
		
		double number=numberInput();
		
		Converter convert = new Converter(number);

		switch (option) {

		case 1:
			convert.kilogramsToPounds();
			break;

		case 2:
			convert.PoundsToKilograms();
			break;

		case 3:
			convert.centimetersToInch();
			break;

		case 4:
			convert.inchToCentimeters();
			break;

		case 5:
			convert.celziusToFahrenheit();
			break;

		case 6:
			convert.fahrenheitToCelzius();
			break;

		case 7:
			System.out.println("Visit us again!");
		default:
			Main.printMainMenu();

		}
	}

	private static double numberInput() {
		System.out.println("Enter number value: ");
		double number = 0;
		boolean wrong = true;
		do {
			try {
				
				number = input.nextDouble();
				wrong = false;
				input.nextLine();
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input!Try again:");
				input.nextLine();
			}
		} while (wrong);

		return number;
	}

	
	public static int userChoice()  {
		int option = 0;
		boolean wrong = true;

		do {

			try {
				option = input.nextInt();
				wrong = false;
				input.nextLine();
				if (option < 1 && option > 7) {
					System.out.println("Please choose one of the options:");
					wrong = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input!Try again:");
				input.nextLine();
		
			}
		} while (wrong);
		return option;
	}

	
	}


