package neighborhood;

import java.util.ArrayList;
import java.util.List;

import neighborhood.Common.Language;
import neighborhood.People.Person;

public class Mayor {
	private static final Mayor instance = new Mayor();
	private List<Person> speakersOfLanguage = new ArrayList<Person>();

	private Mayor() {
	}

	public static Mayor getInstance() {
		return instance;
	}

	public int CalcAverageAge(Neighborhood neighborhood) {
		int ageSum = 0;
		int average = 0;
		for (int i = 0; i < neighborhood.getPeople().size(); i++) {
			ageSum += neighborhood.getPeople().get(i).getAge();
		}

		average = ageSum / neighborhood.getPeople().size();
		return average;
	}

	public List<Person> GetAllSpeakersOfLanguage(Neighborhood neighborhood, Language language) {
		for (int i = 0; i < neighborhood.getPeople().size(); i++) {
			Person currentPerson = neighborhood.getPeople().get(i);
			for (int j = 0; j < currentPerson.getLanguage().length; j++) {
				if (currentPerson.getLanguage()[j] == language) {
					speakersOfLanguage.add(currentPerson);
				}
			}
		}

		return speakersOfLanguage;
	}
}
