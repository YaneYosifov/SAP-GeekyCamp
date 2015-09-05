package bullsAndCows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BullsAndCows {
	public static void main(String[] args) {
		List<Integer> numberBuild = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numberBuild.add(i);
		}

		long seed = System.nanoTime();
		Collections.shuffle(numberBuild, new Random(seed));
		numberBuild.subList(0, 6).clear();
		Scanner in = new Scanner(System.in);

		while (true) {
			String input = "";
			do {
				System.out.println("Enter a number with four unique digits: ");
				input = in.nextLine();
			} while (!IsInputValid(input));

			String randomNum = numberBuild.stream().map(Object::toString).collect(Collectors.joining(""));

			int bulls = getBulls(input, randomNum);
			int cows = getCows(input, randomNum);

			if (bulls != 4) {
				System.out.println(input + " --> " + bulls + " bull(s) and " + cows + " cow(s)");
			} else {
				System.out.println(input + " --> 4 bulls! You win!");
				in.close();
				break;
			}

			bulls = 0;
			cows = 0;
		}
	}

	private static int getBulls(String input, String randomNum) {
		int bulls = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == randomNum.charAt(i)) {
				bulls++;
			}
		}

		return bulls;
	}

	private static int getCows(String input, String randomNum) {
		int cows = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(i) != randomNum.charAt(i) && input.charAt(i) == randomNum.charAt(j)) {
					cows++;
				}
			}
		}

		return cows;
	}

	private static boolean IsInputValid(String input) {
		if (tryParseInt(input)) {
			if (input.length() != 4) {
				System.err.println("The number should be a four-digit!");
				return false;
			}

			for (int i = 0; i < input.length() - 1; i++) {
				for (int j = i + 1; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						System.err.println("The number shouldn't contain a repeating digits!");
						return false;
					}
				}
			}
		} else {
			System.err.println("The number should contain only digits!");
			return false;
		}

		return true;
	}

	private static boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}