package codeExercises;

public class EvenFibonacciSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(evenFibonacciSum(1));
		
	}
	public static Integer evenFibonacciSum(Integer n) {
		int previousFibonacci = 1;
		int currentFibonacci = 2;
		int evenFibonacciSum = 0;
		do {
		    if (currentFibonacci % 2 == 0) {
		        evenFibonacciSum += currentFibonacci;
		    }
		    int newFibonacci = currentFibonacci + previousFibonacci;
		    previousFibonacci = currentFibonacci;
		    currentFibonacci = newFibonacci;
		} while (currentFibonacci < n);
		return evenFibonacciSum;
		 
	}

}
