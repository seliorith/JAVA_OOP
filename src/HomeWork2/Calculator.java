package HomeWork2;

public class Calculator implements ICalcultor {
    private double firstOperand;
    private double secondOperand;
    private String operatorStr;

    public double getFirst() {
        return firstOperand;
    }

    public double getSecond() {
        return secondOperand;
    }

    public void setFirstOperand(String operandStr) {
        firstOperand = Double.parseDouble(operandStr);
    }

    public void setSecondOperand(String operandStr) {
        secondOperand = Double.parseDouble(operandStr);
    }

    public void setOperator(String operatorStr) {
        this.operatorStr = operatorStr;
    }

    public String getResult() {
        IOperation operation = operation(operatorStr);
        double res = operation.calculate(firstOperand, secondOperand);
        return Double.toString(res);
    }

    private IOperation operation(String operatorStr) {
        switch (operatorStr) {
            case "+":
                return (firstOperand, secondOperand) -> firstOperand + secondOperand;
            case "-":
                return (firstOperand, secondOperand) -> firstOperand - secondOperand;
            case "*":
                return (firstOperand, secondOperand) -> firstOperand * secondOperand;
            case "/":
                return (firstOperand, secondOperand) -> secondOperand != 0 ? firstOperand / secondOperand : 0;
            default:
                return null;
        }
    }
}
