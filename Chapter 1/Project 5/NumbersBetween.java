/*
	Author Information
	------------------
	Jeremy Koepke
	June 12, 2017
	www.JeremyKoepke.com

	Project Information
	-------------------
	Java Project Series
	Chapter 1 Project 5
	https://github.com/JK-Designs/Java-Exercises
*/

import java.util.Scanner;

public class NumbersBetween
{
	public static void main(String[] args)
	{
		System.out.println("NUMBER BETWEEN CALCULATOR");
		System.out.print("Enter two numbers: ");

		int n1, n2, count;

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();

		count = (n1 - n2) + 1;

		System.out.println("Between " + n1 + " and " + n2 + " are " + count + " digits.");
	}
}