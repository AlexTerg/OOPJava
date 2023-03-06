package HomeWorks.Calculate;

import java.util.logging.*;;

public class App {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(App.class.getName());
        logger.log(Level.INFO, "Начало работы!");

        IntNumber intNumber = new IntNumber();
        intNumber.setFirstNumber(5);
        intNumber.setSecondNumber(5);
        Note np = new Note();
        double res = np.getResult(intNumber, new Sum());
        logger.log(Level.INFO, String.format("Сумма чисел равна = %s", res));
       

        // Весь процесс через класс Note
        np.setFirst(10);
        np.setSecond(5);
        np.getResult(np, new Divisin());
        logger.log(Level.INFO, String.format("Результат деления = %s", np.getResult(np, new Divisin())));
        logger.log(Level.INFO, String.format("Сумма чисел = %s", np.getResult(np, new Sum())));
        logger.log(Level.INFO, String.format("Разность чисел = %s", np.getResult(np, new Diff())));
        logger.log(Level.INFO, String.format("Результат Умножения = %s", np.getResult(np, new Multi())));

        // double res = result.getResult(intNumber);
        // System.out.println(res);
        // logger.log(Level.INFO, String.format("Сумма чисел равна = %s", res));
        // Result result2 = new Multi();
        // IntNumber intNumber2 = new IntNumber(res, 5);
        // double res2 = result2.getResult(intNumber2);
        // System.out.println(result2.getResult(intNumber2));
        // logger.log(Level.INFO, String.format("Произведение чисел равно = %s", res2));

    }

}
