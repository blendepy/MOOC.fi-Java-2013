package dungeon;

public class Unit {

    private int posX;
    private int posY;
    private boolean isAlive;
    public String name = "V";

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Unit{" + "posX=" + posX + ", posY=" + posY + '}';
    }

}
