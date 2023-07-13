import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;



    @BeforeEach
    public void setUp(){
        artist = new Artist("Da Vinci");
        artwork = new Artwork("Mona Lisa",artist.getName(),100);

    }

    @Test
    public void testGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }
    @Test
    public void testSetTitle(){
        artwork.setTitle("The Last Supper");
        assertThat(artwork.getTitle()).isEqualTo("The Last Supper");

    }

    @Test
    public void testGetArtistName(){

        assertThat(artwork.getArtist().getName()).isEqualTo("Da Vinci");

    }

    @Test
    public void testSetArtistName(){
        artwork.setArtist("Picasso");
        assertThat(artwork.getArtist().getName()).isEqualTo("Picasso");
    }

    @Test
    public void testGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);

    }
    @Test
    public void testSetPrice(){
        artwork.setPrice(150);
        assertThat(artwork.getPrice()).isEqualTo(150);
    }
}
