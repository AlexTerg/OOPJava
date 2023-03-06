package HomeWorks.Calculate;

public class Divisin implements Result {

    @Override
    public double getResult(IntNumber intNumber) {
        return intNumber.getFirstNumber() / intNumber.getSecondNumber();
    }
}
