package io.loop.test.day3;

import io.loop.test.Utilities.DocuportConstance;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * go to docuport
 * enter username
 * do NOT enter password
 * click on login button
 * verify error message - please enter password
 */
public class T1_locators_getText {
    public static void main(String[] args) {

        WebDriver driver =  WebDriverUtil.getDriver(DocuportConstance.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstance.DOCUPORT_TEST);

        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstance.USERNAME_CLIENT);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessage.getText();

        if(actualErrorMessage.equals(DocuportConstance.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstance.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.err.println("Expected error message: " + DocuportConstance.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT MATCH actual error message: " + actualErrorMessage + " => TEST FAIL");
        }

    }
}
