package pkg24;

public class swapusing3rdvariable {
	
	static void swap(int a, int b)
	{		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}
public static void main(String[] args) 
{
	swapusing3rdvariable ob=new swapusing3rdvariable();
	swapusing3rdvariable.swap(43,88);
}
}
