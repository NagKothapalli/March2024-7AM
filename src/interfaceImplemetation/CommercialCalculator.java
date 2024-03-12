package interfaceImplemetation;

public class CommercialCalculator implements ArithmeticOperations
{
	public void displyCommercialLOgoLogo()
	{
		System.out.println("Welcome to Casio Commercial");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition from Commercial Calc");
		return a+b;
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

	@Override
	public int addition(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}

}
