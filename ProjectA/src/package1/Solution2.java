package package1;

public class Solution2 
{
	int a,b,c,d,e;
	public void method1(int x1, int x2,int x3,int x4, int x5)
	{
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	public static void main(String[] args) 
	{
		Solution2 obj1=new Solution2();
		obj1.method1(22, 34, 45, 66, 77);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
	}
}
