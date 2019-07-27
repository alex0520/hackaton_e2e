package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.Steps;
import ui.HomePage;
import starter.login.Login;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    Login login;

    @Given("(.*) is a registered user")
    public void isARegisteredUser(String user) {
        navigateTo.theSpotifyHomePage();
    }

    @When("he sends their credentials")
    public void heSendsTheirCredentials() {
        login.login();
    }

    @Then("should be able to access to their favorite music")
    public void shouldBeAbleToAccessToTheirFavoriteMusic() {
        seeThat(the(HomePage.SESSION_INFO_CONTAINER), WebElementState::isPresent);
    }
}
