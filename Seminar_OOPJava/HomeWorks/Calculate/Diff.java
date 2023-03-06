package HomeWorks.Calculate;

public class Diff extends Action {

    @Override
    public double getResult(IntNumber intNumber) {
        return intNumber.getFirstNumber() - intNumber.getSecondNumber();
    }

}
