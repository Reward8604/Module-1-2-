package com.techelevator;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// the get Fibonacci's number from user
		System.out.println("Please enter a Fibonacci number: ");
		
		// user input 
		String fibNumber = scanner.nextLine();
		
		
		
		//take the user input and extract and integer from it for the number chosen
		int num = Integer.parseInt(fibNumber);
		
		
		int firstFibNum = 0;
		int secondFibNum = 1;
		int sumOfNum = firstFibNum + secondFibNum;
		
		System.out.println("0, 1 ");
		
		while (firstFibNum + secondFibNum <= num) 
		{
			sumOfNum = firstFibNum + secondFibNum;
			
			System.out.println(sumOfNum);
			
			firstFibNum = secondFibNum;
			
			secondFibNum = sumOfNum;
		}
			
			
		}	
			
	}
		
		
		
	
 

