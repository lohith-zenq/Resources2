package com.pinterest.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout

{
    WebDriver driver;
    By navigateto_options= By.xpath("//button[@aria-label=\"Accounts and more options\"]");
    By selecting_logout=By.linkText("Log out");

    public Logout(WebDriver driver)
    {
        this.driver=driver;
    }

    public void options()
    {
        driver.findElement(navigateto_options).click();

    }
    public void logingout()
    {
        driver.findElement(selecting_logout).click();
    }

}
