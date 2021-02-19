package testNG;

import org.testng.annotations.Test;

public class Testing
{

    @Test
    public void calling() throws InterruptedException
    {
        Browsersetup b=new Browsersetup();
        b.addproducttocart();
        b.selecting();
        b.addcart();
        b.checkout();
        b.payment();
        b.quitbrowser();
    }


}

