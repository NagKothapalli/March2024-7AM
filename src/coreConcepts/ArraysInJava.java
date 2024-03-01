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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
