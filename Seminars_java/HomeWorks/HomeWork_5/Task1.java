package HomeWorks.HomeWork_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иван", new ArrayList<>());
        phoneBook.get("Иван").add("89997776655");
        phoneBook.get("Иван").add("89876543211");
        phoneBook.put("Александр", new ArrayList<>(Arrays.asList("89871234323", "891023234322")));
        phoneBook.put("Алексей", new ArrayList<>(Arrays.asList("89987654567")));
        System.out.println(phoneBook);
    }
}
