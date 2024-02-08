import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.net.MalformedURLException;

public class HappyScenario extends TestBase{

    HomePage homePage;
    LoginPage loginPage;
    PostAnAdPage postAnAdPage;
    ProfilePage profilePage;
    String phoneNum = "00000111";
    String password = "4saleTest";
    String title = "AdvertismentTitle";
    String price = "10";
    //String firstCategory = "Automotive";
    //String secondCategory = "Classic Cars";

    @Test
    public void testHappyScenario() throws MalformedURLException {
        Android_setUp();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        postAnAdPage = new PostAnAdPage(driver);
        profilePage = new ProfilePage(driver);

        homePage.clickPostAnAdBtn();
        loginPage.writePhoneNum(phoneNum);
        loginPage.writePassword(password);
        loginPage.clickLoginBtn();

        postAnAdPage.clickCategoryDropDown();
        postAnAdPage.chooseAutomotiveCategory();
        postAnAdPage.chooseClassicCarsCategory();

        postAnAdPage.clickListingDropDown();
        postAnAdPage.clickDistrictDropDown();
        postAnAdPage.chooseAhmadiDistrict();
        postAnAdPage.clickProceedBtn();

        postAnAdPage.clickAreaDropDown();
        postAnAdPage.chooseMiddleOfAhmadiDistrict();
        postAnAdPage.clickProceedBtn();

        postAnAdPage.clickBlockDropDown();
        postAnAdPage.chooseFirstBlock();
        postAnAdPage.clickProceedBtn();
        postAnAdPage.clickDoneBtn();

        postAnAdPage.writeTitle(title);
        postAnAdPage.writePrice(price);
        driver.navigate().back();
        postAnAdPage.clickDoneBtn();

        Assert.assertEquals(postAnAdPage.getAddMediaTxt(), "Add Media");
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