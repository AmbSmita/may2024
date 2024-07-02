package pkg24;

import java.util.Scanner;

public class conditionHandling 
{
	public void checkevenodd()
	{
		System.out.println("Please enter value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0)
		{//body of if block
			System.out.println("Number is even "+a);
		}
		else
		{
			System.out.println("Number is odd "+a);
		}
	}
	public static void main(String[] args) 
	{
		conditionHandling ob=new conditionHandling();
		ob.checkevenodd();
	}
}
