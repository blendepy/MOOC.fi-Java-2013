package dungeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private String[][] board;
    private List<Unit> vamps = new ArrayList<Unit>(vampires);
    private Unit player = new Unit();
    private boolean isVampPlasedOnce = false;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        board = new String[height][length];
        player.name = "@";
        player.setPosY(0);
        player.setPosX(0);

        createVampires();
        fillBoard();
        setPlayerLocationOnBoard();
    }

    public void run() {

        Scanner input = new Scanner(System.in);

        while (moves > 0) {

            if (vampiresMove == true) {
                placeVampires();
                printPositions();
                printBoard();
                System.out.println("");
                updateBoard();
                moves--;
            } else {
                if (!isVampPlasedOnce) {
                    placeVampires();
                    isVampPlasedOnce = true;
                }
                printPositions();
                printBoard();
                System.out.println("");
                moves--;
            }
            if (moves > 0) {
                if (vamps.isEmpty()) {
                    System.out.println("YOU WIN");
                    break;
                }
                System.out.println(vamps.size());
                String inputMoves = input.next();
                move(inputMoves);
                checkIfOnSameSpot();

            } else {
                System.out.println("YOU LOSE");
                break;
            }
        }
    }

    private void fillBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = "*";
            }
        }
    }

    private void createVampires() {
        for (int i = 0; i < vampires; i++) {
            vamps.add(new Unit());
        }
    }

    private void placeVampires() {
        Random r = new Random();
        for (int i = 0; i < vamps.size(); i++) {

            int xPos = r.nextInt(height);
            vamps.get(i).setPosX(xPos);
            int yPos = r.nextInt(length);
            vamps.get(i).setPosY(yPos);
            

            if (!board[xPos][yPos].equals("@") && !board[xPos][yPos].equals("V")) {
                board[xPos][yPos] = vamps.get(i).name;
            } else {
                yPos = r.nextInt(length);
                vamps.get(i).setPosY(yPos);
                xPos = r.nextInt(height);
                vamps.get(i).setPosX(xPos);
                board[xPos][yPos] = vamps.get(i).name;
            }
        }
    }

    private void updateBoard() {
        for (Unit unit : vamps) {
            board[unit.getPosX()][unit.getPosY()] = "*";
        }
    }

    private void printBoard() {
        for (String[] num : board) {
            for (String string : num) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    private void printPositions() {
        System.out.println(moves);
        System.out.println();
        System.out.println("@ " + player.getPosY() + " " + player.getPosX());
        for (Unit vamp : vamps) {
            System.out.println("v " + vamp.getPosY() + " " + vamp.getPosX());
        }
        System.out.println("");
    }

    private void move(String moves) {
        char[] eachMove = moves.toCharArray();

        int newPos = 0;
        for (int i = 0; i < eachMove.length; i++) {

            switch (eachMove[i]) {
                case 'a':
                    newPos = player.getPosY() - 1;
                    if (newPos >= 0) {
                        player.setPosY(newPos);
                        board[player.getPosX()][newPos + 1] = "*";
                    }
                    break;
                case 'd':
                    newPos = player.getPosY() + 1;
                    if (newPos <= length - 1) {
                        player.setPosY(newPos);
                        board[player.getPosX()][newPos - 1] = "*";
                    }
                    break;
                case 'w':
                    newPos = player.getPosX() - 1;
                    if (newPos >= 0) {
                        player.setPosX(newPos);
                        board[newPos + 1][player.getPosY()] = "*";
                    }
                    break;
                case 's':
                    newPos = player.getPosX() + 1;
                    if (newPos <= height - 1) {
                        player.setPosX(newPos);
                        board[newPos - 1][player.getPosY()] = "*";
                    }
                    break;
            }
        }
        setPlayerLocationOnBoard();
    }

    private void setPlayerLocationOnBoard() {
        board[player.getPosX()][player.getPosY()] = player.name;
    }

    private void checkIfOnSameSpot() {
        List<Unit> deadVamps = new ArrayList<Unit>();
        for (Unit unit : vamps) {
            if (unit.getPosX() == player.getPosX() && unit.getPosY() == player.getPosY()) {
                deadVamps.add(unit);
            }
        }
        vamps.removeAll(deadVamps);
    }
}
