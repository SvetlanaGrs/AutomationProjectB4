package io.loop.test.day7;

         /*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

     */


import com.beust.ah.A;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_iframe_practice {

    WebDriver driver;
    @Test
    public void left(){
        driver= WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/nested-frames.html");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();

        Assert.assertEquals(actualLeft.trim(), "LEFT", "No");

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-middle");
        WebElement middle = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
        String actualMiddle =middle.getText();

        Assert.assertEquals(actualMiddle, "MIDDLE", "No2");

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        WebElement right = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
        String actualRight =right.getText();

        Assert.assertEquals(actualRight, "RIGHT", "No3");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom= driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        String actualBottom =bottom.getText();

        Assert.assertEquals(actualBottom, "BOTTOM", "No4");
    }
}
