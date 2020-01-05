package CodeExercises;

public class sumMultiplesofThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(15));
	}
	public static Integer sum(Integer n) {
		Integer ac = 0;
		for (Integer i=1; i<=n; i++) {
			if (i % 3 == 0) {
				ac = i + ac;
			}else if (i % 5 == 0) {
				ac = i + ac;
			}
		}
		return ac;
	}

}
