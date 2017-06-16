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

	Project Description
	-------------------
	Write a complete program for the problem
	described in Exercise 10. (Write statements
	that can be used in a Java program to read
	two integers and display the number of integers
	that lie between them, including the integers
	themselves. For example, four integers are
	between 3 and 6: 3, 4, 5, and 6.)
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

		if(n1 > n2)
		{
			count = (n1 - n2) + 1;
		}
		else if (n1 < n2)
		{
			count = (n2 - n1) + 1;
		}
		else
		{
			count = 0;
		}

		System.out.println("Between " + n1 + " and " + n2 + " are " + count + " digits.");
	}
}