public class Buyer {
    // all necessary variables are initialised to taken buyer input.
    public final String product;
    public final Integer min;
    public final Integer max;
    public final Integer quantity;
    public final String buyerName;
    public final Boolean check;
    public final Boolean check1;

    public Buyer(String buyerName,String product, Integer max,Integer min, Integer items) {
        this.buyerName = buyerName;
        this.product = product;
        this.min = min;
        this.max = max;
        this.quantity = items;
        // new buyer gets registered and their order is printed to screen.
        System.out.println("NEW BUYER REGISTERED");
        System.out.println("Hello " + this.buyerName+"\n"+"Product requested: "+this.product+"\n"+"Price Range: $"+this.min+" - $"+this.max);
        this.check = false;
        // buyer agent interacts with the Broker agent to validate order on behalf of the user.
        this.check1 = Broker.checkOrder(this.check, this.product, this.max, this.min, this.quantity);
        if (this.check1.equals(false)) {
            System.out.println("\nSorry, "+this.quantity+" "+this.product+"'s are not available in stock at that price range now." +
                    "Please check back later");
        }
    }
}






