package HomeWorks.Calculate;

public class Note extends IntNumber{


    public double getResult(IntNumber iNumber, Action action) {
        return action.getResult(iNumber);
    }

    public void setFirst(double num) {
        super.setFirstNumber(num);
    }

    public void setSecond(double num) {
        super.setSecondNumber(num);
    }
}
