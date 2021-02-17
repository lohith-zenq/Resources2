package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testannotation2
{
    @BeforeMethod
    public void precondition()
    {
        System.out.println("before login check whether we are having any precondition");
    }
    @AfterMethod
    public void testdata()
    {
        System.out.println("Testdata-- username=rahul@gmail.com password=123321123");
    }
    @Test
    public void logindetails()
    {
        System.out.println("Enter username from given testdata");
        System.out.println("Enter password from given testdata");
    }

}
