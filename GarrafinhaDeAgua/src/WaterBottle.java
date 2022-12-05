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
        
    }

    @Override
    public void uncap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fill() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void drink() {
        // TODO Auto-generated method stub
        
    }
}