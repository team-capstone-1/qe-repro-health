package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class MySchedulesPage extends PageObject {

    private By MySchedulesPage() {return By.xpath("/html/body/div[1]/div[3]/main/div/ul/li[5]");}

    private By PreviousMonth() {return By.xpath("//*[@id=\"button-previous-month\"]");}

    private By NextMonth() {return By.xpath("//*[@id=\"button-next-month\"]");}

    private By Title() {return By.xpath("//*[@id=\"header-calendar\"]/h3");}

    private By Date(){return  By.xpath("//*[@id=\"calendar-schedule\"]/div/div/div/div[2]/div/div/table/tbody/tr[5]/td[1]");}

    private By TimeRange() {return By.xpath("//*[@id=\"switch-pagi\"]");}

    private By ButtonSave() {return By.id("button-submit");}

    private By ButtonConfirmationYes() {return By.xpath("//*[@id=\"button-confirm-schedule\"]/span");}


    private By ButtonConfirmationNo() {return By.xpath("//*[@id=\"button-cancel-schedule\"]/span");}

    private By ToastSuccess() {return By.xpath("//*[@id=\"success-toast\"]/div[1]/div");}

    private By listAppointment() {return By.xpath("//*[@id=\"list-janji-temu\"]/div/div[1]/div[1]/span/p");}


    @Step
    public void clicksMySchedulesPage() {
        waitABit(5000);
        $(MySchedulesPage()).click();
        waitABit(3000);
    }

    @Step
    public void clicksPreviousMonth() {
        waitABit(5000);
        $(PreviousMonth()).click();
        waitABit(3000);
    }

    @Step
    public void clicksNextMonth() {
        waitABit(5000);
        $(NextMonth()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateMySchedulesForTheLastMonth() {
        $(Title()).isDisplayed();
    }

    @Step
    public void ValidateMySchedulesForTheNextMonth() {
        $(Title()).isDisplayed();
    }

    //change the schedule for the next day
    @Step
    public void clicksDate() {
        waitABit(5000);
        $(Date()).click();
        waitABit(3000);
    }

    @Step
    public void clicksTimeRange() {
        waitABit(5000);
        $(TimeRange()).click();
        waitABit(3000);
    }

    @Step
    public void clicksButtonSave() {
        waitABit(5000);
        $(ButtonSave()).click();
        waitABit(3000);
    }

    @Step
    public void clicksButtonConfirmationYes() {
        waitABit(5000);
        $(ButtonConfirmationYes()).click();
        waitABit(3000);
    }


    @Step
    public void ValidateToastSuccess() {
        $(ToastSuccess()).isDisplayed();
    }

    @Step
    public boolean correctAlertSuccessMessage(String messageSuccess) {

        return ($(ToastSuccess()).getText().equalsIgnoreCase(messageSuccess));

    }

//failed to change the schedule for the next day
    @Step
    public void clicksButtonConfirmationNo() {
        waitABit(5000);
        $(ButtonConfirmationNo()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateFailedChangeTheSchedule() {
        $(Title()).isDisplayed();
    }


//View the appointment schedule for one day in each range
    @Step
    public void clickslistAppointment() {
        waitABit(5000);
        $(listAppointment()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateAppointmentScheduleForOneDayInEachRange() {
        $(ButtonSave()).isDisplayed();
    }
}
