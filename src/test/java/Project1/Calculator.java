package Selbasics;

 import org.testng.Assert;
 import org.testng.annotations.Test;

public class Calculator
{

@Test
    public static void main(String args[])
    {

        int result;
        int operand1, operand2;
        Operations operations = new Operations();
        result = operations.division(10, 5);  // 5-divisor,10-dividend
        Assert.assertEqual(result = operations.division(10, 5),2);
        System.out.println("result is " + result);
    }
}