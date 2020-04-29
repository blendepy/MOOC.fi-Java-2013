package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

    private Map<Film, List<Rating>> filmsWithRatings;
    private Map<Person, Map<Film, Rating>> personWithRatings;

    public RatingRegister() {
        this.filmsWithRatings = new HashMap<Film, List<Rating>>();
        this.personWithRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!filmsWithRatings.containsKey(film)) {
            filmsWithRatings.put(film, new ArrayList<Rating>());
            filmsWithRatings.get(film).add(rating);
        } else {
            filmsWithRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        return filmsWithRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmsWithRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personWithRatings.containsKey(person)) {
            personWithRatings.put(person, new HashMap<Film, Rating>());
            personWithRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else {
            personWithRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        return personWithRatings.get(person).containsKey(film) ? personWithRatings.get(person).get(film) : Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        return personWithRatings.getOrDefault(person, new HashMap<Film, Rating>());
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(personWithRatings.keySet());
    }
}
