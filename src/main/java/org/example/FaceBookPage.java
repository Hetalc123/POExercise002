package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class FaceBookPage extends Utils{
    public void verifyFaceBookPage(){
        //store parentWindow in variable
        String parentWindow = driver.getWindowHandle();
        //switching from parentwindow to childwindow
        for(String childWindow: driver.getWindowHandles()){
            driver.switchTo().window(childWindow);
        }//accept cookies
        WebElement cookieAccept = driver.findElement(By.xpath("//*[@id=\'facebook\']/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div"));
        cookieAccept.click();
        //switch to another child window
        for (String newChildWindow: driver.getWindowHandles()){
            driver.switchTo().window(newChildWindow);
        }//click on close
        WebElement loginWindow = driver.findElement(By.xpath("//div[@class='x92rtbv x10l6tqk x1tk7jg1 x1vjfegm']"));
        loginWindow.click();
        //get current URL
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        //check if email field is present
        if(driver.findElement(By.xpath("//input[@type='email']")).isDisplayed()){
            System.out.println("Email Field is Present");
        }else {
            System.out.println("Email Field is not Present");
            //verify if password field is present
        }if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()){
            System.out.println("Password Field is Present");
        }else {
            System.out.println("Password Field is not Present");
            //check if login button is present
        }if(driver.findElement(By.xpath("//div[@class='x6s0dn4 x78zum5']")).isDisplayed()){
            System.out.println("Login Button Is Present");
        }else {
            System.out.println("Login Button Is not Present");
            //close the current window
        }driver.close();
        //switch to parentWindow
        driver.switchTo().window(parentWindow);
        //get the URL
        String s = driver.getCurrentUrl();
        System.out.println(s);
        // verify WelCome Message
        String actualResult = getTextFromElement(By.xpath("//div[@class='topic-block-title']/h2"));
        Assert.assertEquals(actualResult,"Welcome to Nopecommerce");
        driver.quit();
    }
}
