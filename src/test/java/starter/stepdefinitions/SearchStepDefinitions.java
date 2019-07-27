package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import starter.login.Login;
import starter.model.Track;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import ui.HomePage;
import ui.search.SearchPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SearchStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    Login login;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;


    @Given("(.*) like to listen music")
    public void userLikeToListenMusic(String user) {
        navigateTo.theSpotifyHomePage();
        login.login();
    }

    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void iSearchFor(String term) {
        searchFor.term(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void allTheResultTitlesShouldContainTheWord(String expectedTerm) {
        assertThat(searchResult.tracks())
                .allMatch(track -> textOf(track.getArtistName()).containsIgnoringCase(expectedTerm) || textOf(track.getTrackName()).containsIgnoringCase(expectedTerm) || textOf(track.getAlbumName()).containsIgnoringCase(expectedTerm));
        assertThat(searchResult.artists())
                .allMatch(artist -> textOf(artist).containsIgnoringCase(expectedTerm));
        assertThat(searchResult.albums())
                .allMatch(album -> textOf(album.getAlbumName()).containsIgnoringCase(expectedTerm) || textOf(album.getArtist()).containsIgnoringCase(expectedTerm));
        assertThat(searchResult.playlists())
                .allMatch(playlist -> textOf(playlist.getPlayListName()).containsIgnoringCase(expectedTerm) || textOf(playlist.getArtist()).containsIgnoringCase(expectedTerm));
        seeThat("The podcasts section", the(SearchPage.PODCASTS), isPresent());
        seeThat("The episodes section", the(SearchPage.EPISODES), isPresent());
    }
}
