import java.util.ArrayList;
import java.util.Arrays;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.stock = new ArrayList<>();


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

    public void setTill(Artwork currentArtwork){
        this.till += currentArtwork.getPrice();
    }


    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(Artwork currentArtwork){
        this.stock.add(new Artwork(currentArtwork.getTitle(), currentArtwork.getArtist().getName(),currentArtwork.getPrice()));
    }

    public void sellArtwork(Artwork currentArtwork){
        stock.remove(currentArtwork);

    }

    public void stockTake(){
        int stockTake = 0;
        for (int i = 0; i < stock.size(); i++) {
            stockTake+=stock.get(i).getPrice();
        }
        System.out.println("Gallery Collection Value £" + stockTake);
    }



}
