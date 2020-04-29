
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.random = new Random();
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {

        numbers.clear();
        int randomNumber = 0;
        int count = 0;
        
        while (count < 7) {
            randomNumber = random.nextInt(39) + 1;
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
                count++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
