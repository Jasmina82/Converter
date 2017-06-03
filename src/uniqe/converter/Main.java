package uniqe.converter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	startApp();

	}

	/*method that start app*/
	public static void startApp() {
		int option = 0;
		
		while (option != 7) {

			printMainMenu();
			option = Menu.userChoice();	
			Menu.doConvert(option);
		}
	}
	
	public static void printMainMenu() {
		System.out.println("\nC O N V E R T E R " + "\n\n1 --> Kilograms to Pounds" + "\n2 --> Pounds to Kilograms"
				+ "\n3 --> Centimeters to Inch" + "\n4 --> Inch to Centimeters" + "\n5 --> Celzius to Fahrenheit"
				+ "\n6 --> Fahrenheit to Celzius" + "\n7 --> Exit");
		System.out.print("\nEnter number for the option: ");
	}

}
