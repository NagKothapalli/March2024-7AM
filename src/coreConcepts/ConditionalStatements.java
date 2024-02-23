package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	
	//Decision Making statements
	
	int a = 44; 
	int b = 34;
	
	//syntax : if(expression -> boolean : true / false) {   Task    } 
	
	@Test
	public void compareTwoNumbers()
	{
		
		boolean result = (a==b) ;
		System.out.println(result);
		if(result == true)   // = : Assignment Operator  ,  == : Relational Operator , 
		{
			//true
			System.out.println("Both the numbers are equal");
		}
	}
	
	@Test
	public void compareTwoNumbers_ifelse()
	{
		
		boolean result = (a==b) ;
		System.out.println(result);
		if(result == true)   // = : Assignment Operator  ,  == : Relational Operator , 
		{
			//true
			System.out.println("Both the numbers are equal");
		}
		else
		{
			//false
			System.out.println("Both the numbers are not equal");
		}
	}
	
	@Test
	public void compareTwoNumbers_ifelse_test() // Unit Test
	{
		compareTwoNumbers_ifelse(44,44);  // 8/12 * 100 = 66 %
		compareTwoNumbers_ifelse(443,44); //  12/12 * 100 = 100 %
	}
	
	
	public void compareTwoNumbers_ifelse(int num1 , int num2) // Dev code
	{		
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		boolean result = (num1==num2) ;
		System.out.println(result);
		if(result == true)   // = : Assignment Operator  ,  == : Relational Operator , 
		{
			//true
			System.out.println("Both the numbers are equal");
		}
		else
		{
			//false
			System.out.println("Both the numbers are not equal");
		}
	}
	
	//Write a program to read two numbers as inputs ,perform addition if they are equal , do subtraction if a > b , do multiplication if a < b 
	
	public void multipleDecisions(int x , int y) // Dev code
	{
		System.out.println("First Number :" + x);
		System.out.println("Second Number :" + y);
		
		if(x == y)
		{
			 int sum = (x+y); //int =  int + int 
			 System.out.println("Sum of two numbers :" + sum);
		}
		else if(x > y)
		{
			int diff = (x-y);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(x < y)
		{
			int prod = (x * y);
			System.out.println("Product of two numbers :" + prod);
		}
		
	}
	
	@Test
	public void multipleDecisions_test()  // Unit Test
	{
		multipleDecisions(454,454); // 33 %   5/15
		multipleDecisions(54,45); // 33 %   5/15
		multipleDecisions(4,54); // 33 %   5/15
	}
	
	
	
	//Naming convention for member of a class : variable / function
	
	   //Can start with _ , $ , a-z , A-Z 
	   //it should follow camelCasing
	   // No spaces are allowed
	
	//Every class will have a constructor , its name must be same as class name , it is a function , it will follow all rules of a function except camelCasing
	  
	int stdNum;   int StdNum;  int _stdNum;  int $stdNum;
	
	int std1Num;  int stdNum1;
	
	//Write a program to read two numbers as inputs and perform the below task if and only if both inputs are above 10
	
		//Task : perform addition if they are equal , do subtraction if a > b , do multiplication if a < b 
	@Test
	public void nestedIfCondition_test()
	{
		nestedIfCondition(6,8);
		nestedIfCondition(66,8);
		nestedIfCondition(6,85);
		nestedIfCondition(22,22);
		nestedIfCondition(222,22);
		nestedIfCondition(22,42);
	}
	
	public void nestedIfCondition(int num1,int num2)
	{
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		//      T              T       - >     T
		if((num1 > 10) && (num2 > 10))   // Outer condition    // &&  - Logical Operator
		{
			//true
			if(num1 == num2) //Nested if   // Inner condition   // == ,  >   , <  Relational Operators
			{
				 int sum = (num1+num2); //int =  int + int   //   = Assignment Operator
				 System.out.println("Sum of two numbers :" + sum);
			}
			else if(num1 > num2)
			{
				int diff = (num1-num2);  // + , - , * : Arithmetic Operators
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(num1 < num2)
			{
				int prod = (num1 * num2);
				System.out.println("Product of two numbers :" + prod);
			}			
		}
		else
		{
			//false
			System.out.println("Both Numbers or any one of them might be below 10");
		}
		
	}
	
	//Write a program to find given number is even / odd
	@Test
	public void findEvenNumber_test()
	{
		findEvenNumber(24);
		findEvenNumber(99);
	}
	
	public void findEvenNumber(int input)
	{
		System.out.println("Given Number :" + input);
		// input % 2 = reminder  ->  rem == 0 then even number
		
		if((input % 2) == 0)
		{
			System.out.println("Given Number is EVEN ");
		}
		else
		{
			System.out.println("Given Number is ODD");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
