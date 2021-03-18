package com.techelevator;
import java.util.Scanner;
public class TempConvert 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature: ");
		String tempEnter = scanner.nextLine();
		
		int temperature = Integer.parseInt(tempEnter);
		
		
		System.out.println("Is the temperature in Celsius (C) or Farenheit (F)? ");
		String typeOfTemp = scanner.nextLine();
		System.out.println(determinetemperature(temperature, typeOfTemp));
		
		}
	
	public static String determinetemperature(int temperature, String typeOfTemp) 
{
		int tempC = (int) ((temperature - 32) / 1.8);
		int tempF = (int) (temperature * 1.8 + 32);
		
		if(typeOfTemp.toUpperCase().startsWith("F"))
		{
			
			return temperature + " F is " + tempC + " C ";
		}
		
		else 
		{
			
		return temperature + " C is " + tempF + " F ";		}
	
	}

}
