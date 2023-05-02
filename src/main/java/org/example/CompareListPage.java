package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareListPage extends Utils{
    private By _getTextFromGiftCard = By.partialLinkText("$25 Virtual Gift Card");
    private By _getTextFromHTC =By.partialLinkText("HTC One M8 Android L 5.0 Lollipop");
    private By _clickOnClearList = By.className("clear-list");
    private By _getTextFromMessage = By.className("no-data");
    public void checkProductsInCompareList() {
        String expectedResult = "No Product to Compare";
        //Print text of the product 1
        String name1 = getTextFromElement(_getTextFromGiftCard);
        System.out.println("First Product => " + name1);
        //Print text of the product 2
        String name2 = getTextFromElement(_getTextFromHTC);
        System.out.println("Second Product => " + name2);
        //clear compare list
        clickOnElement(_clickOnClearList);
        //print message on page
        String actualResult = getTextFromElement(_getTextFromMessage);
        System.out.println("Message is => " + actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "No Product to compare");
    }
}
