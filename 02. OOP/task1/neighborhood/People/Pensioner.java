package neighborhood.People;

import neighborhood.Common.Language;
import neighborhood.Common.Validator;

public class Pensioner extends Person {
	public Pensioner(String name, int age, Language[] language) {
		super(name, age, language);
		if (!Validator.InRange(60, 200, this.getAge())) {
			throw new IllegalArgumentException("Pensioner age should be in range from 60 to 200");
		}
	}
}
