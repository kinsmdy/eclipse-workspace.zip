
public class Calculator {
    
    public String printSum(int a, int b) {
        int sum = calculateSum(a, b);
        return "The sum is: "+sum;
    }

	private int calculateSum(int a, int b) {
		return a + b;
	}

    public String printMultiplication(int a, int b) {
        int product = calculateProduct(a, b);
        return "The product is: "+product;
    }

	private int calculateProduct(int a, int b) {
		return a * b;
	}
	



}