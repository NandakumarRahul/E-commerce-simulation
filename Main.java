// importing Scanner to take user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // scanner initialised
        Scanner scanner = new Scanner(System.in);
        //seller class is called to add items with its specs to Arraylist
        new Seller("Gucci","Jeans", 8,"Cash on delivery",10,4);
        new Seller("Chanel","Hats", 5,"Debit/Credit card",10,5);
        new Seller("Sara's","Shirts", 10,"Cash on delivery",5,1);
        new Seller("Tommy","Belts", 10,"Debit/Credit card",5,7);
        new Seller("Nike","Shorts", 12,"Cash on delivery",7,10);
        new Seller("Louis Vuitton","Smartphone", 100,"Debit/Credit card",7,1);
        new Seller("Hermes","Skirts", 15,"Cash on delivery",6,3);
        new Seller("Dior","lipstick", 5,"Debit/Credit card",6,1);
        new Seller("Allen Solly","Chinos", 12,"Cash on delivery",9,2);
        new Seller("H&M","Jackets", 30,"Debit/Credit card",9,3);
        System.out.println("Welcome!!!");
        System.out.println("Identify yourself as a buyer or a seller");
        String id = scanner.nextLine();

        // checking whether the user is a buyer or seller
        if (id.equals("buyer")){
            // if user is buyer all necessary parameters like product name, price etc. are taken as input
            System.out.println("Please enter your name: ");
            String buyerName = scanner.nextLine();
            Broker.existingStock();
            System.out.println("Would you like to place an order for the available products" +
                    " please enter any product: ");
            String productName = scanner.nextLine();
            System.out.println("Please enter your desired maximum price: ");
            Integer maxPrice = scanner.nextInt();
            System.out.println("Please enter your desired minimum price: ");
            Integer minPrice = scanner.nextInt();
            System.out.println("Please confirm quantity of your product: ");
            Integer items = scanner.nextInt();
            // all the input parameters are passed to the buyer agent to facilitate order placement.
            new Buyer(buyerName,productName, maxPrice,minPrice,items);
        }

        if (id.equals("seller")) {
            // if user is seller all the necessary parameters are taken like product name, price, payment option etc.
            System.out.println("Please enter your Name: ");
            String sellerName = scanner.nextLine();
            System.out.println("PLease enter your commodity Name: ");
            String commodityName = scanner.nextLine();
            System.out.println("PLease enter your commodity price: ");
            Integer price = scanner.nextInt();
            System.out.println("Please confirm quantity of your product: ");
            Integer items = scanner.nextInt();
            System.out.println("Please enter your delivery time: ");
            Integer deliveryTime = scanner.nextInt();
            System.out.println("Please confirm your payment option as 1 or 2\n1 : Cash on delivery\n2 : Debit or credit card Payment");
            int paymentOption = scanner.nextInt();
            if (paymentOption == 1) {
                // all parameters entered by the seller are passed to the seller agent to register new seller.
                new Seller(sellerName, commodityName, price, "Cash on delivery",deliveryTime,items);
            } else if (paymentOption == 2) {
                new Seller(sellerName, commodityName, price, "Debit/Credit card",deliveryTime,items);
            }
        }
        scanner.close();
        // scanner function is closed
    }
}
