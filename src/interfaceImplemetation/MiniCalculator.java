package interfaceImplemetation;

// class extends class - inheritance

public class MiniCalculator implements ArithmeticOperations
{
	public void displyMiniLogo()
	{
		System.out.println("Welcome to Casio Mini");
	}
	
    public int addition(int x,int y)
    {
    	int sum = x+y;
    	//System.out.println("Sum of two numbers :" + sum);
    	System.out.println("Addition from Mini Calc");
    	return sum;
    }
    
    public void division(int a , int b)
    {
    	int div = a/b;
    	System.out.println("Division of two numbers :" + div);
    }

	@Override
	public void subtraction(int a, int b) {
		int diff = a-b;
    	System.out.println("Difference of two numbers :" + diff);
		
	}

	@Override
	public void multiplication(int a, int b) {
		int prod = a * b;
    	System.out.println("Product of two numbers :" + prod);
		
	}

	//Write a program to find sum of n numbers in the given array 
	@Override
	public int addition(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    

}
