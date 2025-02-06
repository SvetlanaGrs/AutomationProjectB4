package io.loop.test.day8;

import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.rmi.Remote;
import java.security.Key;

public class T1_google_search {
         /*
    1. go to "https://www.google.com"
    2. write "Loop Academy" and search
    3. validate title: Loop Academy - Google Search
     */
    @Test
    public void google_search(){
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,"Loop academy - Google Search", "No match");

    }
    @Test
    public void docuport_search() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        DocuportUtils.login(Driver.getDriver(), "advisor");
        WebElement myUploads = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        myUploads.click();
    }
}
