package starter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Track {

    private String trackName;
    private String artistName;
    private String albumName;
}
