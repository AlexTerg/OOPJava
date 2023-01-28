package HomeWorks.HomeWork_2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task2 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 7, 4, 1, 9, 8 };
        int[] sortedLst = sortedArray(array);
        System.out.println(Arrays.toString(sortedLst));
    }

    public static int[] sortedArray(int[] lst) {
        Logger logger = Logger.getLogger(task2.class.getName());
        logger.setLevel(Level.INFO);

        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lst.length - 1; i++) {
                if (lst[i] > lst[i + 1]) {
                    logger.info("Условие lst[i] > lst[i + 1] верно");
                    sorted = false;

                    temp = lst[i];
                    lst[i] = lst[i + 1];
                    lst[i + 1] = temp;
                    logger.info("Поменяли элементы местами");
                }
            }
        }

        logger.info("Сортированный массив готов");

        return lst;

    }
}
