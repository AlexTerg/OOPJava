package HomeWorks.Calculate;

public class Divisin extends Action {

    @Override
    public double getResult(IntNumber intNumber) {
        return intNumber.getFirstNumber() / intNumber.getSecondNumber();
    }
}
