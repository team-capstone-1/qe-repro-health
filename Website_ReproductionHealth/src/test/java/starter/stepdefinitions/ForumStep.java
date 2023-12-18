package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ForumPage;

public class ForumStep {
    @Steps
    ForumPage forumPage;

    //search
    @When("I click menu forum")
    public void clicksForumPage() {
        forumPage.clicksForumPage();
    }

    @And("I enters correct keywords {string}")
    public void clicksSearchForum(String KeywordDiscussion) {
        forumPage.clicksSearchForum(KeywordDiscussion);
    }

    @Then("I have to displays articles that match the keywords")
    public void ValidateSearchForum() {
        forumPage.ValidateSearchForum();
    }


    @And("I enters incorrect keywords {string}")
    public void clicksSearchForum1(String KeywordDiscussion1) {
        forumPage.clicksSearchForum1(KeywordDiscussion1);
    }

    //displays all discussions in the forum
    @And("I clicks button \"Semua\"")
    public void clicksAllDiscussion() {
        forumPage.clicksAllDiscussion();
    }

    @Then("I have to displays all discussions in the forum")
    public void ValidateAllDiscussionsInTheForum() {
        forumPage.ValidateAllDiscussionsInTheForum();
    }


    //displays popular discussions on the forum
    @And("I clicks button \"popular\"")
    public void clicksPopularInTheForum() {
        forumPage.clickspopular();
    }

    @Then("I have to displays popular discussions on the forumall discussions in the forum")
    public void ValidatePopularDiscussionsOnTheForumDiscussions() {
        forumPage.ValidatePopularDiscussionsOnTheForumDiscussions();
    }

//displays the latest discussions in the forum
    @And("I clicks button \"Terbaru\"")
    public void clicksNewInTheForum() {
        forumPage.clicksNewInTheForum();
    }

    @Then("I have to displays the latest discussions in the forum")
    public void ValidateTheLatestDiscussionsForumDiscussions() {
        forumPage.ValidateTheLatestDiscussionsForumDiscussions();
    }

//displays discussion details
    @And("I clicks \"Lihat lebih lanjut\"")
    public void clicksSeeMoreInTheForum() {
        forumPage.clicksseeMore();
    }

    @Then("I have to displays all detail discussions in the forum")
    public void ValidateAllDetailDiscussionsForumDiscussions() {
        forumPage.ValidateAllDetailDiscussionsForumDiscussions();
    }


    //list of unanswered discussions
    @And("I click menu has not been answered")
    public void clicksnotYetAnsweredInTheForum() {
        forumPage.clicksnotYetAnswered();
    }

    @Then("I have to displays a list of unanswered discussions")
    public void ValidateAListOfUnansweredDiscussions() {
        forumPage.ValidateAListOfUnansweredDiscussions();
    }

    //answer the discussion

    @And("I clicks \"Lihat lebih lanjut\".")
    public void clicksSeeMoreInTheForum1() {
        forumPage.clicksseeMore1();
    }

    @And("I writes answer forum")
    public void inputAnswerInTheForum() {
        forumPage.inputAnswer("Reproduksi merupakan cara dasar mempertahankan diri yang dilakukan oleh semua bentuk kehidupan oleh pendahulu setiap individu organisme untuk menghasilkan suatu generasi selanjutnya");
    }


    @And("I clicks the button \"kirim\"")
    public void clicksButtonSendInTheForum() {
        forumPage.clicksButtonSendAnswer();
    }

    @And("I clicks the \"Ya, kirim jawaban\" button.")
    public void clicksButtonConfirmationInTheForum() {
        forumPage.clickConfirmationSendAnswer();
    }


    @Then("I can see success message in Forum page {string}")
    public void ValidationAnswerDiscussionForum(String SuccessAnswerForum) {
        forumPage.ValidationAnswerDiscussionForum();
        forumPage.ValidateEqualSuccessMessage(SuccessAnswerForum);
    }

//Answer discussions that exceed the maximum character limit
    @And("I writes answer")
    public void inputAnswerMaximumCharacterLimitInTheForum() {
        forumPage.inputAnswer1("Sistem reproduksi wanita adalah bagian tubuh yang memungkinkan wanita untuk melakukan hubungan seksual, bereproduksi, dan mengalami siklus menstruasi. Pada dasarnya, fungsi utama organ reproduksi wanita adalah untuk memproduksi sel telur (ovum) dan menjadi tempat terjadinya pembuahan.\n" +
                "Selama masa perkembangan janin, organ reproduksi wanita akan menghasilkan kurang lebih sebanyak 6 juta ovum. Setelah anak dilahirkan, ovum tersebut akan tersisa sekitar 1 juta sel telur. Lalu, ketika telah mencapai masa pubertas, hanya ada sekitar 300 ribu sel telur yang tersisa pada organ reproduksi wanita.\n" +
                "Jumlah ovum pada organ reproduksi wanita akan terus menurun seiring dengan bertambahnya usia dan setiap siklus menstruasi terjadi. Karena penurunan kuantitas serta kualitas sel telur ini, maka kesuburan wanita pun juga akan ikut menurun seiring dengan pertambahan usia hingga mencapai masa menopause.");
    }

    @Then("I can see failed message in Forum page {string}")
    public void ValidationFailedAnswerDiscussionForum(String FailedSuccessAnswerForum) {
        forumPage.ValidationFailedAnswerDiscussionForum();
        forumPage.ValidateEqualFailedAnswerMessage(FailedSuccessAnswerForum);
    }


    //send a discussion without filling in the answer
    @Then("I should have stayed on the question answer page and message eror {string}")
    public void ValidationFailedAnswerDiscussionForum1(String FailedSuccessAnswerForum1) {
        forumPage.ValidationFailedAnswerDiscussionForum1();
        forumPage.ValidateEqualFailedAnswerMessage1(FailedSuccessAnswerForum1);
    }


    //Double check answers before sending
    @And("I clicks the \"Tidak, Cek lagi\" button.")
    public void clicksButtonConfirmationInTheForumNo() {
        forumPage.clicksConfirmationSendAnswerNo();
    }


    @Then("I should still be on the question answer page")
    public void ValidationAnswerDiscussionForum3() {
        forumPage.ValidationAnswerDiscussionForum3();
    }


}
