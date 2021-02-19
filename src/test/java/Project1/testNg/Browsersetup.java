package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browsersetup
{
    WebDriver driver;

    @Test
    public void addproducttocart()
    {
        //Invoking broswer
        System.setProperty("webdriver.chrome.driver", "resources1//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
    }
    /**
     *
     */
    @Test
    public void selecting() throws InterruptedException
    {
        //Selecting product from the site
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(Long.parseLong("2000"));
    }
    @Test
    public void addcart() throws InterruptedException
    {


        //Adding product to the cart
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
        Thread.sleep(Long.parseLong("2000"));
    }
    @Test
    public void checkout() throws InterruptedException
    {
        //Proceeding to checkouts
        driver.findElement(By.cssSelector("path[fill=\"currentColor\"]")).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]")).click();
        Thread.sleep(Long.parseLong("2000"));
    }
    @Test
    public void payment() throws InterruptedException {

        //Address details before payment
        driver.findElement(By.xpath("//input[@id='first-name'] first")).sendKeys("lohith");
        driver.findElement(By.xpath("//input[@id='first-name']//following-sibling::input[1])")).sendKeys("kanigalla");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500010");

        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

        @Test
                public void quitbrowser()
        {
            driver.quit();
        }
    }





