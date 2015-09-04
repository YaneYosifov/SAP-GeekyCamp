package neighborhood.People;

import neighborhood.Common.Language;
import neighborhood.Common.Validator;

public class Schoolboy extends Person {
	public Schoolboy(String name, int age, Language[] language) {
		super(name, age, language);
		if (!Validator.InRange(6, 18, this.getAge())) {
			throw new IllegalArgumentException("Schoolboy age should be in range from 6 to 18");
		}
	}
}
