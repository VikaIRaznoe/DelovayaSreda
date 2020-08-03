package ru.delovayasreda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailRu_MainPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Создать почту')] ")
    private WebElement createMailLink;

    @FindBy(xpath = "//*[@id='mailbox:login']")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id='mailbox:submit']/input")
    private WebElement passwordButton;

    //@FindBy(css = "#mailbox\\:password")
    @FindBy(xpath = "//*[@id='mailbox:password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='mailbox:submit]/input")
    private WebElement toEnterInMail;

    @FindBy(xpath = "//*[@id='mailbox:domain']")
    private WebElement domainSelector;

    public WebElement getDomainSelector() {
        return domainSelector;
    }

    public WebElement getToEnterInMail() {
        return toEnterInMail;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordButton() {
        return passwordButton;
    }

    public WebElement getLoginInput() {
        return loginInput;
    }

    public WebElement getCreateMailLink() {
        return createMailLink;
    }

    public RegistrationForm_OnPage submitCreateMailLink(){
        getCreateMailLink().click();
        return new RegistrationForm_OnPage(driver);
    }

    public void enterLoginOnFormAuthorization(){
        getLoginInput().click();
        getLoginInput().sendKeys("ivanov_020395");
        getPasswordButton().click();
    }

    public void enterPasswordOnFormAuthorization(){
        getPasswordInput().click();
        getPasswordInput().sendKeys("temp123qwerty=)*");
    }

    public void submitButtonToEnter(){
        getToEnterInMail().click();
    }

    public MailRu_MainPage(WebDriver driver) {
        super(driver);
    }


}
