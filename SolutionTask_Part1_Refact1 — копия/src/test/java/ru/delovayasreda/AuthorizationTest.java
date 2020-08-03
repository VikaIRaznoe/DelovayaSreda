package ru.delovayasreda;


import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ru.delovayasreda.pages.MailRu_MainPage;

public class AuthorizationTest extends BaseTest {

    @Test
    @Description("Почта: Авторизация")
    public void test(){
        MailRu_MainPage mailRuMainPage = new MailRu_MainPage(driver);
        mailRuMainPage.enterLoginOnFormAuthorization();
        //mailRuMainPage.enterPasswordOnFormAuthorization();
    }
}
