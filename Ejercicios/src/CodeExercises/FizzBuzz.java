package CodeExercises;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(3));;
	}

	public static String fizzBuzz(int i) {
		String aux = null;
		if ( i % 3 == 0 && i % 5 != 0) {
			aux = "Fizz";
			
		}else if( i % 5 == 0 && i % 3 != 0 ) {
			aux = "Buzz";
			
		}
		
		if ( i % 3 == 0 && i % 5 == 0 ) {
			aux = "FizzBuzz";
		}

		if(i % 3 != 0 && i % 5 != 0){
			aux = Integer.toString(i);// https://emirodgar.com/pasar-de-int-a-string-y-de-string-a-int-en-java
		}
		
		return aux;
	}
	
}
