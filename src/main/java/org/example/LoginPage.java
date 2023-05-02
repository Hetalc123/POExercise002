package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    private By _typeemail = By.xpath("//input[@name='Email']");
    private By _typePassword = By.xpath("//input[@class='password']");
    private By _clickOnLogin = By.xpath("//button[@class='button-1 login-button']");
    private By _clickOnHomePage = By.xpath("//img[@alt='nopCommerce demo store']");

    public void enterLoginDetails(){
        //type email
        typeText(_typeemail, "myfirstauto" + datestamp()+ "@gmail.com");
        //type password
        typeText(_typePassword, "auto1234");
        //click on login
        clickOnElement(_clickOnLogin);
    }
}
