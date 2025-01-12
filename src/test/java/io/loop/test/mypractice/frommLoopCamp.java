package io.loop.test.mypractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
public class frommLoopCamp {
    public static void main(String[] args) {
        // create driver object
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();

        //navigate to loopcamp practice page

        driver.navigate().to("https://loopcamp.vercel.app/registration_form.html");
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Svetlana");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Grishina");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("sovetka12");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("LoopAcademy!");

        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();

        WebElement programmingLanguage = driver.findElement(By.name("programming_language"));
       programmingLanguage.click();

    }
}
