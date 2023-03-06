package HomeWorks.Calculate;

public class Sum implements Result {

    @Override
    public double getResult(IntNumber intNumber) {
        return intNumber.getFirstNumber() + intNumber.getSecondNumber();
    }

}
