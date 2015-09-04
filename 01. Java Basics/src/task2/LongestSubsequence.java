// Create a Java function that takes as input a String 
// and returns as integer the number of the longest subsequence 
// of same neighboring characters in the String.
// For example, for input String "abbabcaaaccdcdcdc", 
// the returned value should be 3 as the longest subsequence is "aaa".

package task2;

import java.util.Scanner;

public class LongestSubsequence {
	public static void main(String[] args) {
		System.out.println("Enter a string:");

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();

		System.out.println(CalcLongestSubsequence(input));
	}

	private static int CalcLongestSubsequence(String sequence) {
		int count = 1;
		int maxCount = 1;
		for (int i = 0; i < sequence.length() - 1; i++) {
			if (sequence.charAt(i) == sequence.charAt(i + 1)) {
				count++;
				if (count > maxCount) {
					maxCount++;
				}
			} else {
				count = 1;
			}
		}

		return maxCount;
	}
}
