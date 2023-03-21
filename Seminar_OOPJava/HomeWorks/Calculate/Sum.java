package HomeWorks.Calculate;

public class Sum extends Action {

    public double getResult(IntNumber intNumber) {
        double result = intNumber.getFirstNumber() + intNumber.getSecondNumber();
        // logger.log(String.format("%s + %s = %s", intNumber.getFirstNumber(), intNumber.getSecondNumber(), result));
        return result;
    }

}
