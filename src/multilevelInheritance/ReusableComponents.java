package multilevelInheritance;

public class ReusableComponents
{
	protected void launchApplication()
	{
		System.out.println("RC : Launch Application  from ReusableComponents");
	}
	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	
	void logoutFromApplication()
	{
		System.out.println("RC : Logout To Application");
	}
	
	void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	
	protected void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	
	void send()
	{
		System.out.println("RC : Send Mail");
	}
	
	void open()
	{
		System.out.println("RC : Open Mail");
	}
	
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	
	void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}

}
