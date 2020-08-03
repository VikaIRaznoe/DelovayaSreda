package ru.delovayasreda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationForm_OnPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='fname']")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id='fname']")
    private WebElement familiyaInput;

    @FindBy(xpath = "//*[@data-test-id='gender-male']")
    private WebElement polRadioBox;

    @FindBy(xpath = "//*[@data-test-id='birth-date__day']")
    private WebElement daySelector;

    @FindBy(xpath = "//*[@data-test-id='birth-date__month']")
    private WebElement monthSelector;

    @FindBy(xpath = "//*[@data-test-id='birth-date__year']")
    private WebElement yearSelector;

    @FindBy(xpath = "//*[@id='aaa__input']")
    private WebElement mailInput;

    @FindBy(xpath = "//*[@id='aaa__select']")
    private WebElement domainSelect;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='phone-number__phone-input']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@data-test-id='first-step-submit']")
    private WebElement registrationSubmit;

    public void submitRegisterNow(){

    }

    public RegistrationForm_OnPage(WebDriver driver) {
        super(driver);
    }
}
