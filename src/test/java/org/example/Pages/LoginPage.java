package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement validEmail (){
       return Hooks.driver.findElement(By.cssSelector("input[id=\"ctl00_CPHContainer_txtUserLogin\"]"));
    }

    public WebElement inValidPass (){
       return Hooks.driver.findElement(By.name("ctl00$CPHContainer$txtPassword"));
    }

    public WebElement preesLoginButton(){
       return Hooks.driver.findElement(By.name("ctl00$CPHContainer$btnLoginn"));
    }

    public WebElement wrongTextMsg (){
        return Hooks.driver.findElement(By.id("ctl00_CPHContainer_lblOutput"));
    }


}
