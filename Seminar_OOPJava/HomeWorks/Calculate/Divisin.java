package HomeWorks.Calculate;

public class Divisin extends Action {

    @Override
    public double getResult(IntNumber intNumber) {
        double result = intNumber.getFirstNumber() / intNumber.getSecondNumber();
        // logger.log(String.format("%s / %s = %s", intNumber.getFirstNumber(), intNumber.getSecondNumber(), result));
        return result;
    }
}
