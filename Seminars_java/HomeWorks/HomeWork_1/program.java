import java.util.Scanner;

public class program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n");
        int n = input.nextInt();
        System.out.println(GetResult(n));
    }

    static int GetResult(int num) {
        return num * (num + 1) / 2;

    }
}
