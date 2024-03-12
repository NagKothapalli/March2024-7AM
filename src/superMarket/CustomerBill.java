package superMarket;

import org.junit.Test;

import interfaceImplemetation.ArithmeticOperations;
import interfaceImplemetation.CommercialCalculator;
import interfaceImplemetation.MiniCalculator;
import interfaceImplemetation.ScientificCalculator;

public class CustomerBill 
{
	
	@Test
	public void generateCustomerBill()
	{
		int prod1 = 32132312;
		int prod2 = 1122334;
		MiniCalculator mCalc = new MiniCalculator();		
		CommercialCalculator cCalc = new CommercialCalculator();
		ScientificCalculator sCalc = new ScientificCalculator();
		
		//ArithmeticOperations aCalc = new ArithmeticOperations();
		//WebDriver  driver = new ChromeDriver();
		ArithmeticOperations aCalc = new MiniCalculator();
		//mCalc.displyMiniLogo();
		//cCalc.displyCommercialLOgoLogo();
		//sCalc.displyCommLogo();
		int bill = aCalc.addition(prod1, prod2);
		//System.out.println("Customer Bill :" + bill);
		//sCalc.sineValue();
		//sCalc.displyScientificLogo();
		
		
	}

}
