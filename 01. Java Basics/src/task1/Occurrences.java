// Create a Java function that takes as input an array of integers 
// and returns another array of integers where the N-th element 
// contains element of the input array and the N+1-th element 
// contains the number of occurrences of this element.
// For example, for input array [23, 1, 17, 1, 0, 23, 23], 
// the output array should be [23, 3, 1, 2, 17, 1, 0, 1].

package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Occurrences {
	public static void main(String[] args) {
		System.out.println("Enter a numbers, separated by space:");

		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		in.close();

		List<Integer> numbersToProcess = new ArrayList<Integer>();
		for (String number : input) {
			numbersToProcess.add(Integer.parseInt(number));
		}

		System.out.println(CalcOccurrences(numbersToProcess));
	}

	private static List<Integer> CalcOccurrences(List<Integer> numbers) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			int currentNum = numbers.get(i);
			int count = 1;
			for (int j = i + 1; j < numbers.size(); j++) {
				if (currentNum == numbers.get(j)) {
					numbers.remove(j);
					j--;
					count++;
				}
			}

			result.add(currentNum);
			result.add(count);
			count = 1;
		}

		return result;
	}
}