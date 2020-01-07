package CodeExercises;

import java.lang.reflect.Array;


public class isPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(169));
	}
	
	public static Boolean isPrime(Integer n) {
		boolean primo = true;
		int i = 2;
		while (primo && i != n) {
			if (n % i == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}
}
