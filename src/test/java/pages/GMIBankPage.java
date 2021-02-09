package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIBankPage {
    public GMIBankPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement profilLogoluDropdown;
    @FindBy(xpath = "//*[.='Register']")
    public WebElement registerLinki;
}
