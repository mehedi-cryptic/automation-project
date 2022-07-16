package pageObjectPackage;

import driverPackage.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class P004_MyAccountpage {

    public P004_MyAccountpage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }


    @FindBy(css = "a[title='Log me out']")
    public WebElement signOutButton;

    @FindBy(css = "a[title='View my customer account'] span")
    public WebElement userName;


    @Step("Click on Sign Out Button")
    public void clickSignOutButton() {
        signOutButton.click();

    }
}

