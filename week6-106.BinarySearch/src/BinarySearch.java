
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;              //левая граница: индекс первого элемента
        int end = array.length - 1;     //правая граница: индекс последнего злемента

        while (beginning <= end) {
            int middle = (beginning + end) / 2;     //вычисляем индекс среднего элемента
            if (array[middle] == searchedValue) {   //если значение совпадает, то число найдено
                return true;
            } else if (array[middle] < searchedValue) {    //если искомое число больше, чем значение средины, значит оно находится справа
                beginning = middle + 1;                 //сужаем диапазон поиска: начало левой границы устанавливаем с середины + 1
            } else {
                end = middle - 1;                       //если искомое меньше середины, то оно находится  слева
            }                                           //сужаем диапазон поиска: конец правой границы устанавиваем с середины - 1  
        }
        return false;
    }
}
