package HomeWorks.Calculate;

import java.util.logging.*;;

public class App {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(App.class.getName());
        logger.log(Level.INFO, "Начало работы!");

        IntNumber intNumber = new IntNumber(5, 5);
        Result result = new Sum();
        double res = result.getResult(intNumber);
        System.out.println(res);
        logger.log(Level.INFO, String.format("Сумма чисел равна = %s", res));
        Result result2 = new Multi();
        IntNumber intNumber2 = new IntNumber(res, 5);
        double res2 = result2.getResult(intNumber2);
        System.out.println(result2.getResult(intNumber2));
        logger.log(Level.INFO, String.format("Произведение чисел равно = %s", res2));

    }

}
