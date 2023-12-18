package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ForumPage extends PageObject {

    private By ForumPage1() {return By.xpath("/html/body/div[1]/div[3]/main/div/ul/li[7]");}

    private By SearchForum() {return By.xpath("//*[@id=\"search-bar-forum-1\"]");}

    private By AllDiscussion() {return By.id("tab-1");}

    private By popular() {return By.id("popular-1");}

    private By news() {return By.id("news-1");}

    private By notYetAnswered() {return By.id("tab-2");}

    private By popular2() {return By.id("popular-1");}

    private By news2() {return By.id("news-1");}

    private By seeMore1() {return By.id("see-more-2");}
    private By seeMore() {return By.id("see-more-1");}

    private By AnswerForums() {return By.id("reply-forum");}

    private By ButtonSendAnswer() {return By.xpath("//*[@id=\"send-reply\"]/span");}

    private By ConfirmationSendAnswer() {return By.xpath("//*[@id=\"button-logout-confirm\"]/span");}

    private By ConfirmationSendAnswerNo() {return By.xpath("//*[@id=\"button-logout-cancel\"]/span");}

    private By ValidationAnswerDiscussion() {return By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div");}

    private By ValidationDetailDiscussion() {return By.xpath("//*[@id=\"content-app\"]/div/div/div[2]/div/div[1]/h5");}

    private By ValidationFailedAnswerDiscussion() {return By.xpath("//*[@id=\"error-toast\"]/div[1]/div");}

    private By ValidationFailedAnswerDiscussion1() {return By.xpath("//*[@id=\"content-app\"]/div/div/div[2]/div/form/span");}



    @Step
    public void clicksForumPage() {
        waitABit(5000);
        $(ForumPage1()).click();
        waitABit(3000);
    }

    @Step
    public void clicksSearchForum(String KeywordDiscussion) {
        waitABit(5000);
        $(SearchForum()).type(KeywordDiscussion);
        waitABit(3000);
    }

    @Step
    public void ValidateSearchForum() {
        waitABit(5000);
        $(SearchForum()).isDisplayed();
        waitABit(3000);
    }

    @Step
    public void clicksSearchForum1(String KeywordDiscussion1) {
        waitABit(5000);
        $(SearchForum()).type(KeywordDiscussion1);
        waitABit(3000);
    }

    @Step
    public void clicksAllDiscussion() {
        waitABit(5000);
        $(AllDiscussion()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateAllDiscussionsInTheForum() {
         $(AllDiscussion()).isDisplayed();
    }


    @Step
    public void clickspopular() {
        waitABit(5000);
        $(popular()).click();
        waitABit(3000);
    }
    @Step
    public void ValidatePopularDiscussionsOnTheForumDiscussions() {
        $(popular()).isDisplayed();
    }

    @Step
    public void clicksNewInTheForum() {
        waitABit(5000);
        $(news()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateTheLatestDiscussionsForumDiscussions() {
        $(news()).isDisplayed();
    }

    @Step
    public void clicksnotYetAnswered() {
        waitABit(5000);
        $(notYetAnswered()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateAListOfUnansweredDiscussions() {
        $(notYetAnswered()).isDisplayed();
    }

    @Step
    public void clickspopular2() {
        waitABit(5000);
        $(popular2()).click();
        waitABit(3000);
    }

    @Step
    public void clicksnews2() {
        waitABit(5000);
        $(news2()).click();
        waitABit(3000);
    }

    @Step
    public void clicksseeMore() {
        waitABit(5000);
        $(seeMore()).click();
        waitABit(3000);
    }

    @Step
    public void ValidateAllDetailDiscussionsForumDiscussions() {
        $(ValidationDetailDiscussion()).isDisplayed();
    }

    @Step
    public void clicksAnswerForums() {
        waitABit(5000);
        $(AnswerForums()).click();
        waitABit(3000);
    }

    @Step
    public void inputAnswer(String Answer) {
        $(AnswerForums()).type(Answer);
    }

    @Step
    public void clicksButtonSendAnswer() {
        waitABit(5000);
        $(ButtonSendAnswer()).click();
        waitABit(3000);
    }

    @Step
    public void clickConfirmationSendAnswer() {
        waitABit(5000);
        $(ConfirmationSendAnswer()).click();
        waitABit(3000);
    }


    @Step
    public boolean ValidationAnswerDiscussionForum() {
        return $(ValidationAnswerDiscussion()).isDisplayed();
    }

    @Step
    public boolean ValidateEqualSuccessMessage(String SuccessAnswerForum) {
        return ($(ValidationAnswerDiscussion()).getText().equalsIgnoreCase(SuccessAnswerForum));
    }


    @Step
    public void clicksseeMore1() {
        waitABit(5000);
        $(seeMore1()).click();
        waitABit(3000);
    }

    @Step
    public void inputAnswer1(String Answer1) {
        $(AnswerForums()).type(Answer1);
    }

    @Step
    public boolean ValidationFailedAnswerDiscussionForum() {
        return $(ValidationFailedAnswerDiscussion()).isDisplayed();
    }

    @Step
    public boolean ValidateEqualFailedAnswerMessage(String SuccessAnswerForum) {
        return ($(ValidationFailedAnswerDiscussion()).getText().equalsIgnoreCase(SuccessAnswerForum));
    }

    //send a discussion without filling in the answer
    @Step
    public boolean ValidationFailedAnswerDiscussionForum1() {
        return $(ValidationFailedAnswerDiscussion1()).isDisplayed();
    }

    @Step
    public boolean ValidateEqualFailedAnswerMessage1(String FailedSuccessAnswerForum1) {
        return ($(ValidationFailedAnswerDiscussion1()).getText().equalsIgnoreCase(FailedSuccessAnswerForum1));
    }

    //Double check answers before sending
    @Step
    public void clicksConfirmationSendAnswerNo() {
        waitABit(5000);
        $(ConfirmationSendAnswerNo()).click();
        waitABit(3000);
    }

    @Step
    public boolean ValidationAnswerDiscussionForum3() {
        return $(AnswerForums()).isDisplayed();
    }
}
