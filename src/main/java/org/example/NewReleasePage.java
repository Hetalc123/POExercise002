package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewReleasePage extends Utils{
    public void typeComment(){
        //type comment title
        typeText(By.cssSelector("input.enter-comment-title"),"Message");
        //type comment
        typeText(By.className("enter-comment-text"),"Good Work nopcommerce");
        //click on add comment
        clickOnElement(By.name("add-comment"));
    }
    public void verifyCommentAddedSuccessfullyOrNot(){
        //verify and print comment
       String message = getTextFromElement(By.cssSelector("div.result"));
        System.out.println(message);
    }
    public void verifyCommentIsDisplayedAtLast(){
        //verify the latest comment is displaed at last in comment field
        List<WebElement> comment = driver.findElements(By.cssSelector("p.comment-text"));
        WebElement a = comment.get(comment.size()-1);
        Assert.assertEquals(a.getText(),"Good Work");
    }
}
