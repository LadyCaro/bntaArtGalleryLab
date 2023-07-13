import java.util.ArrayList;

public class Customer{

    private String name;
    private int wallet;

    private ArrayList<Artwork> artCollection;


    public Customer(String inputName, int wallet){
        this.name = inputName;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();

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

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void setArtCollection(ArrayList<Artwork> artCollection) {
        this.artCollection = artCollection;
    }

    public void buyArtwork(Artwork artwork, Gallery gallery){
        // stock find out how many artwork (loop)
        // compare artwork name and take it out

        for (int i = 0; i < gallery.getStock().size(); i++) {
            if (artwork.getTitle().equals(gallery.getStock().get(i).getTitle())) {

                // this subtracts from customer wallet
                this.wallet -= gallery.getStock().get(i).getPrice();
                // this method adds the money to till
                gallery.setTill(gallery.getStock().get(i));

                System.out.println("stock title: "+gallery.getStock().get(i).getTitle());
                System.out.println("artwork title: "+artwork.getTitle());
                System.out.println("till amount: £" +gallery.getTill());
                System.out.println("wallet amount: £" +this.wallet);

                System.out.println("Stock size after sold: " + gallery.getStock().size());
                // removes the artwork from stock
                artCollection.add(gallery.getStock().get(i));
                gallery.sellArtwork(gallery.getStock().get(i));

                System.out.println("Stock size after sold: " + gallery.getStock().size());
                System.out.println("Customer Collection: " + artCollection.size());

            }
        }

        }


    }


