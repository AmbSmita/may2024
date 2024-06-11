package package1;

public class Arithmetic {
	
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Addition is "+z);
		return z;
	}
	public void multi(int a1, int a2)
	{
		int result;
		result=a1*a2;
		System.out.println("Multiplication is "+result);
	}
	public static void main(String[] args) 
	{
		Arithmetic obj=new Arithmetic();
		int sumresult=obj.add(10, 2);
		int subresult=obj.sub(10, 2);
		obj.multi(sumresult, subresult);
	}
}
