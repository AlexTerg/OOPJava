package HomeWorks.HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
 */
public class task3 {
    static Random rnd = new Random();
    public static void main(String[] args) {
        maxMinMean(randomLst());
    }

    public static void maxMinMean(List<Integer> lst) {

        int max = lst.get(0);
        int min = lst.get(0);
        int mean = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            } 
            else if (lst.get(i) < min){
                min = lst.get(i);
            }
            mean += lst.get(i);
        }
        System.out.println(lst);
        System.out.println(max);
        System.out.println(min);
        System.out.println((double) mean / lst.size());

        }

    public static List<Integer> randomLst() {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lst.add(rnd.nextInt(10));
        }
        return lst;
    }
}
