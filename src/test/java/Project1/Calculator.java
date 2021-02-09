package Selbasics;


import org.testng.Assert;

import static org.testng.Assert.*;

public class Calculator
{


    public static void main(String args[])
    {

        int result;
        int operand1, operand2;
        Operations operations = new Operations();
        result = operations.division(10, 5);  // 5-divisor,10-dividend

        assertEquals(result=operations.addition(10,5),15); //Assertion statement

        System.out.println("result is " +result);
    }
}
