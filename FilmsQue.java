package Questions;

public class FilmsQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Film films;
		Object[] Films = new Object[10];

		films = new Film();
		films.name = "Terminator";
		films.language = "English";
		films.lead_actor = "Arnold";
		films.duration = 10;
		films.category = "Action";
		// Films.add(films);
		Films[0] = films;

		films = new Film();
		films.name = "Terminator 2";
		films.language = "English";
		films.lead_actor = "Arnold";
		films.duration = 20;
		films.category = "Action";
		Films[1] = films;

		films = new Film();
		films.name = "Robot 1";
		films.language = "Tamil";
		films.lead_actor = "Rajini";
		films.duration = 10;
		films.category = "Comedy";
		Films[2] = films;

		films = new Film();
		films.name = "Robot 2";
		films.language = "Tamil";
		films.lead_actor = "Rajini";
		films.duration = 30;
		films.category = "Comedy";
		Films[3] = films;

		int min = 9999999;
		int imin = 0;

		for (int i = 0; i < 4; i++) {
			films = (Film) Films[i];
			if (films.category.equals("Comedy"))
				System.out.println(films.name + " is a Comedy movie");
			if (films.lead_actor.equals("Rajini"))
				System.out.println(films.name + " with lead_actor as Rajini");
		}
		String iminfilm = "";
		for (int i = 0; i < 4; i++) {
			films = (Film) Films[i];
			if (films.lead_actor.equals("Arnold"))
				if (films.duration < min) {
					min = films.duration;
					imin = i;
				}
			iminfilm = films.name;

		}
		System.out.println("Shortest Arnold film is " + iminfilm + " and duration: " + min);
		//Here unable to print minimum length's movie name... 
	}
}

class Film {
	String name;
	String language;
	String lead_actor;
	String category;
	int duration;

	Film() {
		name = null;
		language = null;
		lead_actor = null;
		category = null;
		duration = 0;
	}

	Film(String n, String lang, String actor, String cat, int dur) {
		name = n;
		language = lang;
		lead_actor = actor;
		category = cat;
		duration = dur;
	}
}