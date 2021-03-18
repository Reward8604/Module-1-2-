package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary 
{

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		
		// To enter decimal number
		
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String decimalNumber = scanner.nextLine();
		
		int decimal = Integer.parseInt(decimalNumber);
		
		// Counter function
		int[]binaryNum = decimalNumber[i];
		int i = 0;
		
		
		while(decimal > 0) 
		{
		binaryNum[i] = decimal % 2; // Binary remainder
		i = decimal / 2;
		i++;	
		}
		 System.out.print(binaryNum[i]);
	
	}
	
}
