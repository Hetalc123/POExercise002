package org.example;

import org.openqa.selenium.By;

public class RegistrationFormPage extends Utils{
    private By _typeFirstName = By.id("FirstName");
    private By _typeLastName =By.id("LastName");
    private By _typeEmail = By.name("Email");
    private By _typePassword =By.name("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegister = By.id("register-button");
    private By _clickOnLogin = By.className("ico-login");
    public void enterRegistrationDetails(){
//type the firstname
        typeText(_typeFirstName, "MyFirstTest");
        //type the lastname
        typeText(_typeLastName, "Automation");
        //type the email
        typeText(_typeEmail, "myfirstauto" + datestamp() + "@gmail.com");
        //type password
        typeText(_typePassword, "auto1234");
        //confirm password
        typeText(_confirmPassword, "auto1234");
        //click on register
        clickOnElement(_clickOnRegister);
    }
}
