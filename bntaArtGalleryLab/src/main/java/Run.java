import java.util.ArrayList;

public class Run {



    public static void main(String[] args) {
        // create artist
        Artist artist = new Artist("Da Vinci");

        //create artwork
        Artwork artwork = new Artwork("Mona Lisa","Da Vinci",100);
        Artwork artwork2 = new Artwork("Tareks Drawing","Tarek",10);
        Artwork artwork3 = new Artwork("Carolinas Drawing","Carolina",1000);

        // Create gallery
        Gallery gallery = new Gallery("la Louve");

        // add artworks to gallery
        gallery.setStock(artwork);
        gallery.setStock(artwork2);
        gallery.setStock(artwork3);

        // show gallery collection value
        gallery.stockTake();

        //create a customer
        Customer customer = new Customer("Carolina", 2000);

        //buy stock
        customer.buyArtwork(artwork,gallery);
    }
}
