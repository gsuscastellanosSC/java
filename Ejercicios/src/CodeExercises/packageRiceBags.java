package CodeExercises;

public class packageRiceBags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(packageRice(2,1,5));
		System.out.println(packageRice(2, 1, 5));
	}
	public static boolean packageRice(Integer big, Integer small, Integer goal) {
		boolean result = false;
		if (big * 5 >= goal) {
		    if (small >= goal % 5)
		        result = true;
		} else {
		    if (small >= (goal - big) * 5) {
		        result = true;
		    }
		}
		return result;
	}
}
