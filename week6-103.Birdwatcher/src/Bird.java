
public class Bird {

    private String normalName;
    private String latinName;
    private int observeCount;

    public Bird(String normalName, String latinName) {
        this.normalName = normalName;
        this.latinName = latinName;
        this.observeCount = 0;
    }

    public void addObserveCount() {
        this.observeCount++;
    }

    public String getNormalName() {
        return normalName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserveCount() {
        return observeCount;
    }

}
