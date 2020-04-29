package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (new Random().nextDouble() < d) {
                    turnToLiving(i, j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        return cellInBounds(x, y) && getBoard()[x][y];
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (cellInBounds(x, y)) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (cellInBounds(x, y)) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int numberOfNeighboursAlive = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (isAlive(i, j)) {
                    numberOfNeighboursAlive++;
                }
            }
        }
        if (isAlive(x, y)) {
            numberOfNeighboursAlive--;
        }
        return numberOfNeighboursAlive;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2 || livingNeighbours > 3) {
            turnToDead(x, y);
        } else if (livingNeighbours == 3) {
            turnToLiving(x, y);
        }
    }

    private boolean cellInBounds(int x, int y) {
        return ((x >= 0 && x < getWidth()) && (y >= 0 && y < getHeight()));
    }
}
