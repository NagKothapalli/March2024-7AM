package interfaceImplemetation;

public class ScientificCalculator implements ArithmeticOperations
{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition from Scientific Calc");
		return (a+b);
	}

	@Override
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	//logo
	public void displyScientificLogo()
	{
		System.out.println("Welcome to Scientific Calc");
	}
	//trigo
	//
	public void sineValue()
	{
		System.out.println("Sine Value");
	}

	@Override
	public int addition(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}
}
