package codeExercises;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(1052, 52));

	}
	public static Integer gcd(Integer p, Integer q) {
		if (q == 0) {
		    return p;
		}
		return gcd(q, p % q);
	}
}
