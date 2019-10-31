package com.aptafund.test.steps.payroll_steps;

import com.aptafund.test.pages.common.AptaHomePage;
import com.aptafund.test.pages.common.AptaLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by omii on 8/17/2016.
 */
public class ManagePayrollSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(ManagePayrollSteps.class);


    AptaLoginPage aptaLoginPage;
    AptaHomePage aptaHomePage;

    @Step
    public void navigateToLoginPage(){

        String  userNameid = "";
        String password = "";

        aptaLoginPage.open();
        //assertTrue (aptaLoginPage.verifyPageIsOpen());
        //aptaLoginPage.loginIntoApta(userNameid,password);

    }

    @Step
    public void loginIntoSite() {



        String  userNameid = "sysop";
        String password = "abcde";
        aptaLoginPage.loginIntoApta(userNameid,password);
        //assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void accessToMainMenu(){
        aptaHomePage.mainMenuAccess();
    }
}
