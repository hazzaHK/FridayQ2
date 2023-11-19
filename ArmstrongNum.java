
public class ArmstrongNum {
	
	public static boolean isArmstrong(int number) {
		// Convert the number to a string to find its length
        String strNum = String.valueOf(number);
    
        int length = strNum.length();
        int sum = 0;
        int temp = number;
        
     // Calculate the sum of each digit raised to the power of the number of digits
        while (temp > 0) {
        	 int digit = temp % 10;
             sum += Math.pow(digit, length);
             temp /= 10;
         }
     // Check if the sum is equal to the original number
        return sum == number;
	}
	 public static void main(String[] args) {
		 int num = 378777; // Change this number to check if it's an Armstrong number
		// Check if the number is an Armstrong number and display the result
	        boolean result = isArmstrong(num);
	        if (result) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number."); 
        }
	 }
}
