package HomeWorks.HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    static Random rnd = new Random();
    public static void main(String[] args) {
        List<Integer> array = randomLst();
        System.out.println(array); 
        System.out.println(evenNumLst(array));

    }

    public static Object evenNumLst(List<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(lst.get(i));
                i--;
            }
        }    
        return lst;
    }

    public static List<Integer> randomLst() {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(10));
        }
        return lst;
    }
}
