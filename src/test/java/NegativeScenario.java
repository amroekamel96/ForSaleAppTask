import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class NegativeScenario extends TestBase{

    HomePage homePage;
    LoginPage loginPage;
    PostAnAdPage postAnAdPage;
    ProfilePage profilePage;
    String phoneNum = "00000111";
    String password = "4saleTest";

    @Test
    public void ValidateThatValidationMsgAppearsWhenUserDoesntFillRequiredInfo() throws MalformedURLException {
        Android_setUp();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        postAnAdPage = new PostAnAdPage(driver);

        homePage.clickPostAnAdBtn();
        loginPage.writePhoneNum(phoneNum);
        loginPage.writePassword(password);
        loginPage.clickLoginBtn();

        postAnAdPage.clickCategoryDropDown();
        postAnAdPage.chooseAutomotiveCategory();
        postAnAdPage.chooseClassicCarsCategory();
        postAnAdPage.clickDoneBtn();

        Assert.assertEquals(postAnAdPage.getRequiredMsg(), "Required");
    }

    @AfterTest
    public void logOut(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        postAnAdPage = new PostAnAdPage(driver);
        profilePage = new ProfilePage(driver);

        postAnAdPage.clickCloseBtn();
        postAnAdPage.clickLeaveBtn();

        homePage.clickProfileBtn();

        profilePage.clickEditBtn();
        profilePage.clickUnsubscribeBtn();
        profilePage.clickLogoutBtn();
        profilePage.clickConfirmLogoutBtn();

        tearDown();

    }
}