package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    SpotifyHomePage spotifyHomePage;

    @Step("Open the Spotify home page")
    public void theSpotifyHomePage() {
        spotifyHomePage.open();
    }
}
