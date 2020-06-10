package apllication;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("******* Switch ******* ");
		System.out.print("Enter two values: ");
		double valueA = sc.nextDouble();
		double valueB = sc.nextDouble();
		System.out.println(
				"1 - Sum, 2 - Subtraction, 3 - Division, 4 - Multiplication, 5 - Exponent, 6 - Square root, 7 - Absolute value");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Result: " + (valueA + valueB));
			break;
		case 2:
			System.out.println("Result: " + (valueA - valueB));
			break;
		case 3:
			System.out.println("Result: " + (valueA * valueB));
			break;
		case 4:
			System.out.println("Result: " + (valueA / valueB));
			break;
		case 5:
			System.out.println("Result: " + (Math.pow(valueA, valueB)));
			break;
		case 6:
			System.out.println("Result value A: " + (Math.sqrt(valueA)));
			System.out.println("Result value B: " + (Math.sqrt(valueB)));
			break;
		case 7:
			System.out.println("Result value A: " + (Math.abs(valueA)));
			System.out.println("Result value B: " + (Math.abs(valueB)));
			break;
		default:
			System.out.println("ERRO!!!");
			break;
		}
		sc.close();
	}

}
