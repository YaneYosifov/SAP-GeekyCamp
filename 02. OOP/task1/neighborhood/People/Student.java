package neighborhood.People;

import neighborhood.Common.Language;
import neighborhood.Common.Validator;

public class Student extends Person {
	public Student(String name, int age, Language[] language) {
		super(name, age, language);
		if (!Validator.InRange(18, 25, this.getAge())) {
			throw new IllegalArgumentException("Student age should be in range from 18 to 25");
		}
	}
}
