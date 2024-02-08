import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PostAnAdPage extends PageBase{
    public PostAnAdPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.forsale.forsale:id/chooseCategoryField")
    WebElement categoryDropDown;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/tvCategoryName\" and @text=\"Automotive\"]")
    WebElement automotiveCategory;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/tvCategoryName\" and @text=\"Classic Cars\"]")
    WebElement classicCarsCategory;
    @AndroidFindBy(id = "com.forsale.forsale:id/chooseDistrictField")
    WebElement listingField;
    @AndroidFindBy(id = "com.forsale.forsale:id/locationSelectorText")
    WebElement districtField;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\"Ahmadi\"]")
    WebElement ahmadiDistrict;
    @AndroidFindBy(id = "com.forsale.forsale:id/btnProceed")
    WebElement proceedBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/locationSelectorText\" and @text=\"Choose Area\"]")
    WebElement areaField;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\"Middle of Ahmadi\"]")
    WebElement middleOfAhmadiArea;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/locationSelectorText\" and @text=\"Choose Block\"]")
    WebElement blockField;
    @AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"com.forsale.forsale:id/rvSelection\"]/android.view.ViewGroup[1]")
    WebElement firstOption;
    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.forsale.forsale:id/compose_view\"]/android.view.View/android.view.View/android.widget.Button")
    WebElement doneBtn;
    @AndroidFindBy(id = "com.forsale.forsale:id/adTitleField")
    WebElement titleField;
    @AndroidFindBy(id = "com.forsale.forsale:id/adPriceField")
    WebElement priceField;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Media\"]")
    WebElement addMediaTxt;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Kindly Fill all the required information!\"]")
    WebElement ToastTxt;
    @AndroidFindBy(id = "com.forsale.forsale:id/item_plf_close")
    WebElement closeBtn;
    @AndroidFindBy(id = "android:id/button2")
    WebElement leaveBtn;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/textinput_error\"])[2]")
    WebElement requiredMsg;

    public void clickCategoryDropDown(){
        click(categoryDropDown);
    }

    public void chooseAutomotiveCategory(){
        //String elementXpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/tvCategoryName\" and @text=\""+category+"\"]";
        //System.out.println(elementXpath);
        click(automotiveCategory);
    }

    public void chooseClassicCarsCategory(){
        //String elementXpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/tvCategoryName\" and @text=\""+category+"\"]";
        //System.out.println(elementXpath);
        click(classicCarsCategory);
    }

    public void clickListingDropDown(){
        click(listingField);
    }

    public void clickDistrictDropDown(){
        click(districtField);
    }

    public void chooseAhmadiDistrict(){
        //String elementXpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\""+district+"\"]";
        click(ahmadiDistrict);
    }

    public void chooseMiddleOfAhmadiDistrict(){
        //String elementXpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\""+district+"\"]";
        click(middleOfAhmadiArea);
    }

    public void clickDoneBtn(){
        click(doneBtn);
    }

    public void clickAreaDropDown(){
        //String elementXpath = "//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\""+area+"\"]";
        click(areaField);
    }

    public void clickBlockDropDown(){
        click(blockField);
    }

    public void chooseFirstBlock(){
        click(firstOption);
    }

    public void clickProceedBtn(){
        click(proceedBtn);
    }

    public void writeTitle(String title){
        click(titleField);
        sendTxt(titleField, title);
    }

    public void writePrice(String price){
        click(priceField);
        sendTxt(priceField, price);
    }

    public String getAddMediaTxt(){
        return getAttribute(addMediaTxt, "text");
    }

    public String getToastTxt(){
        return getAttribute(ToastTxt, "text");
    }

    public void clickCloseBtn(){
        click(closeBtn);
    }

    public void clickLeaveBtn(){
        click(leaveBtn);
    }

    public String getRequiredMsg(){
        return getAttribute(requiredMsg, "text");
    }

}