package pkg24;

import java.util.Scanner;

import package1.Assignment1;

public class assignment9thJune3 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter the value of x1 ");
	Scanner m=new Scanner(System.in);
	int x1=m.nextInt();
		
	System.out.println("Enter the value of x2 ");
	int x2=m.nextInt();
		
	System.out.println(" Enter the value of x3 ");
	int x3=m.nextInt();
		
	System.out.println("Enter the value of x4 ");
	int x4=m.nextInt();
	
	System.out.println("Enter the value of x5 ");
	int x5=m.nextInt();
		
	System.out.println("Enter the value of x6 ");
	int x6=m.nextInt();
	
	//(((((x1*x2)+x3)-x4)-x5)/x6)
	Assignment1 t=new Assignment1();
	int Multiresult=t.multi(x1, x2);
	int AddResult=t.add(Multiresult, x3);
	int SubResult=t.sub(AddResult, x4);
	int SubResult1=t.sub(SubResult, x5);
	int Result=SubResult1/x6;
	System.out.println("Result is "+Result);
	}
}
