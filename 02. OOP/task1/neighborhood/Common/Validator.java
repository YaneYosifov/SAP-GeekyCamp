package neighborhood.Common;

public class Validator {
	public static Boolean InRange(int min, int max, int number) {
		return min <= number && number <= max;
	}
}
