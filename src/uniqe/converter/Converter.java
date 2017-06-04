package uniqe.converter;

public class Converter {

	double value;

	public Converter(double value1) {
		this.value = value1;
	}

	public void kilogramsToPounds() {

		System.out.printf(value + " Kilograms is: %.4f", (value * 2.20458554));
		System.out.println(" Pounds");

	}

	public void PoundsToKilograms() {

		System.out.printf(value + " Pounds is: %.4f", (value * 0.4536));
		System.out.println(" Kilograms");

	}

	public void centimetersToInch() {
		System.out.printf("%.4f Centimeters is: %.4f Inches", value, (value / 2.54));
	}

	public void inchToCentimeters() {
		System.out.printf("%.4f Inches is: %.4f Centimeters", value, (value * 2.54));
	}

	public void celziusToFahrenheit() {
		System.out.printf("%.4f degree Celsius is: %.4f degrees Fahrenheit", value, (value * 33.8));

	}

	public void fahrenheitToCelzius() {
		System.out.printf("%.4f degree Fahrenheit is: %.4f degrees Celsius", value, (value/33.8));
	}

}
