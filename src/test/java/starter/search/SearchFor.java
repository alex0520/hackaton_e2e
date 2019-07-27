package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import ui.HomePage;
import ui.search.SearchPage;

public class SearchFor extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void term(String term) {
        $(HomePage.SEARCH_BUTTON).click();
        $(SearchPage.SEARCH_INPUT).clear();
        $(SearchPage.SEARCH_INPUT).type(term);
    }
}
