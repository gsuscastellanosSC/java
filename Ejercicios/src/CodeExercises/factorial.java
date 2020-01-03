package CodeExercises;

public class factorial {
	public static void main(String[] args) {
		System.out.println(factorialN(10));;
	}
	
	public static Integer factorialN(Integer n) {
		if (n>1) {
			n= n * factorialN(n-1);
		}
		return n;
	}
}
