package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProfilPage extends PageObject {

    private By ProfilePage() {return By.xpath("/html/body/div[1]/div[3]/main/div/ul/li[8]");}

    private By workExperience() {return By.id("doctor-tab-1");}

    private By education() {return By.id("doctor-tab-2");}

    private By Certificate() {return By.xpath("//*[@id=\"tabs-profile\"]/div/div/section[1]/div[3]/button");}

    private By DetailCertificate() {return By.xpath("//*[@id=\"table-certificate\"]/div/div/table/tbody/tr[2]/td[2]");}

    private By ValidateDetailCertificate() {return By.xpath("//img[contains(@src,'https://res.cloudinary.com/dw3n2ondc/image/upload/v1702058539/Reproduction-Health/aba01d9a-7428-42dc-b757-4c1b6c96defa.png')]");}

    private By SearchCertificate() {return By.xpath("//*[@id=\"search\"]");}


    @Step
    public void clickProfilePage() {
        waitABit(5000);
        $(ProfilePage()).click();
        waitABit(3000);
    }

    @Step
    public void clickworkExperience() {
        waitABit(5000);
        $(workExperience()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateworkExperience() {
        $(workExperience()).isDisplayed();
    }

    //education
    @Step
    public void clickeducation() {
        waitABit(5000);
        $(education()).click();
        waitABit(3000);
    }

    @Step
    public void Validateeducation() {
        $(workExperience()).isDisplayed();
    }

    //Certificate
    @Step
    public void clickCertificate() {
        waitABit(5000);
        $(Certificate()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateCertificate() {
        $(workExperience()).isDisplayed();
    }


    //Detail Certificate
    @Step
    public void clickDetailCertificate() {
        waitABit(5000);
        $(DetailCertificate()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateDetailCertificatePicture() {
        $(ValidateDetailCertificate()).isDisplayed();
    }


    //search

    @Step
    public void clickSearchCertificate(String KeywordCertificate) {
        waitABit(5000);
        $(SearchCertificate()).type(KeywordCertificate);
        waitABit(3000);
    }

    @Step
    public void ValidateSearchCertificate() {
        $(workExperience()).isDisplayed();
    }



    @Step
    public void clickSearchCertificate1(String KeywordCertificate1) {
        waitABit(5000);
        $(SearchCertificate()).type(KeywordCertificate1);
        waitABit(3000);
    }

    @Step
    public void ValidateSearchCertificate1() {
        $(workExperience()).isDisplayed();
    }
}
