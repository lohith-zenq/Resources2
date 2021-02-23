package Pin.testcases;

import com.pinterest.login.Loginpage;
import com.pinterest.login.Logout;
import com.pinterest.login.Saveimage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifypinterestlogin
{
    @Test
    public void valid_login() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "resources1//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.pinterest.com/login/");
         
        //Login
       Loginpage login=new Loginpage(driver);

        login.user_name("kanigallalohith@gmail.com");
        login.user_password("lohith123@");
        login.login_button();
      Thread.sleep(Long.parseLong("2000"));
 
        //Logout 
        driver.get("https://in.pinterest.com/");
        Logout out=new Logout(driver);

        out.options();
        out.logingout();

        //Saveimage save=new Saveimage(driver);

        //save.image_selection();
        //save.save_image();


    }





}
