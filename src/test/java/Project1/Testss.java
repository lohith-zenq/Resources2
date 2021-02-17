package testNG;

public class Testss
{
    @org.testng.annotations.Test
    public void calling() throws InterruptedException
    {
        Browsetup1 browsetup1 = new Browsetup1();
        browsetup1.addproducttocart();
    }
}
