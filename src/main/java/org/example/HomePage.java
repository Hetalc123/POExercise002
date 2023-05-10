package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;


public class HomePage extends Utils {
    private By _clickOnGood = By.xpath("//label[@for='pollanswers-2']");
    private By _clickOnVote = By.xpath("//button[@id='vote-poll-1']");
    private By _errorMessage = By.xpath("//div[@class='poll-vote-error']");
    private By _product1 = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]");
    private By _compareList = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _product2 = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4]");
    private By _clickOnProduct = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _electronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _registerButton = By.className("ico-register");
    private By _clickOnLogin = By.className("ico-login");
    private By _totalVote = By.className("poll-total-votes");

    public void communityPoll() {
        //click on good
        clickOnElement(_clickOnGood);
        //click on vote
        clickOnElement(_clickOnVote);
    }

    public void communityPollErrorMessage() {
        String expectedResult = "Non Registered User Cannot Vote";
        //add wait time till print the message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_errorMessage));
        //get and print the message
        String actualResul = getTextFromElement(_errorMessage);
        System.out.println(actualResul);
        //check if actual result is same as expected
        Assert.assertEquals(actualResul, expectedResult, "Test Fail");
    }

    public void communityPollVoteMessage() {
        String expectedResult = "18 vote(s)";
        String actualResult = getTextFromElement(_totalVote);
        System.out.println(actualResult);
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Total votes");
    }

    public void addProductsInCompareList() {
        //add Item 1 in compare list
        clickOnElement(_product1);
        //add wait time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(_compareList));
        //add another product to compare list
        clickOnElement(_product2);
        //go to compare list
        clickOnElement(_compareList);
    }

    public void clickOnProduct() {
        //click on product
        clickOnElement(_clickOnProduct);
    }

    public void clickOnElectronics() {
        clickOnElement(_electronics);
    }

    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }

    public void clickOnLoginButton() {
        //click on login Button
        clickOnElement(_clickOnLogin);
    }

    public void printProductTitle() {
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }

    public void verifySearchButtonAlert() {
        String expectedMessage = "Please enter some search keyword";
        clickOnElement(By.xpath("//button[@type='submit']"));
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), expectedMessage);
        alert.accept();
    }

    public void verifyProductPriceAreDisplayedAsPerSelectedCurrency() {
        //select US Dollar In currencySelector
        selectElementByText(By.id("customerCurrency"), "US Dollar");
        List<WebElement> priceList = webArrayList(By.cssSelector("div.prices"));
        String actualResult = null;
        //print pice of the product
        System.out.println("Price in US Dollar");
        int i = 0;
        for (WebElement e : priceList) {
            System.out.println(e.getText());
            //get the price symbol to compare
            if (e.getText().contains("$"))
                i++;
            actualResult = e.getText().replaceAll("[0-9,,,.]", "");
        }
        System.out.println("Total Elements Checked " + i);
        if (priceList.size() == i) {
            System.out.println("All Products Price Are in " + actualResult);
        }
        int j = 0;
        //select euro from currency selector
        selectElementByText(By.id("customerCurrency"), "Euro");
        List<WebElement> priceList2 = webArrayList(By.cssSelector("div.prices"));
        String actualResult2 = null;
        System.out.println("Price in Euro");
        for (WebElement e2 : priceList2) {
            System.out.println(e2.getText());
            if (e2.getText().contains("€"))
                j++;
            actualResult2 = e2.getText().replaceAll("[0-9,,,.]", "");
        }
        System.out.println("Total Elements Checked " + j);
        if (priceList2.size() == j)
            System.out.println("All Products Price Are in " + actualResult2);
        //check if price is displayed in selected currency
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, "£");
        softAssert.assertEquals(actualResult2, "£");
        softAssert.assertAll();
    }

    public void searchTheProductAndClikOnSearchButton() {
        //type product name in searchbar
        typeText(By.xpath("//input[@type='text']"), "Nike");
        //click on search Button
        clickOnElement(By.xpath("//button[@type='submit']"));
    }

    public void searchAdidasProductAndClickOnSearchButton() {
        typeText(By.xpath("//input[@type='text']"), "adidas");
        clickOnElement(By.xpath("//button[@type='submit']"));
    }

    public void clickOnNewRelease() {
        //click on new release
        clickOnElement(By.partialLinkText("nopCommerce new release!"));
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(By.xpath("//img[@title='Show details for Build your own computer']"));
    }

    public void clickOnFacebook() {
        //click on facebook
        clickOnElement(By.partialLinkText("Facebook"));
    }

    public void verifyVoteAlert() {
        clickOnElement(By.xpath("//button[@id='vote-poll-1']"));
        acceptAlert("Please select an answer");
    }
}
