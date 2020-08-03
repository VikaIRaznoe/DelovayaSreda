package ru.delovayasreda;


import org.testng.annotations.Test;
import ru.delovayasreda.pages.MailRu_MainPage;

public class AuthorizationTest extends BaseTest {

    @Test
    public void positiveTest(){
        MailRu_MainPage mailRuMainPage = new MailRu_MainPage(driver);
        mailRuMainPage.enterLoginOnFormAuthorization();
        mailRuMainPage.enterPasswordOnFormAuthorization();
    }
}
