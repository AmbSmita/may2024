package pkg24;

public class Second extends first
{
	public Second()
	{
		System.out.println("Child Default Constructor");
	}
	public Second(int i)
	{
		super(22,33);
		System.out.println("Child One Parameterised Constructor");
	}
	public Second(int a, int b)
	{
		System.out.println("Child Two Parameterised Constructor");
	}
	public static void main(String[] args) {
		Second on=new Second(44);
	}
}
