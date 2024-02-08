import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.forsale.forsale:id/navigation_bar_item_icon_view\"])[3]")
    WebElement PostAnAdBtn;
    @AndroidFindBy(id = "com.forsale.forsale:id/navgraph_more")
    WebElement profileBtn;

    public void clickPostAnAdBtn(){
        click(PostAnAdBtn);
    }

    public void clickProfileBtn(){
        click(profileBtn);
    }
}