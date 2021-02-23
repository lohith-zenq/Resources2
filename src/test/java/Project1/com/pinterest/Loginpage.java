package com.pinterest.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage
{
    WebDriver driver;
    By username= By.id("email");
    By password= By.id("password");
    By loginbutton=By.xpath("//button[@class=\"red SignupButton active\"]");

    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void user_name(String uname)
    {
        driver.findElement(username).sendKeys(uname);
    }
    public void user_password(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void login_button()
    {
        driver.findElement(loginbutton).click();
    }


}


