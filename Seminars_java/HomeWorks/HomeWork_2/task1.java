/*
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

package HomeWorks.HomeWork_2;

import java.util.Formatter;

public class task1 {
    public static void main(String[] args) throws Exception {

        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] data_lst = GetString(text);
        Formatter f = new Formatter();
        f.format("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", data_lst[0],
        data_lst[1], data_lst[2]);
        System.out.println(f);
    }

    public static String[] GetString(String str) {
        StringBuilder text = new StringBuilder();
        int index1 = str.indexOf("{");
        int index2 = str.indexOf("}");
        String temp_text = str.substring(index1 + 1, index2);
        String[] text_lst = temp_text.split(",");
        for (int i = 0; i < text_lst.length; i++) {
            String[] temp = text_lst[i].split(":");
            text.append(temp[1] + ",");

        }
        String[] text_array = text.toString().split(",");
        return text_array;

    }

}
