public class Chicken {

    private String name;
    private int eggs;

    public Chicken(String inputName, int inputEggs){
        this.name = inputName;
        this.eggs = inputEggs;
    }

    public String getName(){
        return this.name;
    }

    public int getEggs(){
        return this.eggs;
    }

    public void setEggs(int amount){
        this.eggs = amount;
    }
}
