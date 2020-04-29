
public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishingYear;
    private final double CD_WEIGHT = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return this.CD_WEIGHT;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }

}
