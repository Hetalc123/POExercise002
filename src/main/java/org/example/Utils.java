package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Utils extends BasePage{
    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }

    public static long datestamp() {
        SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy HH.mm");
        return sd.hashCode();
    }
    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectElementByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectElementValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static void selectElementByIndex(By by, int num){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
    public static void searchbar(String text) {
       driver.findElement(By.xpath("input[@type='text']")).sendKeys(text);
    }
    public static void waitForInvisibility(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitForVisibility(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForClickable(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void acceptAlert(String text){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),text);
        alert.accept();
    }
    public static void dismissAlert(String text){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),text);
        alert.dismiss();
    }
    public static void typeTextInAlert(String typetext, String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(typetext);
        Assert.assertEquals(alert.getText(),text);
        alert.accept();
    }
    public static List<WebElement> webArrayList(By by) {
    List<WebElement> list = new ArrayList<>(driver.findElements(by));
        return list;
    }
}
