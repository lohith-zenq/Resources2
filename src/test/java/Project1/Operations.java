package Project1;

import org.testng.annotations.Test;

public class Operations

{
@Test
    public int addition(int operand1, int operand2)
    {
        return operand1 + operand2;
    }

@Test
    public int subtraction(int operand1, int operand2)
    {
        return operand1 - operand1;
    }
@Test
    public int multiplication(int operand1, int operand2)
    {
        return operand1 * operand2;
    }
@Test
    public int division(int operand1, int operand2)
    {
        return operand1 / operand2;
    }
}