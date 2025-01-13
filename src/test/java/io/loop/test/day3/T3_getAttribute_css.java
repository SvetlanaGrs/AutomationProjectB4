package io.loop.test.day3;

import io.loop.test.Utilities.DocuportConstance;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.print.Doc;
import java.sql.Driver;
/*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"
*/

 /*
    the rest is HOMEWORK
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */

public class T3_getAttribute_css {
    public static void main(String[] args) {
        //GO TO THE URL
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstance.DOCUPORT_TEST);

        //locate the element with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        //get the value of the attribute
        //String docuport = logo.getDomAttribute()
        String docuport = logo.getDomProperty("alt");
        System.out.println("docuport = " + docuport);

        if(DocuportConstance.LOGO_DOCCUPORT.equals(docuport)){
            System.out.println("Expected result matches with actual");
            System.out.println("Test pass");
        }else{
            System.out.println("Expected result DOES NOT match the actual");
            System.out.println("Test fail");
        }

    }
}
