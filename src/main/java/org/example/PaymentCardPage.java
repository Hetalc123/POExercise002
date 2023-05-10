package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class PaymentCardPage extends Utils{
    public void enterCardDetails(){
        //enter payee name
        typeText(By.xpath("//input[@id='CardholderName']"),"Hipolito Beahan");
        //enter card number
        typeText(By.xpath("//input[@id='CardNumber']"),"4485820639673315");
        //select expiry month
        selectElementValue(By.xpath("//select[@id='ExpireMonth']"),"5");
        //select year of expiry
        selectElementByText(By.xpath("//select[@id='ExpireYear']"),"2024");
        //type security code
        typeText(By.xpath("//input[@id='CardCode']"),"119");
        clickOnElement(By.xpath("//button[@onclick='PaymentInfo.save()']"));
    }
    public void alertMessage(){
        //import Chromoption to handle popup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        options.addArguments("disable-notifications");
    }
}
