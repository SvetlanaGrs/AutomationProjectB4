package io.loop.test.day5;
/*
    1. Open Chrome browse
    2. Go to http://the-internet.herokuapp.com/dropdown
    3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”

 */
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T3_simple_dropdown {
    WebDriver driver;
    String expected ="Please select an option";
    String actual ;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();

    }

    @Test
    public void dropDownTest(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //create a dropdown
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(dropdownElement);
        //Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));   ALSO can create like this
        actual = dropdown.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Actual does not match expected");

    }


    @AfterMethod
    public void tearDownMethod (){
        driver.close();
    }
}
