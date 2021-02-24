package com.pinterest.login;

import Pin.testcases.Verifypinterest_login_logout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import javax.swing.*;

public class PinterestPages extends Verifypinterest_login_logout
{
    WebDriver driver;
    //Locators for Login page
    By username= By.id("email");
    By password= By.id("password");
    By loginbutton=By.xpath("//button[@class=\"red SignupButton active\"]");
    //Locators for Image selection in search bar
    By enteringText=By.xpath("//input[@type=\"text\"]");
    By selectingImage=By.xpath("//img[@class=\"hCL kVc L4E MIw\"][1]");
    By saving=By.xpath("//div[@class=\"XiG zI7 iyn Hsu\"]//div[@data-test-id=\"quick-save-button\"]");
    //Locators for logout
    By navigateto_options= By.xpath("//button[@aria-label=\"Accounts and more options\"]");
    By selecting_logout=By.xpath("//div[@data-test-id=\"header-menu-options-logout\"]");

//constructor
    public PinterestPages(WebDriver driver)
    {
        this.driver=driver;
    }
@Test

    public void loginToPinterest(String uname,String pass)
    {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginbutton).click();
    }

    @Test

    public void searchBar()
    {
        driver.get("https://in.pinterest.com/");
        driver.findElement(enteringText).click();
        driver.findElement(enteringText).sendKeys("nature");
        driver.findElement(enteringText).sendKeys(Keys.ENTER);

    }
    @Test

    public void imageSelection() throws InterruptedException
    {
        driver.findElement(selectingImage).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.xpath("//div[@class=\"Jea gjz mQ8 zI7 iyn Hsu\"]")).click();

        //driver.findElement(saving).click();
    }
    @Test

    public void logOut()
    {
        driver.findElement(navigateto_options).click();
        driver.findElement(selecting_logout).click();
    }

}






