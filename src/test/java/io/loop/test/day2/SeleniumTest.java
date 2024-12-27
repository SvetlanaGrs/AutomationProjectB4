package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //Setting up the web driver
        //WebDriverManager.chromedriver().setup();
        //If you use older version of selenium(4.21) you need webdrivermanager and boni garcia dependency

        //create the instance of the driver
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); //also can use

        //navigate to the page
        driver.get("https://www.loopcamp.io");

        //wait
        Thread.sleep(3000);

        //navigate to the page
        driver.navigate().to("https://www.google.com");

        //navigate back
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //for refreshing the page
        driver.navigate().refresh();

        //quitting the browser
        driver.quit();

    }
}
