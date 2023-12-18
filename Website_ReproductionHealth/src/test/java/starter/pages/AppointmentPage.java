package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AppointmentPage extends PageObject {

    private By MenuAppointment(){return By.xpath("/html/body/div[1]/div[3]/main/div/ul/li[4]");}

    private By searchField() {
        return By.id("search");
    }

    private By ValidateSearch(){return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]");}

    private By InvalidSearch(){return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/form/div/div[1]/p");}

    private By filterField() {
        return By.id("filter");
    }

    private By Berjalan() {
        return By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='waiting'])[1]/following::div[6]");
    }

    private By Menunggu() {
        return By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Berjalan'])[2]/following::div[2]");
    }

    private By Dibatalkan() {
        return By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menunggu'])[6]/following::div[2]");
    }

    private By Selesai() {
        return By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div/div[4]/div");
    }

    private By sesi() {
        return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/div/div/div/div/div/div/table/thead/tr/th[5]/div/span[2]");

    }

    private By sesiPagi() {
        return By.xpath("/html/body/div[3]/div/div/ul/li[1]/span/label/span/input");
    }


    private By sesiSiang() {
        return By.xpath("/html/body/div[3]/div/div/ul/li[2]/span/label/span/input");
    }

    private By sesiMalam() {
        return By.xpath("/html/body/div[3]/div/div/ul/li[3]/span/label/span/input");
    }

    private By buttonReset() {
        return By.xpath("/html/body/div[3]/div/div/div[2]/button[1]/span");
    }

    private By ButtonOK() {
        return By.xpath("/html/body/div[3]/div/div/div[2]/button[2]/span");
    }

    private By patientName(){return By.xpath("//div[@id='appointment-table-list']/div/div/table/tbody/tr[2]/td[8]/button/span");}

    private By transactionDetails(){return By.xpath("//div[@id='card-informasi-janji-temu']/div/div[6]/p[2]/span");}

    private By Validatetransaction(){return By.id("payment-modal");}

    private By transactionDetailFoto(){return By.xpath("//div[@id='payment-modal']/div[3]/div[2]/div/div");}

    private By Validatetransactionfoto(){return By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Preview'])[1]/following::div[18]");}

    private By PatientWaitingStatus(){return By.xpath("//*[@id=\"appointment-table-list\"]/div/div/table/tbody/tr[3]/td[8]/button/span");}

    private By ButtonConfirmation1(){return By.xpath("(//button[@type='button'])[14]");}

    private By Validatetransaction1(){return By.xpath("/html/body/div[1]/div[2]/div/div/div[1]");}

    private By ButtonConfirmation2(){return By.xpath("//*[@id=\"button-logout-confirm\"]/span");}

    private By Validatetransaction2(){return By.id("success-toast");}

    private By nextListAppointment(){return By.xpath("/html/body/div/div[3]/main/section/section/div[2]/div/div/div/div/ul/li[5]");}

    private By patientNameWaiting(){return By.xpath("//*[@id=\"appointment-table-list\"]/div/div/table/tbody/tr[7]/td[8]/button/span");}

    private By ButtonNo(){return By.xpath("//*[@id=\"button-logout-cancel\"]/span");}

    private By ValidateFailedtransaction(){return By.xpath("//*[@id=\"card-informasi-janji-temu\"]/div/div[9]/button/span");}

    private By ascendingName(){return By.xpath("//div[@id='appointment-table-list']/div/div/table/thead/tr/th[2]/div");}

    private By descendingName(){return By.xpath("//div[@id='appointment-table-list']/div/div/table/thead/tr/th[2]/div");}

    private By ascendingOrderNumber(){return By.xpath("//div[@id='appointment-table-list']/div/div/table/thead/tr/th[3]/div");}

    private By descendingOrderNumber(){return By.xpath("//div[@id='appointment-table-list']/div/div/table/thead/tr/th[3]/div");}

    private By ValidateName() {
        return By.xpath("//div[@id='appointment-table-list']/div/div/table/thead/tr/th[2]/div");
    }

    private By nodata(){return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]/td/div/div/div[2]");}

    private By ascendingNamaPasien() {
        return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/div/div/div/div/div/div/table/thead/tr/th[2]/div/span[2]/span/span[1]");
    }

    private By descendingNamaPasien() {
        return By.xpath("/html/body/div[1]/div[3]/main/section/section/div[2]/div/div/div/div/div/div/div/table/thead/tr/th[2]/div/span[2]/span/span[2]");
    }

    @Step
    public void clicksMenuAppointment() {
        $(MenuAppointment()).click();
    }

    @Step
    public void entersearchField(String keywoards) {
         $(searchField()).type(keywoards);
    }

    @Step
    public void ValidateSuccesSearch() {
        $(searchField()).isDisplayed();
    }


    //NEGATIVE SEARCH
    @Step
    public void entersearchFieldincorrect(String keywoards) {
        $(searchField()).type(keywoards);
    }

    @Step
    public void ValidateInvalidSearch() {
        $(searchField()).isDisplayed();
    }



    //filter status
    @Step
    public void clickfilterField() {
        $(filterField()).click();
    }

    @Step
    public void clickfilterBerjalan() {
        waitABit(5000);
        $(Berjalan()).click();
        waitABit(3000);
    }

    @Step
    public void clickfilterMenunggu() {
        waitABit(5000);
        $(filterField()).click();
        waitABit(3000);
    }

    @Step
    public void clickfilterDibatalkan() {
        waitABit(7000);
        $(filterField()).click();
        waitABit(3000);
    }

    @Step
    public void clickfilterSelesai() {
        waitABit(8000);
        $(filterField()).click();
        waitABit(5000);
    }

    @Step
    public void validatefilterMenunggu() {
        $(filterField()).isDisplayed();
    }

    @Step
    public void validatefilterDibatalkan() {
        $(filterField()).isDisplayed();
    }
    @Step
    public void validatefilterberjalan() {
        $(filterField()).isDisplayed();
    }

    @Step
    public void validatefilterSelesai() {
        $(filterField()).isDisplayed();
    }


//transaction detail
    @Step
    public void clickpatientName() {
        $(patientName()).click();
    }

    @Step
    public void clicktransactionDetails() {
        waitABit(7000);
        $(transactionDetails()).click();
        waitABit(3000);
    }


    @Step
    public void validateValidatetransaction() {
        $(Validatetransaction()).isDisplayed();
    }


    @Step
    public void clicktransactionDetailsfoto() {
        waitABit(7000);
        $(transactionDetailFoto()).click();
        waitABit(3000);
    }


    @Step
    public void validateValidatetransactionfoto() {
        $(Validatetransactionfoto()).isDisplayed();
    }


//confirmation Patient

    @Step
    public void clickpatientNameWithWaitingStatus() {
        $(PatientWaitingStatus()).click();
    }

    @Step
    public void clickButtonConfirmation1() {
        waitABit(7000);
        $(ButtonConfirmation1()).click();
        waitABit(7000);
    }

    @Step
    public void ValidateSuccessTransaction1() {
        $(Validatetransaction1()).isDisplayed();
    }
    @Step
    public boolean SuccessMessageConfirmation1(String success1) {

        return $(Validatetransaction1()).getText().equalsIgnoreCase(success1);
    }

    @Step
    public void clickpatientNameWithStatusBerjalan() {
        $(PatientWaitingStatus()).click();
    }

    @Step
    public void clickButtonConfirmation2() {
        waitABit(7000);
        $(ButtonConfirmation2()).click();
        waitABit(3000);
    }


    @Step
    public void ValidateSuccessTransaction2() {
        $(Validatetransaction2()).isDisplayed();
    }
    @Step
    public boolean SuccessMessageConfirmation2(String success2) {

        return $(Validatetransaction2()).getText().equalsIgnoreCase(success2);
    }

    //see next appointment list slide
    @Step
    public void clickNextAppointmentListNumber() {
        $(nextListAppointment()).click();
    }

    @Step
    public void ValidateNextAppoint() {
        $(filterField()).isDisplayed();
    }


    //change status on appointment list to "in progress" failed
    @Step
    public void clickPatientWithWaitingStatus() {
        $(patientNameWaiting()).click();
    }

    @Step
    public void clickButtonNo() {
        waitABit(7000);
        $(ButtonNo()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateChangeStatusTransactions() {
        $(ValidateFailedtransaction()).isDisplayed();
    }


    // Ascending name

    @Step
    public void clickascendingName() {
        waitABit(7000);
        $(ascendingName()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateAscendingName() {
        $(ValidateName()).isDisplayed();
    }


    // Descending name
    @Step
    public void clickDescendingName() {
        waitABit(7000);
        $(descendingName()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateDescendingName() {
        $(ValidateName()).isDisplayed();
    }

    // Ascending no urut
@Step
public void clickascendingOrderNumber() {
    waitABit(7000);
    $(ascendingOrderNumber()).click();
    waitABit(3000);
}

    @Step
    public void ValidateascendingOrderNumber() {
        $(ValidateName()).isDisplayed();
    }

    // Descending no urut
    @Step
    public void clickdescendingOrderNumber() {
        waitABit(7000);
        $(descendingOrderNumber()).click();
        waitABit(3000);
    }

    @Step
    public void ValidatedescendingOrderNumber() {
        $(ValidateName()).isDisplayed();
    }



    //filter sesi
    @Step
    public void clickFillterSesi() {
        $(sesi()).click();
    }

    @Step
    public void clickFillterSesiPagi() {
        $(sesiPagi()).click();
    }

    @Step
    public void clickFillterSesiSiang() {
        $(sesiSiang()).click();
    }

    @Step
    public void clickFillterSesiMalam() {
        $(sesiMalam()).click();
    }

    @Step
    public void clickbuttonReset() {
        $(buttonReset()).click();
    }

    @Step
    public void clickbuttonOK() {
        $(ButtonOK()).click();
    }

    @Step
    public void validatefilterSesi() {
        $(sesi()).click();
    }
}
