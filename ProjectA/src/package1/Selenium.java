package package1;

//constructor is like a method
//constructor name and class name will be same
//no need to call, as we create the object it will be called automatically
//no return type

public class Selenium 
{
	public Selenium() 
	{
		// TODO Auto-generated constructor stub
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Selenium(int a) 
	{
		this();
		System.out.println("One parameterised Constructor");
	}
	public Selenium(int a, int b) 
	{
		this(22);
		System.out.println("Two parameterised Constructor");
	}
	public Selenium(int a, int b, int c) 
	{
		System.out.println("Three parameterised Constructor");
	}
	public static void main(String[] args) 
	{
		Selenium obj2=new Selenium(33,22);
	}
}
