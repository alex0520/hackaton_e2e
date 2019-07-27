package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.model.Album;
import starter.model.Playlist;
import starter.model.Track;
import ui.search.SearchPage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<Track> tracks() {
        return findAll(SearchPage.TRACK_ELEMENT)
                .stream()
                .map(element -> new Track(element.find(SearchPage.TRACK_NAME).getText(), element.thenFindAll(SearchPage.TRACK_ARTIST).stream().map(elementArtist -> elementArtist.getText()).collect(Collectors.joining(",")),element.find(SearchPage.TRACK_ALBUM_NAME).getText()))
                .collect(Collectors.toList());
    }

    public List<String> artists() {
        return findAll(SearchPage.ARTIST_ELEMENT)
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }

    public List<Album> albums() {
        return findAll(SearchPage.ALBUM_ELEMENT)
                .stream()
                .map(element -> new Album(element.find(SearchPage.ALBUM_NAME).getText(), element.thenFindAll(SearchPage.ALBUM_ARTIST_NAME).isEmpty()?element.thenFindAll(SearchPage.ALBUM_ARTIST_NAME_SINGLE).stream().map(elementArtist -> elementArtist.getText()).collect(Collectors.joining(",")):element.find(SearchPage.ALBUM_ARTIST_NAME).getText()))
                .collect(Collectors.toList());
    }

    public List<Playlist> playlists() {
        return findAll(SearchPage.PLAYLIST_ELEMENT)
                .stream()
                .map(element -> new Playlist(element.find(SearchPage.PLAYLIST_NAME).getText(), element.find(SearchPage.PLAYLIST_ARTIST_NAME).getText()))
                .collect(Collectors.toList());
    }
}
