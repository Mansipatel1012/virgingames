package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]" )
    WebElement acceptCookies;

    //AcceptCookies
    public void clickAcceptCookies(){
        log.info("Clicking on accept cookies ");
        clickOnElement(acceptCookies);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='StyledNavigationMenuList-sc-v46bks-1 fvBWcU']/li")
    List<WebElement> headers;


    public void clickOnAllHeaders(String tab){
        log.info("Clicking on headers: " + headers.toString());
        for (WebElement menu : headers) {
            if(menu.getText().contains(tab)){
                clickOnElement(menu);
                break;
            }
        }

    }
}
