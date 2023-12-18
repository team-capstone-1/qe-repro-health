package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ArticlePage extends PageObject {

    private By MenuArticle() {
        return By.xpath("//*[@id=\"app-layout\"]/main/div/ul/li[6]");
    }

    private By searchArticle() {
        return By.id("search-article");
    }

    private By ViewArticle() {
        return By.xpath("//*[@id=\"list-article\"]/div/div[5]/a/div/div[2]");
    }

    private By DeleteArticle() {
        return By.id("remove-article");
    }

    private By reproduksi() {
    return By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/div[5]/div");
}

    private By confirmationDeleteArticle() {
        return By.id("button-article-confirm");
    }

    private By validationDeleteArticle() {
        return By.id("search-article");
    }

    private By WriteArticle() {
        return By.id("write-article");
    }

    private By title() {
        return By.id("title");
    }

    private By TagArticle() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[1]/div[2]/div");
    }

    private By referenceArticle() {
        return By.id("reference");
    }

    private By image() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[2]/div[1]/label");
    }

    private By imageDes() {
        return By.id("image_desc");
    }

    private By content() {
        return By.xpath("//*[@id=\"text-content\"]/div[2]/div[1]");
    }


    private By ButtonUpload() {
        return By.xpath("//*[@id=\"submit-button\"]/span");
    }

    private By ButtonCancel() {
        return By.xpath("//*[@id=\"cancel-submit\"]/span");
    }
    private By erorTitle() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[1]/div[1]/span");
    }

    private By erorTag() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[1]/div[2]/span");
    }

    private By reference() {
        return By.xpath("/html/body/div[1]/div[3]/main/section/section/form/div[2]/div/div[1]/div[3]/span");
    }

    private By imageDesEror() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[2]/div[1]/div/span");
    }

    private By validatecontent() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[3]/div/span");
    }

    private By succesUploadArticle() {
        return By.xpath("//*[@id=\"success-toast\"]/div[1]/div");
    }

    private By ViewArticlevalidation() {
        return By.id("detail-article");
    }

    private By imageEror() {
        return By.xpath("//*[@id=\"unggah-artikel\"]/form/div[2]/div/div[2]/div[1]/div/span");
    }




    @Step
    public void clickMenuArticle() {
        waitABit(5000);
        $(MenuArticle()).click();
        waitABit(3000);
    }

    @Step
    public void clickSearchArticle(String KeywordArticle) {
        waitABit(5000);
        $(searchArticle()).type(KeywordArticle);
        waitABit(3000);
    }

    @Step
    public void validateSearchArticle() {
        waitABit(5000);
        $(searchArticle()).isDisplayed();
        waitABit(3000);
    }

    @Step
    public void clickSearchArticle1(String KeywordArticle1) {
        waitABit(5000);
        $(searchArticle()).type(KeywordArticle1);
    }


    @Step
    public void clickArticle() {
        waitABit(5000);
        $(ViewArticle()).click();
        waitABit(3000);
    }

    @Step
    public void validateViewArticle() {
        waitABit(5000);
        $(ViewArticlevalidation()).isDisplayed();
        waitABit(3000);
    }

    @Step
    public void clickDeleteArticle() {
        waitABit(5000);
        $(DeleteArticle()).click();
        waitABit(3000);
    }

    @Step
    public void confirmationDeleteArticleYes() {
        waitABit(5000);
        $(confirmationDeleteArticle()).click();
        waitABit(3000);
    }

    @Step
    public void validationSuccessDeleteArticle() {
        waitABit(5000);
        $(validationDeleteArticle()).isDisplayed();
        waitABit(5000);
    }

    @Step
    public boolean ValidateEqualSuccessDeleteArticleMessage(String DeleteArticle) {
        return ($(validationDeleteArticle()).getText().equalsIgnoreCase(DeleteArticle));
    }


    @Step
    public void ClickWriteArticle() {
        waitABit(5000);
        $(WriteArticle()).click();
        waitABit(3000);
    }

    @Step
    public void inputtitle(String title) {
        waitABit(5000);
        $(title()).type(title);
        waitABit(3000);
    }

    @Step
    public void inputTagArticle() {
        waitABit(8000);
        $(TagArticle()).click();
        waitABit(3000);
    }

    @Step
    public void chooseTagArticle() {
        waitABit(5000);
        $(reproduksi()).click();
        waitABit(3000);
    }


    @Step
    public void inputreferenceArticle(String reference) {
        waitABit(5000);
        $(referenceArticle()).type(reference);
        waitABit(3000);
    }


    @Step
    public void inputimageDes(String imageDes) {
        waitABit(5000);
        $(imageDes()).type(imageDes);
        waitABit(3000);
    }


    @Step
    public void inputcontent(String content) {
        waitABit(5000);
        $(content()).type(content);
        waitABit(3000);
    }

    @Step
    public void clickButtonUpload() {
        waitABit(5000);
        $(ButtonUpload()).click();
        waitABit(3000);
    }

    @Step
    public void clickButtonCancel() {
        waitABit(5000);
        $(ButtonCancel()).click();
        waitABit(3000);
    }

    @Step
    public void validationErorTitle() {
        waitABit(5000);
        $(erorTitle()).click();
        waitABit(3000);
    }

    @Step
    public void validationErorTag() {
        waitABit(5000);
        $(erorTag()).click();
        waitABit(3000);
    }

    @Step
    public void validationReference() {
        waitABit(5000);
        $(reference()).click();
        waitABit(3000);
    }

    @Step
    public void validationimageDesEror() {
        waitABit(5000);
        $(imageDesEror()).click();
        waitABit(3000);
    }

    @Step
    public void validationcontent() {
        waitABit(5000);
        $(validatecontent()).click();
        waitABit(3000);
    }


    @Step
    public boolean validationErorrMessageUploadArticle1(){
        return $(validationDeleteArticle()).isDisplayed();
    }
    @Step
    public boolean ValidateEqualErorrMessageUploadArticle1(String delete) {
        return ($(validationDeleteArticle()).getText().equalsIgnoreCase(delete));
    }

    @Step
    public boolean validationErorrMessageUploadArticle(){
        return $(imageEror()).isDisplayed();
    }
    @Step
    public boolean ValidateEqualErorrMessageUploadArticle(String noImage) {
        return ($(imageEror()).getText().equalsIgnoreCase(noImage));
    }
}
