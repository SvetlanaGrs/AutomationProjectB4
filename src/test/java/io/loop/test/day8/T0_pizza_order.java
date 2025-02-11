package io.loop.test.day8;

import io.loop.test.Utilities.PizzaOrderWebTableUtil;
import io.loop.test.base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_pizza_order extends TestBase {
@Test
    public void test_pizza_type(){
    driver.get("https://loopcamp.vercel.app/web-tables.html");  //or Driver.getDriver().get(....)
    String name = "Samuel Jackson";
    String expectedPizzaType = "Italian";
    String actualPizzaType = PizzaOrderWebTableUtil.returnFieldValue(driver,name,"pizza type");
    System.out.println("actualPizzaType = " + actualPizzaType);
    Assert.assertEquals(actualPizzaType, expectedPizzaType,"Actual does not match expected");
}
}
