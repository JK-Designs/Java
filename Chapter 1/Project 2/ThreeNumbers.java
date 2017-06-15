/*
	Author Information
	------------------
	Jeremy Koepke
	June 12, 2017
	www.JeremyKoepke.com

	Project Information
	-------------------
	Java Project Series
	Chapter 1 Project 2
	https://github.com/JK-Designs/Java-Exercises

	Problem Description
	-------------------
	Modify the Java program described in Programming
	Project 1 so that it adds three numbers instead
	of two. Compile the program so that you receive
	no compiler error messages. Then run the program.
*/

import java.util.Scanner;

public class ThreeNumbers
{
	public static void main(String[] args)
	{
		System.out.println("Hello out there.");
		System.out.println("I will add three numbers for you.");
		System.out.println("Enter three whole numbers on a line:");

		int n1, n2, n3;

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();

		System.out.println("The sum of those three numbers is");
		System.out.println(n1 + n2 + n3);
	}
}