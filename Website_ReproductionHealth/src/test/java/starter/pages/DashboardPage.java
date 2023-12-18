package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DashboardPage  extends PageObject {

    private By ButtonMonthly() {
        return By.id("button-filter-monthly");
    }

    private By ButtonWeekly() {
        return By.id("button-filter-weekly");
    }

    private By ButtonDaily() {
        return By.id("button-filter-daily");
    }

    public By ViewAppointment(){ return By.xpath("//*[@id=\"link-to-all-appointment-table\"]");}


    private By ValidateAppointment() {
        return By.xpath("//*[@id=\"content-app\"]/section/h3");
    }

    @Step
    public void clickButtonMonthly() {
        waitABit(7000);
        $(ButtonMonthly()).click();
    }


    @Step
    public boolean validateMonthlyDoctorData(){
        return $(ButtonMonthly()).isDisplayed();
    }

    @Step
    public boolean validateWeeklyDoctorData(){
        return $(ButtonMonthly()).isDisplayed();
    }

    @Step
    public boolean validateDailyDoctorData(){
        return $(ButtonMonthly()).isDisplayed();
    }



    @Step
    public void clickButtonWeekly() {
        waitABit(7000);
        $(ButtonWeekly()).click();
    }



    @Step
    public void clickButtonDaily() {
        waitABit(7000);
        $(ButtonDaily()).click();
    }


    @Step
    public void clickViewAppointment() {
        waitABit(7000);
        $(ViewAppointment()).click();
    }

    @Step
    public void ValidateAppointmentPage() {
        waitABit(7000);
        $(ValidateAppointment()).click();
    }
}

