package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdidasPage extends Utils {
    public void verifyAdidasProductsAreDisplayed() {
        System.out.println("==x===x====xx=");
        //search adidas product
        List<WebElement> productList = driver.findElements(By.cssSelector("h2.product-title"));
        String actualResult = null;
        int i = 0;
        //run a loop to print and check if all products are displayed accordingly
        for (WebElement e : productList) {
            System.out.println(e.getText());
            if(e.getText().contains("adidas")){
                i++;
                actualResult = "adidas";
            }
        }System.out.println("Total Elements Checked "+ i);
        if(productList.size()==i)
            System.out.println("All Products Are Of "+actualResult);

    }

}
