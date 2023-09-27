public class Seller {
    // all necessary variables to input seller parameters are initialised.
    public final String sellerName;
    public final String commodityName;
    public final Integer price;
    public final String deliveryOption;
    public final Integer deliveryTime;
    public final Integer quantity;


    public Seller(String sellerName, String commodityName, Integer price,String deliveryOption, Integer deliveryTime, Integer items){
        this.sellerName = sellerName;
        this.commodityName = commodityName;
        this.price = price;
        this.deliveryOption = deliveryOption;
        this.deliveryTime = deliveryTime;
        this.quantity = items;
        // all parameters are saved and seller is registered.
        // seller agent prints the registration details on screen.
        Broker.addProducts(this.commodityName,this.price,this.deliveryOption,this.deliveryTime, this.quantity);
        System.out.println("NEW SELLER REGISTERED");
        System.out.println("Seller: "+this.sellerName+"\n"+ "Product: "+ this.commodityName+"\n"+"price: $"+this.price+"\n"+"delivery time: "+this.deliveryTime+" days\n"+"Payment option: "+this.deliveryOption+"\n");
        System.out.println("ThankYou,You will be notified when your product is requested\n");
    }
}
