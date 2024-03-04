package coreConcepts;

import org.junit.Test;

public class ArraysInJava {
	
	
	int empNum;  // 0
	
	int stdNum = 22; // 1 2 3 45  .... 60
	
	//Array : Collection of memory locations with similar data types 
	
	//fixed array 
	
	//Modifier[opt]    DataType     name = "vlue" ;
	
	// Modifier[opt]   DataType[]   name = { v1,v2,v3.....};
	
	public int[]  stdNumbers = {22,54,48,98,52,96,52};
	
	//Declaration , Assigning values , Know length , read values , write values
	
	//java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
	
	@Test
	public void fixedArray_integer()
	{
		//                    0 1  2  3   4 5   6 7
		int[]  stdNumbers = {22,54,48,65,98,52,96,52};
		int len = stdNumbers.length;
		System.out.println("Length of the array : " + len);		
		int val = stdNumbers[0]; // reading
		stdNumbers[2] = 111; // writing 
		System.out.println("First for loop");
		for(int i=0;i<len;i++)
		{
			
			int num = stdNumbers[i]; // i = 0 1 2 3 
			System.out.println(num);
		}
		
		int abc = stdNumbers[8];		
		System.out.println("Second for loop");
		for(int i=0;i<len;i++)
		{
			
			 stdNumbers[i] = 222+i; // i = 0 1 2 3 
			System.out.println(stdNumbers[i]);
		}
		
		
	}
	
	//Dynamic Array 
	
	//Modifier[opt]  DataType[]  name = new DataType[count];
	@Test
	public void dynamicArray_integer()
	{
		int[]  stdNumbers = new int[10];
		int len = stdNumbers.length;
		System.out.println("Length of the array : " + len);		
		int val = stdNumbers[0]; // reading
		//stdNumbers[2] = 111; // writing 
		System.out.println("First for loop");
		for(int i=0;i<len;i++)   // 0 9  10<10  ,    0  9  10<=10
		{	
			//System.out.println(i);
			int num = stdNumbers[i]; // i = 0 1 2 3 
			System.out.println(num);
		}
		
		//int abc = stdNumbers[10];		
		System.out.println("Second for loop");
		for(int i=0;i<len;i++)
		{
			
			 stdNumbers[i] = 222+i; // i = 0 1 2 3 
			System.out.println(stdNumbers[i]);
		}
	}
	
	@Test
	public void findStudentFromTheGroup()
	{
		int[]  students = {3,45,23,67657,34,56,34,67,34,67,34,56,434,675,78,896,5,6765,545};
		boolean result = false;
		System.out.println("Length :" + students.length);
		for(int i=0;i<students.length;i++) // 434
		{
			int s = students[i]; // i =0  1 2 3 4 5 .....
			System.out.println("Iteration :"+ i);
			if(s==4034)
			{
				result = true;
				break;
			}
		}
		
		System.out.println(result);
	}
	@Test
	public void findStudentFromTheGroup_test()
	{
		int[]  group = {3,45,23,67657,34,56,34,67,34,67,34,56,434,675,78,896,5,6765,545};
		findStudentFromTheGroup(group,555);
	}
	
	public void findStudentFromTheGroup(int[] students, int std)
	{
		//int[]  students = {3,45,23,67657,34,56,34,67,34,67,34,56,434,675,78,896,5,6765,545};
		boolean result = false;
		System.out.println("Length :" + students.length);
		for(int i=0;i<students.length;i++) // 434
		{
			int s = students[i]; // i =0  1 2 3 4 5 .....
			System.out.println("Iteration :"+ i);
			if(s==std)
			{
				result = true;
				break;
			}
		}
		
		System.out.println(result);
	}
	
	@Test
	public void findEvenNumbers()
	{
		int[]  group = {3,45,23,67657,34,56,34,67,34,67,34,56,434,675,78,896,5,6765,545};
		int counter = 0;
		for(int i=0;i<group.length;i++)
		{
			if((group[i] % 2) == 0){
				counter = counter + 1;
				System.out.println(group[i]);
				
			}
		}
		
		System.out.println("Count :" + counter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Collections : List , ArrayList , Set ,   - inheritance
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
