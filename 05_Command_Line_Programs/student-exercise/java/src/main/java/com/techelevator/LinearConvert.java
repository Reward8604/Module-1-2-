package com.techelevator;
import java.util.Scanner;
public class LinearConvert 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		String unitToConvert = scanner.nextLine();
		
		int measurement = Integer.parseInt(unitToConvert);
		
		System.out.println("Is this unit in Meter or Feet? ");
		String unitType = scanner.nextLine();
		System.out.println(determineMeasurement(measurement, unitType));
	//ystem.out.println(unitToConvert + unitType + "Is" + determineMeasurement(returnedUnit, unitType) + unitType.toUpperCase().startsWith("m") ? "m": ""
	}
	public static String determineMeasurement(int measurement, String unitType) 
	{
		if(unitType.toUpperCase().startsWith("M"))
		{
			int feet = (int)(measurement * 3.2808399);
			return measurement + "m is "+ feet + " f";
		}
		
		else if (unitType.toUpperCase().startsWith("F"))
		{
			int meters = (int) (measurement * 0.3048);
			return measurement + "f is " + meters + "m ";
		}
		return "wrong information";
	}
	
}
