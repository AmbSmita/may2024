package pkg24;

import java.util.Scanner;

public class conditioninsideloop 
{
public static void main(String[] args) 
{
	System.out.println("Please enter max value");
	Scanner s=new Scanner(System.in);
	int max=s.nextInt();
	if(max<=100)
	{	
	for(int i=0;i<=max;i=i+1)
	{
			System.out.println("value of i "+i);
	}

	}
}
}
