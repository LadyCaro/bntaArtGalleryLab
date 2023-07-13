import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> stock;
    private Artwork artwork;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.stock = new ArrayList<>();
        artwork = new Artwork();

    }

    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public int getTill(){
        return this.till;
    }

    public void setTill(String inputAmount){
        this.name = inputAmount;
    }

    public Artwork getArtwork(){
        return this.artwork;
    }

    public ArrayList getStock(){
        return this.stock;
    }

    public void setStock(){
        this.stock.add(getArtwork());
    }



}
