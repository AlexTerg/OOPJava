package HomeWorks.HomeWork_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>(
                Arrays.asList("Сергей", "Иван", "Петр", "Антон", "Петр", "Сергей", "Иван", "Иван"));
        findNameRepeat(employees);
    }

    private static void findNameRepeat(List<String> names) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            if (map.containsKey(name))
                map.put(name, map.get(name) + 1);
            else
                map.put(name, 1);

        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println(map);

    }
}
