package pkg24;

public class SeleniumAutomation extends WebAutomation
{
	public void Smita()
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) 
	{
		SeleniumAutomation ob=new SeleniumAutomation();
		ob.Smita();
		ob.method1();
		ob.m1();
	}
}
