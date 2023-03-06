package HomeWorks.Calculate;

public class Diff implements Result {

    @Override
    public double getResult(IntNumber intNumber) {
        return intNumber.getFirstNumber() - intNumber.getSecondNumber();
    }

}
