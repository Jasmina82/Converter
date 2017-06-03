package uniqe.converter;

public class Converter {

	double value;

	public Converter(double value1) {
		this.value = value1;
	}

	public void kilogramsToPounds() {

		System.out.printf(value + " Kilograms is: %.4f",(value * 2.20458554));
		System.out.println(" Pounds");

	}

	public void PoundsToKilograms() {

		System.out.printf(value + " Pounds is: %.4f",(value * 0.4536));
		System.out.println(" Kilograms");

	}

	public void centimetersToInch() {

	}

	public void inchToCentimeters() {

	}

	public void celziusToFahrenheit() {


	}

	public void fahrenheitToCelzius() {


	}

}
