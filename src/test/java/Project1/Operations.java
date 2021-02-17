package Project1;

import org.testng.annotations.Test;

public class Operations
{
    String action;
    int result;

    Operations(String action)
    {
        this.action = action;
    }
@Test
    public int execute(int operand1, int operand2) {


        if (action == "addition")

        {
            result = operand1 + operand2;
        }

        else if (action == "subtraction")
        {
            result = (operand1 - operand2);
        } else if (action == "multiplication")
        {
            result = (operand1 * operand2);
        } else if (action == "division")
        {
         
           result = (operand1 / operand2);
        }

        return result;

    }
    @Test

    public static void Cal(){

        {
            int operand1=5,operand2=20;  //5-divisor 20-dividend
            String action="subtraction";
            int result;
            Operations operations=new Operations(action);
            result=operations.execute(operand1,operand2);

            Assert.assertEquals( result=operations.execute(operand1,operand2),100); //Assertion statement 

            System.out.println("Result is" +result);
        }

    }}
