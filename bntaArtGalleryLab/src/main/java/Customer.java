import java.util.ArrayList;

public class Customer{

    private String name;
    private int wallet;

    Gallery gallery;
    Artwork artwork;

    public Customer(String inputName, int wallet){
        this.name = inputName;
        this.wallet = wallet;
        gallery = new Gallery("");
        artwork = new Artwork("","",0);

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

        for (int i = 0; i < gallery.getStock().size()-1;){
            if(artwork == gallery.getStock().get(i) ){
                // get price


                //subtract price from our wallet
                //add price to till
                // remove the artwork from stock

            }
            
        }
            // if(artworkName.equals(artwork)){
            //     this.wallet -= gallery.stock. ;

            // }

        }


    }

}
