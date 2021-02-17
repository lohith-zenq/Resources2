package Project1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator
{
    public static void main(String[] args)

     {
    int operand1=20,operand2=5;   //5-divisor 20-dividend 
        String  action="multiplication";
        int result;
        Operations operations=new Operations(action);
        result=operations.execute(operand1,operand2);
        //Assertion statement
        Assert.assertEquals( result=operations.execute(operand1,operand2),100);

        System.out.println("Result is" +result);
        }
}
