/*
	Author Information
	------------------
	Jeremy Koepke
	June 12, 2017
	www.JeremyKoepke.com

	Project Information
	-------------------
	Java Project Series
	Chapter 1 Project 4
	https://github.com/JK-Designs/Java-Exercises
*/

import java.util.Scanner;

public class BirthdayWizard
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int birthYear, age;

		System.out.println("WELCOME TO THE BIRTHDAY WIZARD");
		System.out.print("Enter the year you were born: ");
		birthYear = keyboard.nextInt();
		System.out.print("Enter the age you wish to calculate the year for: ");
		age = keyboard.nextInt();

		System.out.println("You will turn " + age + " in the year " + (birthYear + age) + ".");
	}
}