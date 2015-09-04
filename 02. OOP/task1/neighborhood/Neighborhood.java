package neighborhood;

import java.util.ArrayList;
import java.util.List;

import neighborhood.People.Person;

public class Neighborhood {
	private static final Neighborhood instance = new Neighborhood();
	private List<Person> people = new ArrayList<Person>();

	private Neighborhood() {
	}

	public List<Person> getPeople() {
		return people;
	}

	public static Neighborhood getInstance() {
		return instance;
	}

	public void SignUpPerson(Person person) {
		people.add(person);
	}
}
