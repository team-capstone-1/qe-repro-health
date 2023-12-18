package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By ButtonLogout() {return By.id("logout-button");}

    private By ButtonLogoutConfirmation() {return By.id("button-logout-confirm");}

    private By LandingPageValidate() {
        return By.id("hero-sub-title");
    }

    private By DashboardValidate() {
        return By.id("welcome-doctor");
    }
    private By ButtonLogoutConfirmationNo(){
        return By.xpath("//*[@id=\"button-logout-cancel\"]/span");
    }


    @Step
    public void clickButtonLogout() {
        waitABit(5000);
        $(ButtonLogout()).click();
        waitABit(3000);
    }

    @Step
    public void clickButtonLogoutConfirmation() {
        waitABit(5000);
        $(ButtonLogoutConfirmation()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateSuccessLogout() {
        $(LandingPageValidate()).isDisplayed();
    }

    @Step
    public void clickButtonLogoutConfirmationNo() {
        waitABit(5000);
        $(ButtonLogoutConfirmationNo()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateFailedLogout() {
        $(DashboardValidate()).isDisplayed();
    }
}
