package io.loop.test.day10;

import io.loop.pages.LoopPracticeDynamicLoading1;
import io.loop.test.Utilities.BrowserUtils;
import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/*
    1. go to https://loopcamp.vercel.app/dynamic_loading/1.html
    2. click start
    3. wait loading bar disappears
    4. validate username is displayed
    5. enter username tomsmith
    6. enter password incorrectpassword
    7. click submit button
    8. validate "Your password is invalid!" is displayed
     */
public class T1_dynamic_loading1 {

    LoopPracticeDynamicLoading1 loopPracticeDynamicLoading1 ;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
        loopPracticeDynamicLoading1 = new LoopPracticeDynamicLoading1();

    }
    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void dynamic_loading_1 (){
        BrowserUtils.loopLinkClick("Dynamic Loading");
        BrowserUtils.waitForClickable(loopPracticeDynamicLoading1.dynamicLoading1, 10).click();
        BrowserUtils.waitForClickable(loopPracticeDynamicLoading1.startButton, 10).click();
        BrowserUtils.waitForInvisibility(loopPracticeDynamicLoading1.loadingBar, 10);
        assertTrue(loopPracticeDynamicLoading1.userName.isDisplayed());
        loopPracticeDynamicLoading1.userName.sendKeys(ConfigurationReader.getProperties("dynamicLoading.username"));
        loopPracticeDynamicLoading1.password.sendKeys(ConfigurationReader.getProperties("dynamicLoading.incorrectPassword"));
        loopPracticeDynamicLoading1.submitButton.click();
        assertTrue(BrowserUtils.waitForVisibility(loopPracticeDynamicLoading1.errorMessage, 10).isDisplayed(), "Element is not visible");
    }
}
