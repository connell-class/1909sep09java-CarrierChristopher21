package loopsAndRecursion;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		int x= n*factorial(n-1);
		return x;
	}
}