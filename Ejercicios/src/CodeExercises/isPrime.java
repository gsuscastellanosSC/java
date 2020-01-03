package CodeExercises;

import java.lang.reflect.Array;

public class isPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(104683));
	}
	
	public static Boolean isPrime(Integer n) {
		int [] primos = {2, 3, 5, 7, 11};
		boolean res = true;
		int i = 0;
		while (i < primos.length) {
			if(primos[i] == n) {
				i = primos.length;
				res = true;
			}else if (n % primos[i] == 0) {
				res = false;
				i = primos.length;
			}else if(n % primos[i] != 0){
				res = true;
			}
			i++;
		}
		return res;
	} 
}
