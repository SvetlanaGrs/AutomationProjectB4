package io.loop.test.day9;

import io.loop.test.Utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
/*
Go to https://www.loopcamp.io/practice
Scroll down
Generate random email and enter into sign up box
Click on sign up
Verify "you are in" is displayed
*/
public class T3_JSExecutor_scroll {
    @Test
    public void nordstrom_scroll(){

        Driver.getDriver().get("https://www.loopcamp.io");
        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']"));


        //how to scroll
        //#1 use actions class -  move to element
        Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(link).perform();
        actions.scrollToElement(link).perform();


        //#2 use Key Press
        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

        //#3 move horizontally or vertically
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scroll(0,5000)");

        //#4 scroll to view
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        js.executeScript("arguments[0].click()", link);
        js.executeScript("window.scroll(0,500)");
    }
}
