package testNG;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testannotation
{
    @BeforeMethod
    public void precondition()
    {
        System.out.println("before login check whether we are having any precondition");
    }
    @AfterMethod
    public void testdata()
    {
        System.out.println("Enter login data from testdata");
    }
    @Test(priority=1)
    public void setupbrowser()
    {
        System.out.println("Set the chrome browser into webdriver ");
    }
    @Test(priority=2)
    public void siteverification()
    {
        System.out.println("Sreenidhi collage website should be displayed");
    }
    @Test(priority=3)
    public void logindetails()
    {
        System.out.println("Enter valid username");
        System.out.println("Enter valid password");
        Assert.assertTrue(false);

    }
    @Test(dependsOnMethods = {"logindetails"})
    public void verifylogin()
    {
        System.out.println("login should be sucessful");
    }




}
