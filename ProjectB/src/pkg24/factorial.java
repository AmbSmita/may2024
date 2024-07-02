package pkg24;

public class factorial {
	public static void main(String[] args) {
        int num = 5; // Change this to your desired number
        long factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
