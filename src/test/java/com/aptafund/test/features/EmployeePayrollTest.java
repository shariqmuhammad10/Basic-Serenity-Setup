package com.aptafund.test.features;

import com.aptafund.test.steps.payroll_steps.ManagePayrollSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by omii on 8/17/2016.  THIS THE NEW PROJECT WHICH WILL BE RUNNING INSHA ALLAH
 */

@RunWith(SerenityRunner.class)


public class EmployeePayrollTest {
    private static final Logger logger = LoggerFactory.getLogger(EmployeePayrollTest.class);

    @Managed
    WebDriver driver;


    @Steps
    ManagePayrollSteps managePayrollSteps;



    @Test
    public void verifyLoginPageIsAppearing() {

        managePayrollSteps.navigateToLoginPage();

    }

    @Test
    public void VerifyLoginIntoSite() {

        managePayrollSteps.navigateToLoginPage();

        managePayrollSteps.loginIntoSite();

    }


    @Test
    public void openMainMenu(){
        managePayrollSteps.navigateToLoginPage();
        managePayrollSteps.loginIntoSite();
        managePayrollSteps.accessToMainMenu();


    }

    @Ignore
    @Test
    public void test2(){}


}