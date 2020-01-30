package codeExercises;

public class FizzBuzzSolve {
	
	public static void main(String[] args) {
		System.out.print(fizzBuzz(5));
	}
	
	public static String fizzBuzz(int i) {
		String aux = null;
		if ( i % 3 == 0 && i % 5 == 0 ) {
			aux = "FizzBuzz";
		} else if ( i % 3 == 0 ) {
			aux = "Fizz";
		} else if( i % 5 == 0 ) {
			aux = "Buzz";
		} else {
		    aux = Integer.toString(i);
		}
		
		return aux;
	}
}
