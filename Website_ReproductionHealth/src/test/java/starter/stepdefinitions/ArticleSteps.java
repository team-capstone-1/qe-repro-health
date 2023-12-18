package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArticlePage;

public class ArticleSteps {

    @Steps
    ArticlePage articlePage;

    //search
    @When("I clicks menu article")
    public void clicksForumPage() {
        articlePage.clickMenuArticle();
    }

    @And("I enters correct keywords in article {string}")
    public void clicksSearchForum(String KeywordArticle) {
        articlePage.clickSearchArticle(KeywordArticle);
    }

    @Then("I have to displays article that match the keywords")
    public void ValidateSearchForum() {
        articlePage.validateSearchArticle();
    }


    @And("I enters incorrect keywords in article {string}")
    public void clicksSearchForum1(String KeywordArticle1) {
        articlePage.clickSearchArticle1(KeywordArticle1);
    }

    //displays the contents of the article
    @And("I clicks on the desired article")
    public void clickArticle() {
        articlePage.clickArticle();
    }

    @Then("I have to displays the contents of the article")
    public void validateViewArticle() {
        articlePage.validateViewArticle();
    }

//delete
    @And("I clicks the delete button")
    public void clickDeleteArticle() {
    articlePage.clickDeleteArticle();
}

    @And("I clicks \"yes, delete\" button")
    public void confirmationDeleteArticleYes() {
        articlePage.confirmationDeleteArticleYes();
    }


    @Then("I can see success message in page Article {string}")
    public void validationSuccessDeleteArticle(String DeleteArticle) {
        articlePage.validationSuccessDeleteArticle();
        articlePage.ValidateEqualSuccessDeleteArticleMessage(DeleteArticle);
    }

//upload article
    @And("I clicks the \"Tulis Artikel\" button.")
    public void ClickWriteArticle() {
        articlePage.ClickWriteArticle();
    }

    @And("I fills in the title")
    public void inputtitle() {
        articlePage.inputtitle("Tips Menjaga Kesehatan Reproduksi Wanita");
    }

    @And("I fills in the Tag")
    public void inputTagArticle() {
        articlePage.inputTagArticle();
        articlePage.chooseTagArticle();
    }

    @And("I fills in the Reference")
    public void inputreferenceArticle() {
        articlePage.inputreferenceArticle("World Health Organization");
    }

    @And("I fill in the contents of the article")
    public void inputcontent() {
        articlePage.inputcontent("Kesehatan reproduksi wanita memiliki peran penting dalam menjaga kesejahteraan umum. Artikel ini memberikan berbagai tips untuk menjaga kesehatan reproduksi wanita");
    }


    @And("I fills in image description")
    public void inputimageDes() {
        articlePage.inputimageDes("Undang-undang No.23 Tahun 1999 Tenatng Kesehatan");
    }

    @And("I user clicks the \"unggah\" button.")
    public void clickButtonUpload() {
        articlePage.clickButtonUpload();
    }


    @Then("I can success message in page Article {string}")
    public void validationErorrMessageUploadArticle1(String delete) {
        articlePage.validationErorrMessageUploadArticle1();
        articlePage.ValidateEqualErorrMessageUploadArticle1(delete);
    }


    @Then("I can see erorr message in image {string}")
    public void validationErorrMessageUploadArticle(String noImage) {
        articlePage.validationErorrMessageUploadArticle();
        articlePage.ValidateEqualErorrMessageUploadArticle(noImage);
    }





    @Then("I can see erorr message in page article1")
    public void validationSuccesUploadArticle() {
        articlePage.validationErorTitle();
        articlePage.validationErorTag();
        articlePage.validationReference();
        articlePage.validationimageDesEror();
        articlePage.validationcontent();
    }
}
