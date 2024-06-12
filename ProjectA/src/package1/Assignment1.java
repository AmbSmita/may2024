package package1;

public class Assignment1 {
	
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
		Assignment1 obj=new Assignment1();
		int sumresult=obj.add(10, 2);
		int sumresult2=obj.add(sumresult, 2);
		int subresult=obj.sub(sumresult2, 2);
		int multiresult=obj.multi(subresult,2);
		obj.div(multiresult, 2);
		
	}
}


