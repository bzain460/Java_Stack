public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public void setOperandOne(double num) {
        this.operandOne = num;
    }
    
    public void setOperandTwo(double num) {
        this.operandTwo = num;
    }
    
    public void setOperation(String o) {
        this.operation = o;
    }

    public void performOperation() {
        if (operation == "+") {
            this.result = operandOne + operandTwo;
        }

        else if (operation == "-") {
            this.result = operandOne - operandTwo;
        }
    }

    public double getResult() {
        return this.result;
    }


}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(10.5);
        c.setOperation("+");
        c.setOperandTwo(5.2);
        c.performOperation();
        System.out.println(c.getResult());
    }
}