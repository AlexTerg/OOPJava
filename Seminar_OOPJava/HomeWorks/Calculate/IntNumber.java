package HomeWorks.Calculate;

public class IntNumber {
    private double firstNumber;
    private double secondNumber;

    // public IntNumber(double firstNumber, double secondNumber) {
    //     this.firstNumber = firstNumber;
    //     this.secondNumber = secondNumber;
    // }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int size() {
        IntNumber iNumber = new IntNumber();
        iNumber.setFirstNumber(firstNumber);
        iNumber.setSecondNumber(secondNumber);
        return iNumber.size();
    }

}
