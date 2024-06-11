package package1;

public class Assignment2 {
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
		System.out.println("Subtraction is "+z);
		return z;
	}
	public int multi(int a1, int a2)
	{
		int result;
		result=a1*a2;
		System.out.println("Multiplication is "+result);
		return result;
	}
	public void div(int a1, int a2)
	{
		int result;
		result=a1/a2;
		System.out.println("Division is "+result);
	}
	public static void main(String[] args) 
	{
		Assignment2 obj=new Assignment2();
		int multiresult=obj.multi(10,2);
		int subresult=obj.sub(multiresult, 2);
		int sumresult=obj.add(subresult, 2);
		int subresult2=obj.sub(sumresult, 2);
		obj.div(subresult2, 2);
	}
}




