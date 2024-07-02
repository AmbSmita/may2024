package pkg24;

public class checkamstrong {
	
	    public static void main(String[] args) {
	        int number = 371; // Change this to your desired number
	        String numStr = String.valueOf(number);
	        int n = numStr.length();
	        int result = 0;

	        for (char digit : numStr.toCharArray()) {
	            int digitValue = digit - '0'; // Convert char to int
	            result += Math.pow(digitValue, n); // Cubing each digit
	        }

	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}


