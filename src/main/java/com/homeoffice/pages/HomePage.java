package com.homeoffice.pages;


import com.homeoffice.browserfactory.ManageBrowser;
import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Datasets")
    WebElement dataSet;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'HM Land Registry')]")
    WebElement text;
@CacheLookup
@FindBy(id = "global-cookie-message")
WebElement cookies;

    public void clickOnDataSet() {
        clickOnElement(dataSet);
        log.info("Clicking on login link : " + dataSet.toString());
    }

    public String getText() {
        log.info("Clicking on register link : " + text.toString());
        return getTextFromElement(text);

    }
    public void acceptCookies(){
        clickOnElement(cookies);
    }

}
