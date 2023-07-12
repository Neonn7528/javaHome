/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре 
будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными 
телефонами. Вывод должен быть отсортирован по убыванию 
числа телефонов. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class home5 {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> namesAndPhones = new HashMap<>();

        // Добавление имен и номеров телефонов
        addPhone(namesAndPhones, "Ivanov Ivan Igorevich", 12345);
        addPhone(namesAndPhones, "Petrov Petya Ivanovich", 12346);
        addPhone(namesAndPhones, "Sidorov Ivan Petrovich", 12347);
        addPhone(namesAndPhones, "Ivanov Ivan Igorevich", 12348);
        addPhone(namesAndPhones, "Petrov Petya Ivanovich", 12349);
        addPhone(namesAndPhones, "Ivanov Ivan Igorevich", 12340);
        
        
        

        // Сортировка по количеству номеров телефонов в убывающем порядке
        List<Map.Entry<String, List<Integer>>> sorter = new ArrayList<>(namesAndPhones.entrySet());
        sorter.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        // Вывод отсортированных записей
        for (Map.Entry<String, List<Integer>> entry : sorter) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size() + " номер(а): " + entry.getValue());
        }
    }
        //добавляем номера телефона для имени
    private static void addPhone(HashMap<String, List<Integer>> map, String name, int phone) {
        List<Integer> phones = map.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        map.put(name, phones);
    }
}


