
public class NumClassification {
	// Method to classify the number as Perfect, Abundant, or Deficient
    public static String classifyNumber(int num) {
        if (num <= 0) {
            return "Invalid number";
        }
        int sum = 0;
        
     // Find the sum of factors (aliquot sum) excluding the number itself
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor to the sum if it's a factor of the number
            }
        }
     // Compare the sum to the number for classification
        if (sum == num) {
            return "Perfect";
        } else if (sum > num) {
            return "Abundant";
        } else {
            return "Deficient";
        }
    }    
    public static void main(String[] args) {
        int numberToCheck = 99; // Change this number to check classification
    
     // Classify the number and display the result
        String result = classifyNumber(numberToCheck);
        System.out.println(numberToCheck + " is a " + result + " number.");
    }

}
