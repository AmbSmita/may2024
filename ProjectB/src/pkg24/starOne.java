package pkg24;

public class starOne {
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i=i+1) //outer loop for rows
		{
			for(int j=1;j<=i;j=j+1)//inner loop for columns
			{
				System.out.print("*");
			}
			System.out.println(); //next line
		}
	}

}
