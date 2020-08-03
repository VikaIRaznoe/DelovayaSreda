package ru.delovayasreda;

import org.testng.annotations.Test;
import ru.delovayasreda.pages.MailRu_MainPage;
import ru.delovayasreda.pages.RegistrationForm_OnPage;

public class RegistrationTest extends BaseTest {
    @Test

    public void positiveTest(){
        MailRu_MainPage mailRu_mainPage = new MailRu_MainPage(driver);
        RegistrationForm_OnPage registrationForm_onPage = mailRu_mainPage.submitCreateMailLink();
    }
}
