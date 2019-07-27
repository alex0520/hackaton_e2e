package starter.login;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import ui.HomePage;
import ui.login.FacebookLoginPage;
import ui.login.LoginPage;

public class Login extends UIInteractionSteps {

    @Step("Login with credentials")
    public void login() {
        $(HomePage.LOGIN_BUTTON).click();
        $(LoginPage.FACEBOOK_LOGIN_BUTTON).click();
        $(FacebookLoginPage.USERNAME_FIELD).type("alexander.lozanoforero");
        $(FacebookLoginPage.PASSWORD_FIELD).type("alex900520");
        $(FacebookLoginPage.LOGIN_BUTTON).click();
    }
}
