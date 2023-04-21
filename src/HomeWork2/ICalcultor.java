package HomeWork2;

public interface ICalcultor {
    public double getFirst();
    public double getSecond();
    public void setFirstOperand(String operandStr);
    public void setSecondOperand(String operandStr);
    public void setOperator(String operator);
    public String getResult();
}