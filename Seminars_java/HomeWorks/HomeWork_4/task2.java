package HomeWorks.HomeWork_4;

import java.util.Arrays;
import java.util.LinkedList;

public class task2 {

    private static LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    public static void main(String[] args) {
        enqueue(8);
        System.out.println(list);
        System.out.println(first());
        System.out.println(list);
        System.out.println(dequeue());
        System.out.println(list);
        System.out.println(dequeue());
        System.out.println(list);

    }

    private static LinkedList<Integer> enqueue(int num) {
        list.addLast(num);
        return list;
    }

    private static int first() {
        return list.getFirst();
    }

    private static int dequeue() {
        int frstNum = list.getFirst();
        list.removeFirst();
        return frstNum;
    }

}
