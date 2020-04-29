
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        sum = number + this.sum;        //вычисляю сумму введенных чисел
        this.amountOfNumbers++;         //считаю сколько раз введены числа
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;    //вывод результата this.amountOfNumbers++;
    }

    public int sum() {
        if (this.amountOfNumbers() == 0) {  //проверка было ли введено хоть одно число
            return 0;
        } else {
            return sum;                 //вывод суммы из addNumber();
        }
    }

    public double average() {
        if (this.amountOfNumbers() == 0) {
            return 0;
        } else {
            return (double)this.sum / this.amountOfNumbers; //вывод среднего из суммы и кол-ва чисел
        }
    }
}