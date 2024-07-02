package pkg24;

public class WebAutomation extends Automation1
{
	public void m1()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) 
	{
		WebAutomation ob=new WebAutomation();
		ob.method1();
		ob.m1();
	}
}
