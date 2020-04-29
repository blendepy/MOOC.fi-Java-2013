package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> wormPieces;
    private boolean isGrowing;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        wormPieces = new ArrayList<Piece>();
        wormPieces.add(new Piece(originalX, originalY));
        isGrowing = false;
    }

    public int getOriginalX() {
        return originalX;
    }

    public int getOriginalY() {
        return originalY;
    }

    public void setOriginalX(int originalX) {
        this.originalX = originalX;
    }

    public void setOriginalY(int originalY) {
        this.originalY = originalY;
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction direction) {
        this.originalDirection = direction;
    }

    public int getLength() {
        return wormPieces.size();
    }

    public List<Piece> getPieces() {
        return wormPieces;
    }

    public void move() {

        if (getLength() > 2 && !isGrowing) {
            getPieces().remove(0);
        }

        int updatedX = wormHead().getX();
        int updatedY = wormHead().getY();

        switch (originalDirection) {
            case RIGHT:
                updatedX++;
                break;
            case LEFT:
                updatedX--;
                break;
            case UP:
                updatedY--;
                break;
            case DOWN:
                updatedY++;
                break;
        }

        wormPieces.add(new Piece(updatedX, updatedY));

        if (isGrowing) {
            isGrowing = false;
        }
    }

    public void grow() {
        isGrowing = true;
    }

    public boolean runsInto(Piece piece) {
        for (int i = 0; i < getLength(); i++) {
            if (wormPieces.get(i).runsInto(piece)) {
                return true;
            }
        }
        return false;

    }

    public boolean runsIntoItself() {
        for (int i = 0; i < getLength() - 1; i++) {
            if (wormHead().runsInto(wormPieces.get(i))) {
                return true;
            }
        }
        return false;
    }

    public Piece wormHead() {
        return wormPieces.get(getLength() - 1);
    }
}
