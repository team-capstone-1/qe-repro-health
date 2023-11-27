package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLogin {
    protected String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST endpoints Login")
    public String setPostLoginEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Login")
    public void sendPostHttpRequestLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "davin2@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostLoginEndpoint());
    }

    @Step("I receive response code 200 Login")
    public void responseCode200LoginEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

}

