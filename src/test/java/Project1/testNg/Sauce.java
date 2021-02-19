package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Sauce {
    @Parameters({"browsername","url"})
    public void launch(String browsername,String url) throws InterruptedException {
        if (browsername.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "resources1//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/index.html");
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("lohith-zenq");
            driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123321123");
            Thread.sleep(2000);     //time gap before clicking "login" button
            driver.findElement(By.id("login-button")).click();
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Swag Labsss");
            driver.quit();
        }
        else if (browsername.equalsIgnoreCase("firefox"))
        {

            System.setProperty("webdriver.gecko.driver", "resources1//geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com/index.html");
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("lohith-zenq");
            driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123321123");
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
            driver.getTitle();
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Swag Labs");
            driver.quit();

        }
    }
}



