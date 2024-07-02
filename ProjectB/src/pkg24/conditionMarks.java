package pkg24;

import java.util.Scanner;

public class conditionMarks 
{
	public void mark()
	{
		System.out.println("Enter value of marks");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if((marks>=0)&&(marks<35))
		{
			System.out.println("Failed...");
		}
		else if((marks>=35)&&(marks<60))
		{
			System.out.println("Pass...");
		}
		else if((marks>=60)&&(marks<80))
		{
			System.out.println("First Division...");
		}
		else if((marks>=80)&&(marks<100))
		{
			System.out.println("Merit...");
		}
	}
	public static void main(String[] args) 
	{
		conditionMarks n=new conditionMarks();
		n.mark();
	}
}
