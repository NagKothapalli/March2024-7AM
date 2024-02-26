package coreConcepts;

import org.junit.Test;

public class LoopingStatements {
	
	
	@Test
	public void printNumbers() // TestMethod
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	
	//Apply color to the stair case / steps  
	
	//for(int i=1;expression;step size){  Task   }   // As long as the expression gives a true value the loop will be repeated
	
	@Test
	public void applyColorToSteps()
	{
		for(int i=51;i<=100;i=i+1) // 1<20 -> true 2<20->true 3<20->true   .... 19<20 -> true 20<=20 -> true
		{
			// expression - > true
			//Task 
			System.out.println("Apply Color to the Step :" + i);
		}
	}
	
	@Test
	public void applyGreenColorToEvenSteps()
	{
		for(int i=2;i<=100;i=i+2) // 2 4 6 8 10 ......
		{
			// expression - > true
			//Task 
			System.out.println("Apply Green Color to the Even Step :" + i);
		}
	}
	
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int i=1;i<=100;i=i+2) // 1 3 5 7 9 11 ......
		{
			// expression - > true
			//Task 
			System.out.println("Apply Red Color to the Odd Step :" + i);
		}
	}
	
	//*
	//* *
	//* * *
	//* * * *
	
	@Test
	public void printNumbersOfUserChoice() // TestMethod
	{
		
		System.out.println("------------------First FOR Loop");
		for(int i=1;i<=50;i++)
		{			
			System.out.print(i);
		}
		System.out.println("");
		System.out.println("--------------------Second FOR Loop");
		
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		
	}
	
	//Apply color to the 50 floors of the building each floor having 20 steps , each floor should have a different color 
	@Test
	public void applyDifferentColorToEachFloor() // NESTED LOOP
	{ 
		for(int floor=1; floor <=50 ; floor++) //floor = 1   OUTER LOOP
		{
			System.out.println("-----------------I am Applying in Floor :" + floor);
			//Apply color to all steps in the i th floor 
			for(int step=1;step<=20;step++) // INNER LOOP
			{
				System.out.println("Apply color to Step :"+ step);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
