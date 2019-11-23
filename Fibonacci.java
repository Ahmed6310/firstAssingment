package firstAssingment;

import java.util.Scanner;

public class Fibonacci {
	public void vsalFibonacci() {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter (x) value: ");
		int x = s1.nextInt();
		System.out.println("Enter (y) value: ");
		int y = s1.nextInt();

		System.out.println("\nThe value of x is " + x);
		System.out.println("The valuse of y is " + y);

		int z = x + y;
		System.out.println("The value of z is " + z);
		System.out.println("\nThe fibonacci number are ");

		while (z < 25) {
			x = y;
			y = z;
			z = x + y;
			System.out.println(z);
		}

	}

	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci();
		f1.vsalFibonacci();

	}

}
