package ui.search;

import org.openqa.selenium.By;

public class SearchPage {
    public static By SEARCH_INPUT = By.className("SearchInputBox__input");
    public static By TRACK_ELEMENT = By.cssSelector(".SearchOverviewContainer__top-result-section  li.tracklist-row");
    public static By ARTIST_ELEMENT = By.cssSelector(".mo-artist .mo-info-name");
    public static By TRACK_NAME = By.className("tracklist-name");
    public static By TRACK_ARTIST = By.cssSelector(".tracklist-row__artist-name-link");
    public static By TRACK_ALBUM_NAME = By.cssSelector(".tracklist-row__album-name-link");
    public static By ALBUM_ELEMENT = By.cssSelector(".row:nth-child(3) .media-object");
    public static By ALBUM_NAME = By.cssSelector(".mo-info-name");
    public static By ALBUM_ARTIST_NAME = By.cssSelector(".mo-meta__owner");
    public static By ALBUM_ARTIST_NAME_SINGLE = By.cssSelector(".mo-meta > .react-contextmenu-wrapper");
    public static By PLAYLIST_ELEMENT = By.cssSelector(".row:nth-child(4) .media-object");
    public static By PLAYLIST_NAME = By.cssSelector(".mo-info-name");
    public static By PLAYLIST_ARTIST_NAME = By.cssSelector(".mo-meta");
    public static By PODCASTS = By.cssSelector(".row:nth-child(5) .media-object");
    public static By EPISODES = By.cssSelector(".row:nth-child(6) .tracklist-row");

}
