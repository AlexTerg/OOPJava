package HomeWorks.HomeWork_3;

import java.util.Arrays;

/**
 * task1
 */
public class task1 {
    
    public static int[] array = {2, 6, 3, 9, 2, 1, 7, 5, 3};

    public static void main(String args[]) {   
        System.out.println(Arrays.toString(array));
        mergeSort(0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int start, int end) {
        int mid = (start + end) / 2;
        int[] tempArray = new int[end - start + 1];
        int index3 = 0;
        int index1 = start;
        int index2 = mid + 1;
        
        while ((index1 <= mid) || (index2 <= end)) { 
            if (index1 > mid) {
                tempArray[index3++] = array[index2++];
                continue;
            }
            if (index2 > end) {
                tempArray[index3++] = array[index1++];
                continue;
            }
            if (array[index2] > array[index1]) {
                tempArray[index3++] = array[index1++];
                continue;
            } else {
                tempArray[index3++] = array[index2++];
                continue;
            }                
        }   
        for (int i = 0; i < end - start + 1; i++) {
            array[i + start] = tempArray[i];
        }
    }

    public static void mergeSort(int start, int end) {
        if (start == end) {
            return;
        }
        
        int mid = (start + end) / 2;
        
        mergeSort(start  , mid);
        mergeSort(mid + 1, end);
        merge(start, end);        
    }

}
