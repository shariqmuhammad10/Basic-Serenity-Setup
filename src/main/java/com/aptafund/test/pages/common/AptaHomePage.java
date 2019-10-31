package com.aptafund.test.pages.common;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by omii on 8/17/2016.
 */
public class AptaHomePage extends WaitActions {

    @FindBy (id = "btnLogout")
    private WebElementFacade homePageTitle;

    @FindBy(xpath = "//title ['AMOS Framework']")
    private WebElementFacade pageTitle;

    @FindBy(xpath = "//ion-button[@id='button-menu']")
    private WebElementFacade mainMenuButton;


//    @FindBy (id = "btnLogout")
//    private WebElementFacade homePageTitle;
//
//    @FindBy (id = "btnLogout")
//    private WebElementFacade homePageTitle;
//
//    @FindBy (id = "btnLogout")
//    private WebElementFacade homePageTitle;


    public boolean homePageIsDisplayed(){
        waitUntilLoaded(pageTitle);
        return homePageTitle.isDisplayed();

    }


    public void mainMenuAccess(){
        waitUntilLoaded(mainMenuButton);
        mainMenuButton.click();
    }







}
