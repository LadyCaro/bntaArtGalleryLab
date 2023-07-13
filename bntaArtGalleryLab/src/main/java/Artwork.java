public class Artwork {

    private String title;
    private Artist artist;
    private int price;



    public Artwork(String title,String artistName, int price){
        this.title = title;
        this.artist = new Artist(artistName);
        this.price = price;

    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

    public Artist getArtist(){
        return this.artist;
    }

    public void setArtist(String inputName){
         this.artist.setName(inputName);
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int inputPrice){
        this.price = inputPrice;
    }

    


}
