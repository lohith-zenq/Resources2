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
            result = (operand1 + operand2);
        }

        else if (action == "subtraction")
        {
            result = (operand1 - operand2);
        } else if (action == "multiplication")
        {
            result = (operand1 * operand2);
        } else if (action == "division")
        {
            result = (operand1 * operand2);
        }

        return result;

    }
}