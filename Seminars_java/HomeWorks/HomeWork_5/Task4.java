package HomeWorks.HomeWork_5;

import java.util.Arrays;

public class Task4 {
    private static int[][] array = new int[8][8];

    public static void main(String[] args) {
        queen(0);
        print(array);
    }

    private static int checkPos(int x, int y) {

        for (int i = 0; i < x; i++) {

            if (array[i][y] == 1)
                return 0;
            if (y - x + i >= 0) {
                if (array[i][y - x + i] == 1)
                    return 0;
            }
            if (y + x - i < 8) {
                if (array[i][y + x - i] == 1)
                    return 0;
            }
        }
        return 1;

    }

    private static int queen(int i) {
        if (i == 8)
            return 1;
        for (int j = 0; j < array.length; j++) {
            if (checkPos(i, j) == 1) {
                array[i][j] = 1;
                int temp = queen(i + 1);
                if (temp == 1)
                    return 1;
                array[i][j] = 0;
            }

        }
        return 0;
    }

    private static void print(int[][] lst) {
        for (int i = 0; i < lst.length; i++) {
            System.out.println(Arrays.toString(lst[i]));
        }
    }
}
