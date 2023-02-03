/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

package HomeWorks.HomeWork_4;

import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(Arrays.toString(reverseList(list)));

    }

    private static int[] reverseList(LinkedList<Integer> lst) {
        int[] lstReverse = new int[lst.size()];
        for (int i = 0, j = lst.size() - 1; i < lst.size(); i++, j--) {
            lstReverse[i] = lst.get(j);
        }
        return lstReverse;
    }
}
