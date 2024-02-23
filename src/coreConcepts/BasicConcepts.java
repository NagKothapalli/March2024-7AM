package coreConcepts;

//Signature : CLASS , VARIABLE , FUNCTION/METHOD   // Comment line : Java Compiler will ignore the commented lines 

//Signature : CLASS

			//Modifier   class   Name{   //Members : variables / functions    }

//Naming Convention : //Capital letter , no space , no special chars

public class BasicConcepts   
{
	
	//Members : variables / functions
	//Signature : VARIABLE
	
	  //Modifier   DataType  Name  ; - Declaration               Modifier   DataType  Name = value  ;  - Assignment
	
	 //Modifier : Access  , NonAccess
	
			// Access : private , default , public , protected
			// NonAccess :  static , final
	
	//student : number , marks , grade , name ,result
	//Modifier[opt]     DataType     Name     = value  ;
	public static        String    collegeName = "34gfbgh6567@#$55    56" ; //type mismatch
	
	public static  int stdNumber = 22;
	
	private       long  stdNum = 456565654;      // Integer : byte , short , int , long 
	public char stdGrade = 'A';
	
	public boolean stdResult = false;
	
	public double stdMarks = 98;
	
	//Java is case sensitive : a A both are different 
	
	//Signature : Function / Method	   
	
	//Brackets :  [] - square , () - paranthesis   , {  } - curly 
	
		//Modifier[opt]  ReturnType Name(Arguments[opt] ){    body/implementation   }   
	
	
	//main method  -  psvm
	
	public static void main(String[]  args)
	{
		System.out.println("Welcome to Selenium Java");
		//addition();
		addition(44,22);
		//addition(45,262);
		//addition(435,22);
		//int result = addition(445,222,626);
		//System.out.println("My Return value :" + result);
		//subtraction();
		//multiplication();
		//division();
	}
	
	int sum;
	int sum2;
	
	// 0  0 -  no input no output   ,     0 1 , 1 0 , 1 1
	public static void addition()
	{
		System.out.println("This is my addition program ");
		//body
		// c = a+b;		
		int sum = 22 + 44 ;	//local variable		
		System.out.println("Sum of two numbers : sum");
		System.out.println("Sum of two numbers :" + sum);		
	}
	
	//Duplicate function : if the name and the inputs are same then that will be a duplicate
	public static void addition(int a, int b)
	{
		System.out.println("This is my addition program ");
		//body
		int sum = a + b; // local variable
		System.out.println("First Input :" + a);
		System.out.println("Second Input :" + b);
		System.out.println("Sum of two inputs : " + sum);
	}
	
	public static int addition(int a, int b , int c)
	{
		System.out.println("This is my addition program ");
		//body
		
		System.out.println("First Input :" + a);
		System.out.println("Second Input :" + b);
		System.out.println("Third Input :" +c);
		int sum = a + b + c; // local variable
		//System.out.println("Sum of three inputs : " + sum);
		return sum;
	}
	
	public static void addition(int a, int b,int c , int d)
	{
		System.out.println("This is my addition program ");
		//body
		int sum = a + b + c; // local variable
		System.out.println("First Input :" + a);
		System.out.println("Second Input :" + b);
		System.out.println("Second Input :" + b);
		
		System.out.println("Sum of three inputs : " + sum);
		
	}
	
	public static void subtraction()
	{
		System.out.println("This is my subtraction program ");
		//body
		
	}
	
	
	public static void multiplication()
	{
		System.out.println("This is my multiplication program ");
		//body
		
	}
	
	public static void division()
	{
		System.out.println("This is my division program ");
		//body
		
	}
	
	
	
	
	
	
	

}




class Yahoo    // Yahoo.java
{
	
}

class Amazon
{
	
}
