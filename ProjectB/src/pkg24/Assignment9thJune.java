package pkg24;

import java.util.Scanner;

import package1.Assignment1;

public class Assignment9thJune 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter the value of x1 ");
	Scanner m=new Scanner(System.in);
	int x1=m.nextInt();
		
	System.out.println("Enter the value of x2 ");
	int x2=m.nextInt();
		
	System.out.println("Enter the value of x3 ");
	int x3=m.nextInt();
		
	System.out.println("Enter the value of x4 ");
	int x4=m.nextInt();
	
	System.out.println("Enter the value of x5 ");
	int x5=m.nextInt();
		
	System.out.println("Enter the value of x6 ");
	int x6=m.nextInt();
	
	//((((x1+x2)-x3)+x4)*x5)/x6)
	Assignment1 o=new Assignment1();
	int AddResult=o.add(x1, x2);
	int SubResult=o.sub(AddResult, x3);
	int AddResult1=o.add(SubResult, x4);
	int MultiResult=o.multi(AddResult1, x5);
	int Result=MultiResult/x6;
	System.out.println("Result is "+Result);
	}
}
