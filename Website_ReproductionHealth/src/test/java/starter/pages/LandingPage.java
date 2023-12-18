package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class LandingPage extends PageObject {

    private By home() {
        return By.id("link-home-navbar");
    }

    private void scrollDown() {
        WebElementFacade element = find(home());
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }



    private By PartnerTerpercaya() {
        return By.id("hero-sub-title");
    }

    private By about() {
        return By.id("link-about-navbar");
    }

    private By validabout() {
        return By.id("about-title");
    }

    private By service() {
        return By.id("link-service-navbar");
    }

    private By validservice() {
        return By.id("services-title");
    }

    private By benefit() {
        return By.xpath("/html/body/div/div[3]/nav/div/ul/li[4]/a");
    }

    private By validBenfit() {
        return By.id("benefit-title");
    }


    private By ketentuanPengguna() {
        return By.xpath("/html/body/div/div[3]/div/div/div[3]/div/a[1]/p");
    }

    private By validketentuanPengguna() {
        return By.id("user-terms-title");
    }

    private By kebijakanPrivasi() {
        return By.xpath("/html/body/div/div[3]/div/div/div[3]/div/a[2]/p");
    }

    private By validkebijakanPrivasi() {
        return By.xpath("/html/body/div/div[3]/main/div[2]/section[1]/h1");
    }

    private By FAQ() {
        return By.xpath("/html/body/div/div[3]/div/div/div[3]/div/a[3]/p");
    }

    private By validFAQ() {
        return By.id("faq-title");
    }

    private By buttonLandingpage() {
        return By.id("button-cta-doctor");
    }

    private By buttondoctorPage() {
        return By.id("login-as-doctor-button");
    }


    private By dropdownFAQ() {
        return By.xpath("/html/body/div/div[3]/main/div[2]/section[1]/div[1]/div[1]/div[1]");
    }

    private By buttonHubungi() {
        return By.id("call-to-action-button");
    }


    @Step
    public void openPage() {
        open();
    }

    @Step
    public void clickHome() {
        waitABit(5000);
        $(home()).click();
        waitABit(3000);
    }


    @Step
    public boolean validateOnhome() {
        return $(PartnerTerpercaya()).isDisplayed();
    }


    @Step
    public void clicksAbout() {
        $(about()).click();
    }

    @Step
    public boolean validateOnabout() {
        return $(validabout()).isDisplayed();
    }


    @Step
    public void clickservice() {
        $(service()).click();
    }

    @Step
    public boolean validateOnservice() {
        return $(validservice()).isDisplayed();
    }


    @Step
    public void clickbenefit() {
        $(benefit()).click();
    }

    @Step
    public boolean validateOnBenefit() {
        return $(validBenfit()).isDisplayed();
    }

    @Step
    public void clickketentuanPengguna() {
        $(ketentuanPengguna()).click();
    }

    @Step
    public boolean validateOnketentuanPengguna() {
        return $(validketentuanPengguna()).isDisplayed();
    }

    @Step
    public void clickkebijakanPrivasi() {
        $(kebijakanPrivasi()).click();
    }

    @Step
    public boolean validateOnkebijakanPrivasi() {
        return $(validkebijakanPrivasi()).isDisplayed();
    }

    @Step
    public void clickFAQ() {
        $(FAQ()).click();
    }

    @Step
    public boolean validateOnFAQ() {
        return $(validFAQ()).isDisplayed();
    }

    @Step
    public void clickdropdownFAQ() {
        $(dropdownFAQ()).click();
    }

    @Step
    public void clickbuttonLandingpage() {
        $(buttonLandingpage()).click();
    }

    @Step
    public boolean validateDoctorPage() {
        return $(buttondoctorPage()).isDisplayed();
    }

    @Step
    public void clickbuttonHubungiKami() {
        waitABit(5000);
        $(buttonHubungi()).click();
        waitABit(3000);
    }

    @Step
    public boolean validatebuttonHubungi() {
        return $(buttonHubungi()).isDisplayed();
    }

}
