public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String inputName){
        this.name = inputName;
        this.collectedEggs = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm){
//        loop through chickens on the farm
//        count # available eggs
//        add eggs to eggsForSale
//        set all chicken eggs to 0
        int totalEggs = 0;
        for (Chicken chicken : farm.getChickens()){
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        this.collectedEggs = totalEggs;
    }

    public void assignEggsForSale(Farm farm){
        farm.setEggsForSale(this.collectedEggs);
        this.collectedEggs = 0;
    }

}
