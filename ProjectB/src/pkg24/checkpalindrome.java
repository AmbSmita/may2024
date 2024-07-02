package pkg24;

public class checkpalindrome {
	public static void main(String[] args) {
        int num = 125521;
        checkIfPalindrome(num);
    }

    private static void checkIfPalindrome(int num) {
        int numCopy = num;
        int reversedNumber = 0;
        int remainder;

        while (numCopy != 0) {
            remainder = numCopy % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            numCopy /= 10;
        }

        if (reversedNumber == num) {
            System.out.println("The Number '" + num + "' is a Palindrome Number.");
        } else {
            System.out.println("The Number '" + num + "' is not a Palindrome Number.");
        }
    }


}
