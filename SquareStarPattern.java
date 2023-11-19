public class SquareStarPattern {
	
	public static void printSquareStar(int size) {
        if (size < 2) {
        	 System.out.println("Invalid size. Size must be 2 or greater.");
             return;
         }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            	// Print stars for the first and last rows or columns
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                	 System.out.print("* ");
                } else {
                	System.out.print("  "); // Print spaces for the inner part of the square
                	}
                }
            	System.out.println(); // Move to the next line after each row
                }
            }
	public static void main(String[] args) {
        int squareSize = 5; // Change this value to adjust the size of the square
        
     // Print the square star pattern
        printSquareStar(squareSize);
        }

}
