package HomeWorks.HomeWork_4;

import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        String text = "5 4 3 - +";
        calculate(text);

    }

    public static void calculate(String arr) {
        String[] array = arr.split(" ");
        Stack<Integer> stc = new Stack<>();

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (isDigit(array[i])) {
                stc.push(Integer.parseInt(array[i]));
            } else {
                try {
                    switch (array[i]) {
                        case "+":
                            result = stc.pop() + stc.pop();
                            stc.push(result);
                            break;
                        case "-":
                            result = (stc.pop() - stc.pop()) * -1;
                            stc.push(result);
                            break;
                        case "*":
                            result = stc.pop() * stc.pop();
                            stc.push(result);
                            break;
                        case "/":
                            result = stc.pop() / stc.pop();
                            stc.push(result);
                            break;

                        default:
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Некорректный ввод");
                    System.exit(0);
                }

            }
        }
        if (stc.size() > 1) {
            System.out.println("Ошибка.... Некорректный ввод");
        } else
            System.out.println(stc.get(0));
    }

    public static boolean isDigit(final String str) {

        if (str == null || str.length() == 0) {
            return false;
        }

        return str.chars().allMatch(Character::isDigit);

    }
}
