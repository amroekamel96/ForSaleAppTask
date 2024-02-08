import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"phoneNumberField\"]/android.view.View/android.widget.EditText")
    WebElement phoneNumField;

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    WebElement passwordField;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"loginBtn\"]/android.widget.Button")
    WebElement loginBtn;


    public void writePhoneNum(String phoneNum){
        click(phoneNumField);
        sendTxt(phoneNumField, phoneNum);
    }

    public void writePassword(String password){
        click(passwordField);
        sendTxt(passwordField, password);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }


}