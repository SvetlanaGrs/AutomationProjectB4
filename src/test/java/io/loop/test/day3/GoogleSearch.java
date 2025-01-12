package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the browser
 */
public class GoogleSearch {
    public static void main(String[] args) {
        //create driver object
        WebDriver driver = new ChromeDriver();
        //navigate to Google
        driver.navigate().to("https://www.google.com");
        //driver.get() also the same result

        //maximize
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + " matches expected title: "+ expectedTitle + ". => TEST PASS");
        }else {
            System.out.println("Actual title: " + actualTitle + " DOES NOT matches expected title: "+ expectedTitle + ". => TEST FAIL");
        }

        String expectedUrl = "https://www.google.com";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Actual title: " + actualTitle + " matches expected title: "+ expectedTitle + ". => TEST PASS");
        }else {
            System.out.println("Actual title: " + actualTitle + " DOES NOT matches expected title: "+ expectedTitle + ". => TEST FAIL");
        }
        driver.quit();
    }
}
