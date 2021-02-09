package Project1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator
{
    public static void main(String[] args)

     {
    int operand1=5,operand2=20;
        String  action="multiplication";
        int result;
        Operations operations=new Operations(action);
        result=operations.execute(operand1,operand2);

        Assert.assertEquals( result=operations.execute(operand1,operand2),100);

        System.out.println("Result is" +result);
        }


}