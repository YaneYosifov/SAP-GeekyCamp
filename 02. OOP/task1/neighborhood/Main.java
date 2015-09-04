package neighborhood;

import neighborhood.Common.Language;
import neighborhood.People.Baby;
import neighborhood.People.Pensioner;
import neighborhood.People.Schoolboy;
import neighborhood.People.Student;

public class Main {
	public static void main(String[] args) {
		// TODO: Unit tests
		Neighborhood neighborhood = Neighborhood.getInstance();
		Mayor mayor = Mayor.getInstance();

		Language[] spokenLanguages1 = { Language.BULGARIAN, Language.ENGLISH };
		neighborhood.SignUpPerson(new Baby("Marti", 2, spokenLanguages1));

		Language[] spokenLanguages2 = { Language.BULGARIAN };
		neighborhood.SignUpPerson(new Schoolboy("Yane", 18, spokenLanguages2));

		Language[] spokenLanguages3 = { Language.GERMAN, Language.RUSSIAN, Language.TURKISH };
		neighborhood.SignUpPerson(new Pensioner("Stamat", 78, spokenLanguages3));

		Language[] spokenLanguages4 = { Language.GREEK, Language.ENGLISH };
		neighborhood.SignUpPerson(new Student("Pesho", 25, spokenLanguages4));

		Language[] spokenLanguages5 = { Language.BULGARIAN, Language.ENGLISH };
		neighborhood.SignUpPerson(new Schoolboy("Georgi", 17, spokenLanguages5));

		Language[] spokenLanguages6 = {};
		neighborhood.SignUpPerson(new Baby("Linda", 0, spokenLanguages6));

		Language[] spokenLanguages7 = { Language.ITALIAN, Language.SPANISH, Language.FRENCH, Language.GERMAN };
		neighborhood.SignUpPerson(new Pensioner("Ivan", 90, spokenLanguages7));

		System.out.println("Average age in neighborhood is: " + mayor.CalcAverageAge(neighborhood));
		String languageSpeakingPeople = mayor.GetAllSpeakersOfLanguage(neighborhood, Language.BULGARIAN).toString()
				.replaceAll("^.|.$", "");
		System.out.println("Specific language is spoken by: " + languageSpeakingPeople);
	}
}
