package starter.user.register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostRegister {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST endpoints Register")
    public String setPostRegisterEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "new1@gmail.com");
        requestBody.put("password", "123123");
//        requestBody.put("fullname", "new116");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostRegisterEndpoint());
    }

    @Step("I receive response code 200 Register")
    public void responseCode200RegisterEndpoint(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        restAssuredThat(response -> response.body("response.email", equalTo("new1@gmail.com")));
    }
}
