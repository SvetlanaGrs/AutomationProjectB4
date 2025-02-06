package io.loop.test.day8;

import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/*
1. Go to “http://demo.guru99.com/test/upload”
2. Upload file into Choose File
3. Click terms of service check box
4. Click Submit File button
5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
*/
public class T3_uploads {
@Test
    public void upload_file() throws InterruptedException {
    Driver.getDriver().get("http://demo.guru99.com/test/upload");
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
    String path = "C:/Users/advok/OneDrive/Desktop/note";
    chooseFile.sendKeys(path);
    WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
    checkbox.click();
    WebElement submit=Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
    submit.click();
    Thread.sleep(5000);

    WebElement successMessage =Driver.getDriver().findElement(By.xpath("//h3[@id='res']"));
    String expected = "1 file\nhas been successfully uploaded.";
    Assert.assertEquals(expected,successMessage.getText(), "No match");
}
}
