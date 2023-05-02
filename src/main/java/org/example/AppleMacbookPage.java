package org.example;

import org.openqa.selenium.By;

public class AppleMacbookPage extends Utils{
    private By _clickOnEmail = By.xpath("//button[@class='button-2 email-a-friend-button']");
    public void clickOnEmailAFriend(){
        clickOnElement(_clickOnEmail);
    }
}
