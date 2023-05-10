package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class GuestCheckoutPage extends Utils{
    public void fillCkeckoutDetails(){
        //type firstname
        typeText(By.xpath("//input[@id='BillingNewAddress_FirstName']"),"Test");
        //enter last name
        typeText(By.xpath("//input[@id='BillingNewAddress_LastName']"),"Auto");
        //enter an email
        typeText(By.xpath("//input[@id='BillingNewAddress_Email']"),"autotest1234@gmail.com");
        //enter country
        selectElementByText(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"United Kingdom");
        //enter city name
        typeText(By.xpath("//input[@id='BillingNewAddress_City']"),"Liverpool");
        //enter address
        typeText(By.xpath("//input[@id='BillingNewAddress_Address1']"),"60 london Road");
        //enter postcode
        typeText(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"LE2 8ND");
        //enter mobile number
        typeText(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"00447828698957");
        //click on continue
        clickOnElement(By.xpath("(//button[@name='save'])[1]"));
    }
    public void handlePopUp(){
        //import ChromOptions to handle popup window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        options.addArguments("disable-notifications");}
    public void confirmCheckout(){
        //click on confirm order
        clickOnElement(By.xpath("//button[@onclick='ConfirmOrder.save()']"));
    }

}
