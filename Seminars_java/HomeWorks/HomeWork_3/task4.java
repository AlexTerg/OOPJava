package HomeWorks.HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task4 {
    static Random rnd = new Random();

    public static void main(String[] args) {
        List<Integer> arrayA = randomLst(5);
        List<Integer> arrayB = randomLst(5);
        System.out.printf("First list: %s\n", arrayA);
        System.out.printf("Second list: %s\n", arrayB);
        System.out.printf("List difference A, B: %s\n", lstDifference(arrayA, arrayB));
        System.out.printf("List difference B, A: %s\n", lstDifference(arrayB, arrayA));
        System.out.printf("List set difference A, B: %s", setDifference(arrayA, arrayB));
    }

    public static List<Integer> lstDifference(List<Integer> lst1, List<Integer> lst2) {
        List<Integer> lstResult = new ArrayList<>();
        for (int i = 0; i < lst1.size(); i++) {
            if (!lst2.contains(lst1.get(i))) {
                lstResult.add(lst1.get(i));
            }
            }
        return lstResult;
        }

    public static List<Integer> setDifference(List<Integer> lst1, List<Integer> lst2) {  
        List<Integer> lstDiff1 = lstDifference(lst1, lst2);
        List<Integer> lstDiff2 = lstDifference(lst2, lst1);
        List<Integer> lstResult = new ArrayList<>(lstDiff1);
        lstResult.addAll(lstDiff2);
        return lstResult;
        
    }

    public static List<Integer> randomLst(int size) {
        // size задает длинну списка
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            lst.add(rnd.nextInt(10));
        }
        return lst;
    }
}
