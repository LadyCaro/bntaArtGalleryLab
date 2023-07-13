public class Customer{

    private String name;
    private int wallet;

    Gallery gallery;

    public Customer(String inputName, int wallet){
        this.name = inputName;
        this.wallet = wallet;
        gallery = new Gallery("");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void buyArtwork(String artworkName){
        // if artworkname == the actual name then we subtract the
        // price of that artwork from our wallet
        for(Artwork artwork : gallery.stock){
            if(artworkName.contentEquals(artwork)){

            }

        }

        this.wallet -= ;
    }

//    public void reduceAmountInWallet(){
//
//    }

}
