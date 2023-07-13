import java.util.ArrayList;

public class Gallery {
    String name;
    int till;
    ArrayList<Artwork> stock;
    Artwork artwork;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.stock = new ArrayList<>();
        artwork = new Artwork("","",0);

    }

    public void increaseAmountInTill(){
        
    }
}
