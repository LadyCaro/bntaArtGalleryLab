import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("DaVinci");
    }

    @Test
    public void testGetName(){
        String actual = artist.getName();
        String  expected = "DaVinci";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testSetName(){
        artist.setName("Picasso");
        assertThat(artist.getName()).isEqualTo("Picasso");
    }

}
