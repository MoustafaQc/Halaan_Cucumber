package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LoginPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginStepDefs {
    LoginPage loginP = new LoginPage();


    @Given("user enter correct email")
    public void userEnterCorrectEmail() {
        loginP.validEmail().sendKeys("correct email");
    }


    @When("user enter wrong email")
    public void userEnterWrongEmail() {
        loginP.inValidPass().sendKeys("wrong pass");
    }


    @And("user click in button of login")
    public void userClickInButtonOfLogin() {
        loginP.preesLoginButton().click();
    }


    @Then("user check the wrong message will appear")
    public void userCheckTheWrongMessageWillAppear() {
        SoftAssert soft = new SoftAssert();
       soft.assertEquals(loginP.wrongTextMsg().getText(),"Userid or Password did Not Match !!");
        soft.assertAll();
    }


}
