
public class TriangleClassifier {
	
	public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
        	 return "Invalid triangle: sides must be positive";
        }
        if (side1 == side2 && side2 == side3) {
            return "Equilateral"; // All sides are equal
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles"; // At least two sides are equal
        } else {
            return "Scalene"; // All sides are different
        }
    }
	public static void main(String[] args) {
        int side1 = -5;
        int side2 = -9;
        int side3 = -5;
		
     // Classify the triangle and display the result
        String result = classifyTriangle(side1, side2, side3);
        System.out.println("Triangle is " + result);
    }
}
