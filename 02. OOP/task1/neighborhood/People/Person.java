package neighborhood.People;

import neighborhood.Common.Language;

public class Person {
	protected String name;
	private int age;
	private Language[] language;

	public Person(String name, int age, Language[] language) {
		this.name = name;
		this.setAge(age);
		this.setLanguage(language);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Language[] getLanguage() {
		return language;
	}

	public void setLanguage(Language[] language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return this.name;
	}
}