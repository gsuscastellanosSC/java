package CodeExercises;

public class isPrimeSolve {
	public static void main(String[] args) {
		System.out.print(isPrime(169));
		
	}
	
	public static Boolean isPrime(Integer i) {
	    int count = 0;
	    int j = i;
	    do {
	        if (i%j==0) {
	            count++;
	        }
	        if (count>1) {
	            break;
	        }
	        j--;
	    } while (j>1);
	    return count==1;
	}
	
}
