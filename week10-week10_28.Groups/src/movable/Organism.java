package movable;

public class Organism implements Movable {

    private int xCoord;
    private int yCoord;

    public Organism(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return "x: " + xCoord + "; " + "y: " + yCoord;
    }

    @Override
    public void move(int dx, int dy) {
        this.xCoord += dx;
        this.yCoord += dy;
    }
}
