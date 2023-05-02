package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    public void openBrowser(){
        //open the browser
        driver = new ChromeDriver();
        //open the url
        driver.get("https:/demo.nopcommerce.com/");
        //maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser() {
        //close the browser
        driver.close();
    }
}
