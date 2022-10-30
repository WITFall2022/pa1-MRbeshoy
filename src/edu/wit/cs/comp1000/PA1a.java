package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {
 
	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code her
		   
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of inches in whole numbers:");
		int inches = input.nextInt();
		int yards = inches/36;
		inches = inches - (36*yards);
		int feet = inches/12;
		inches = inches - (12*feet);
		System.out.println("Yards:"+yards);
		System.out.println("feet:"+feet);
		System.out.println("inches:"+inches);
	}

}
