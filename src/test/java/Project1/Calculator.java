package Selbasics;
public class Calculator
{


    public static void main(String args[])
    {
        int result;
        int operand1, operand2;
        Operations operations = new Operations();
        result = operations.division(10, 5);  // 5-divisor,10-dividend
        System.out.println("result is " + result);
    }
}