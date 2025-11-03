package calc;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.*;

public class Intern_1_Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Arthmetic world");
		boolean a = true;
		while (a) {
			System.out.println("Enter First the Number :");
			double number1 = scan.nextDouble();
			System.out.println("Enter Second the Number :");
			double number2 = scan.nextDouble();
			Calculator c = new Calculator();
			System.out.println(
					"Enter 1 to add \n2 to subtract \n3 to multiple \n4 to divide the number");
			int number = scan.nextInt();
			if (number == 1) {
				System.out.println("Addition of two number is : " + c.add(number1, number2));
			} else if (number == 2) {
				System.out.println("Subtraction of two number is : " + c.subtract(number1, number2));
			} else if (number == 3) {
				System.out.println("Multiplication of two number is : " + c.multiple(number1, number2));
			} else if (number == 4) {
				System.out.println("Divide of two number is : " + c.divide(number1, number2));
			} else {
				System.out.println("Enter the correct number between 1 to 4");
			}
			System.out.println("If you Want to continue give \"yes\" otherwise give \"exit\" :");
			String process = scan.next();
			if (process.equals("EXIT")) {
				a = false;
			}
			else if(process.equals("YES")) {
				a = true;
			}else {
				System.out.println("sorry we are taking you to the process agains, Plz enter the correct format ");
			}
				
		}
		System.out.println("Thank you, have a great day");

	}
}

// im created two . java file in single file 
//and also we can operate calculator class by creating object for it;
//double is used for precise claculation

class Calculator {
	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiple(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

}

