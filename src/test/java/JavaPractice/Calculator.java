package JavaPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please insert an action to perform. Add/Division/Substract/Multiplication = ");
		String val = sc.nextLine();
		System.out.print("Input the value of int a = ");
		int a = sc.nextInt();
		System.out.print("Input the value of int b = ");
		int b = sc.nextInt();
		if (val.equalsIgnoreCase("Add")) {

			int output = a + b;
			System.out.println("The sum is  " + output);
		} else if (val.equalsIgnoreCase("Substract")) {
			int output = a - b;
			System.out.println("The Value of Substraction  is  " + output);

		} else if (val.equalsIgnoreCase("Division")) {
			int output = a / b;
			System.out.println("The Value of Division  is  " + output);

		} else if (val.equalsIgnoreCase("Multiplication")) {

			int output = a * b;
			System.out.println("The Value of Division  is  " + output);

		} else {
			System.out.println("Please Enter a Valid Input");
		}

	}
}
