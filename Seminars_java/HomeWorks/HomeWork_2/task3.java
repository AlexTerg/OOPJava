package HomeWorks.HomeWork_2;

import java.util.Formatter;

public class task3 {
    public static void main(String[] args) {
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        
        String[] array = GetString(text);
        StringBuilder arrayStr = new StringBuilder();
        Formatter f = new Formatter();

        for (int i = 0; i < array.length; i += 3) {
            f.format("Студент %s получил %s по предмету %s.\n", array[i], array[i + 1], array[i + 2]);
        }

        arrayStr.append(f);
        f.close();

        System.out.println(arrayStr.toString());
        
    }

    public static String[] GetString(String str) {
        StringBuilder text = new StringBuilder();

        String[] text_lst = GetArray(str, "[", "]").split(", ");
        for (String string : text_lst) {
            String[] temp = GetArray(string, "{", "}").split(",");

            for (String string2 : temp) {
                String[] temp2 = string2.split(":");
                text.append(temp2[1] + ",");
            }
        }

        String[] text_array = text.toString().split(",");
        return text_array;
    }

    public static String GetArray(String text, String start, String end) {
        int index1 = text.indexOf(start);
        int index2 = text.indexOf(end);
        String result = text.substring(index1 + 1, index2);
        return result;

    }
}
