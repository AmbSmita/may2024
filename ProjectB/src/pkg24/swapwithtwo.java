package pkg24;

public class swapwithtwo {
	
	public void swaap()
	{		
		int a=3;
		int b=6;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		
		// Swapping using XOR bitwise operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + " and b = " + b);
	}
public static void main(String[] args) {
	swapwithtwo n=new swapwithtwo();
	n.swaap();
}
}
