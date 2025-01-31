package io.loop.test.day7;

import io.loop.test.Utilities.DocuportConstance;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

import javax.print.Doc;

public class T00_login_docuport extends TestBase {
    @Test
    public void test_login_logout_docuport() throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstance.CLIENT);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstance.EMPLOYEE);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstance.ADVISOR);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstance.SUPERVISOR);
        DocuportUtils.logOut(driver);
    }

}
