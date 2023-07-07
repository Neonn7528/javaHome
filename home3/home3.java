/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */
import java.util.ArrayList;
import java.util.List;

public class home3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);

        System.out.println("Исходный список: " + numbers);

        // Удаление четных чисел
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("Список после удаления четных чисел: " + numbers);

        // Поиск минимального значения
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Минимальное значение: " + min);

        // Поиск максимального значения
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max);

        // Поиск среднего значения
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = sum / numbers.size();
        System.out.println("Среднее значение: " + avg);
    }
}