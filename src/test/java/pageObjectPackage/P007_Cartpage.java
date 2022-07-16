package pageObjectPackage;

import utilitiesPackage.CommonMethods;

public class P007_Cartpage extends CommonMethods {
        public void P007_Cartpage(){
            PageFactory.initElements(PageDriver.getCurrentDriver(), this);

        }
    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @Step("Click on continue Shopping Button From Cart details window")
    public void clickContinueShopping() {
        continueShoppingButton.click();

    }
    @Step("Click on Proceed To Checkout Button From Cart details window")
    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
