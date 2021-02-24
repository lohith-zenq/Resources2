package Pin.testcases;

import com.pinterest.login.PinterestPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifypinterest_login_logout
{
    @Test
    public void valid_login() throws InterruptedException
    {
        //Browser invoking
        System.setProperty("webdriver.chrome.driver", "resources1//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.pinterest.com/login/");

        PinterestPages login=new PinterestPages(driver);

       //Login to pinterest application
        login.loginToPinterest("kanigallalohith@gmail.com","lohith123@");
      Thread.sleep(Long.parseLong("2000"));

      //Searching for image category(nature)
      login.searchBar();
      Thread.sleep(Long.parseLong("2000"));

      //Selecting an Image and going back to home page
      login.imageSelection();
      Thread.sleep(Long.parseLong("2000"));

      //Logout from the site
        login.logOut();
    }
}
