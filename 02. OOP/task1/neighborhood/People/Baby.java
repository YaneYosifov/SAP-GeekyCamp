package neighborhood.People;

import neighborhood.Common.Language;
import neighborhood.Common.Validator;

public class Baby extends Person {
	public Baby(String name, int age, Language[] language) {
		super(name, age, language);
		if (!Validator.InRange(0, 5, this.getAge())) {
			throw new IllegalArgumentException("Baby age should be in range from 0 to 5");
		}
	}
}
