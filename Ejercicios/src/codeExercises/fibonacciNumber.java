package codeExercises;

public class fibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(40));
	}
	public static Integer fibonacci(Integer n) {
		if (n==0 || n==1) {
			return n;
		}else if(n>1) {
			n = fibonacci(n-1)+fibonacci(n-2);
		}
		return n;
	}
}
