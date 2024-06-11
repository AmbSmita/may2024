package package1;

public class Solution3 
{
	int a,b,c,d,e;
	public Solution3(int x1, int x2,int x3,int x4,int x5) 
	{
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	public static void main(String[] args) 
	{
		Solution3 obj=new Solution3(22, 33, 44, 55, 66);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}
}
