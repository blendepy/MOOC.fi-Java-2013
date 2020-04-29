package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;

public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        ArrayList<Film> listOfAllFilms = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
        ArrayList<Film> filmsWathcedByPerson = new ArrayList<Film>(ratingRegister.getPersonalRatings(person).keySet());
        
        if (filmsWathcedByPerson.containsAll(listOfAllFilms)) {
            return null;
        }
        //leave films that were not watched by person
        listOfAllFilms.removeAll(filmsWathcedByPerson);
        Collections.sort(listOfAllFilms, new FilmComparator(ratingRegister.filmRatings()));
        return listOfAllFilms.get(0);
    }
}
