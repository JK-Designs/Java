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

	Project Description
	-------------------
	Write a complete program for the problem
	described in Exercise 9. (Given a person's
	year of birth, the Birthday Wizard can compute
	the year in which the person's nth birthday
	will occur or has occured. Write statements
	that can be used in a Java program to perform
	this computation for the Birthday Wizard.)
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