import java.util.ArrayList;
import java.util.Scanner;

public class Broker {
    // all necessary arraylists are initialised to store all the product details
    public static ArrayList<String> products = new ArrayList<>();
    public static ArrayList<Integer> prices = new ArrayList<>();
    public static ArrayList<String> delivery = new ArrayList<>();
    public static ArrayList<Integer> time = new ArrayList<>();
    public static ArrayList<Integer> quantity = new ArrayList<>();


    public static void existingStock() {
        System.out.println("AVAILABLE STOCK");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf(products.get(i) + "\n");
            // all the available stock is printed
        }
    }


    public static void addProducts(String productName, Integer price, String deliveryOption, int deliveryTime, Integer items) {
        products.add(productName);
        prices.add(price);
        delivery.add(deliveryOption);
        time.add(deliveryTime);
        quantity.add(items);
        // seller agent adds products to the cart using this function
    }


    public static Boolean checkOrder(Boolean check,String product, Integer max, Integer min, Integer items) {
        // validation of the order in terms of price quantity and payment option is done here
        Scanner scanner = new Scanner(System.in);
        Boolean check2 = check;
        for (int i = 0; i < products.size(); i++) {
            String temp1 = products.get(i);
            Integer index = i;
            if (temp1.equals(product)) {
                int temp2 = prices.get(i);
                // checking price range
                if (min <= temp2 && temp2 <= max) {
                    int temp3 = quantity.get(i);
                    // checking quantity of stock
                    if(items <= temp3) {
                        temp3 = temp3 - items;
                        quantity.set(i,temp3);
                        System.out.println("\nYour order for "+ items +" "+ product +"'s has been successfully accepted by the seller");
                        System.out.println("\nPlease confirm your payment option as 1 or 2\n1 : Cash on delivery\n2 : Debit or credit card Payment");
                        int paymentOptionUser = scanner.nextInt();
                        // asking user for preferred payment option to check with the seller
                        if (paymentOptionUser == 1) {
                            initiatePayment(index, "Cash on delivery");
                        } else if (paymentOptionUser == 2) {
                            initiatePayment(index, "Debit/Credit card");
                        }
                        check2 = true;
                        break;
                    }
                }
            }
        }
        return check2;
        // if check is true order is successfully placed else order is rejected
    }

    public static void initiatePayment(Integer index,String paymentOption){
        Scanner scanner = new Scanner(System.in);
        // validation of payment option is done here
        if (delivery.get(index).equals(paymentOption)){
            System.out.println("payment accepted");
            System.out.println("order expected to reach by "+time.get(index)+" days");
            System.out.println("ThankYou, please visit again");
        }else{
            System.out.println("payment rejected\nthis order does not take "+paymentOption+ " payment");
            System.out.println("Would you like to choose the other option for payment, yes/no: ");
            String decision = scanner.nextLine();
            // if the users preferred payment option is not available he or she can quit the order here.
            if(decision.equals("yes")){
                System.out.println("payment accepted");
                System.out.println("order expected to reach by "+time.get(index)+" days");
            }else{
                System.out.println("Sorry, please visit again later");
            }
        }
        scanner.close();
    }
}

