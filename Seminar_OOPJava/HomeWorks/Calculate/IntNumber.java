package HomeWorks.Calculate;

public class IntNumber {
    private double firstNumber;
    private double secondNumber;

    public IntNumber(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int size() {
        IntNumber iNumber = new IntNumber(firstNumber, secondNumber);
        return iNumber.size();
    }

}
