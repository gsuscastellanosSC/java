package CodeExercises;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("jesus"));
	}
	public static boolean isPalindrome(String word) {
		String compare = word;
		int j = compare.length()-1;
		boolean res = true;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)!=compare.charAt(j)) {
				res = false;
				i = word.length();
			}
			j--;
		}
		return res;
	} 
}
