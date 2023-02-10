package HomeWorks.HomeWork_5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 3, 8, 0};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] lst) {
        int size = lst.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(size, i, lst);
        }

        for (int i = size - 1; i>=0; i--) {
            int temp = lst[0];
            lst[0] = lst[i];
            lst[i] = temp;

            heapify(0, i, lst);

        }
    }

    private static void heapify(int size, int index, int[] lst) {

        int min = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < size && lst[left] > lst[min])
            min = left;
        if (right < size && lst[right] > lst[min])
            min = right;
        if (min != index) {
            int temp = lst[index];
            lst[index] = lst[min];
            lst[min] = temp;
            
            heapify(size, min, lst);
        }
        
    }
}
