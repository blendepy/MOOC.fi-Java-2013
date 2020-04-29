package reference.comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return calcAverageRating(o2) - calcAverageRating(o1);
    }

    private int calcAverageRating(Film film) {
        int avg = 0;
        for (Rating rating : ratings.get(film)) {
            avg += rating.getValue();
        }
        return avg;
    }
}
