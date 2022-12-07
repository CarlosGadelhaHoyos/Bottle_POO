public class WaterBottle implements Bottle{

    //variables
    private String bottleType;
    private boolean capped;
    private boolean empty;
    private int howMuchFilled;

    public WaterBottle(String x){

        this.bottleType = x;
        this.capped = true;
        this.empty = false;
        this.howMuchFilled = 100;
    } 

    @Override
    public void cap() {
        // TODO Auto-generated method stub
        if(!this.isCapped()){
            this.setCapped(true);
            System.out.println("Bottle capped.");
        }else{
            System.out.println("The bottle is already capped.");
        }
    }

    @Override
    public void uncap() {
        // TODO Auto-generated method stub
        if(this.isCapped()){
            this.setCapped(false);
            System.out.println("Bottle uncapped.");
        }else{
            System.out.println("The bottle is already uncapped.");
        }
    }

    @Override
    public void fill() {
        // TODO Auto-generated method stub
        if(!this.isCapped() && this.getHowMuchFilled() < 100){
            this.setHowMuchFilled(100);
            System.out.println("Bottle: "+ this.getHowMuchFilled()+ "\nThe bottle is full");
        }else if(this.isCapped()){
            System.out.println("It is not possible to fill the bottle capped.");
        }else if(!this.isCapped() && this.getHowMuchFilled() == 100){
            System.out.println("It is not posible to fill a bottle that is full.");
        }
    }

    @Override
    public void drink() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void status() {
        // TODO Auto-generated method stub
        
    }

    /**
     * @return String return the bottleType
     */
    public String getBottleType() {
        return bottleType;
    }

    /**
     * @param bottleType the bottleType to set
     */
    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }

    /**
     * @return boolean return the capped
     */
    public boolean isCapped() {
        return capped;
    }

    /**
     * @param capped the capped to set
     */
    public void setCapped(boolean capped) {
        this.capped = capped;
    }

    /**
     * @return boolean return the empty
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * @param empty the empty to set
     */
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    /**
     * @return int return the howMuchFilled
     */
    public int getHowMuchFilled() {
        return howMuchFilled;
    }

    /**
     * @param howMuchFilled the howMuchFilled to set
     */
    public void setHowMuchFilled(int howMuchFilled) {
        this.howMuchFilled = howMuchFilled;
    }
}