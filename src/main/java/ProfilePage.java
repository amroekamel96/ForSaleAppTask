import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProfilePage extends PageBase{
    public ProfilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.forsale.forsale:id/new_profile_main_container\"]/android.view.View/android.widget.Button[1]")
    WebElement editBtn;
    @AndroidFindBy(id = "com.forsale.forsale:id/btnUnsubscribe")
    WebElement unsubscribeBtn;
    @AndroidFindBy(id = "com.forsale.forsale:id/btnLogout")
    WebElement logoutBtn;
    @AndroidFindBy(id = "com.forsale.forsale:id/btnConfirmLogout")
    WebElement confirmLogoutBtn;



    public void clickEditBtn(){
        click(editBtn);
    }

    public void clickUnsubscribeBtn(){
        click(unsubscribeBtn);
    }

    public void clickLogoutBtn(){
        click(logoutBtn);
    }

    public void clickConfirmLogoutBtn(){
        click(confirmLogoutBtn);
    }
}