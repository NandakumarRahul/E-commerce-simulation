STRUCTURE
The Java simulation represents an e-commerce system in which autonomous agents sell 
products on behalf of retailers and other agents buy products on behalf of customers. These 
agents interact via a broker agent, which facilitates the shopping process. The program 
includes a Main class which facilitates the buyer-to-buyer agent and seller to seller agent 
communication. The interaction of the agents are as follows
i. Main class(user and buyer interface) – the main class interacts with the buyer and 
seller agents. It takes order from the buyer and seller and forwards it to the respective 
agents.
ii. Buyer class – The buyers through the Main class interact with the Buyer agent. the 
buyer agent interacts with the Broker agent and the main class. It checks the users 
request with the broker agent to complete the order.
iii. Seller class – the Sellers interact via the Main class with the Seller agent. The seller 
agent interacts with the Main class and the Broker agent. The seller agent helps the 
seller to add stocks to the website with all the conditions he put forwards.
iv. Broker class – the Broker agent plays a main role in completing the buyer and seller 
requests. It interacts with both the Buyer and seller agent to facilitate order 
completions within the e-commerce system.
The Contract Net Protocol is used here as a model for implementing this simulation. Here the 
buyers and sellers interact through buyer and seller agents respectively. These agents then 
interact via the Broker agent to complete the order. The broker agent takes the proposal from 
the buyer agent and validates it with the seller agent and thereby complete the order.


FLOW OF PROGRAM
The Main class serves as the buyer and seller interface. If the user is a buyer, he/she is 
prompted to enter product name, quantity, maximum desired price and minimum desired 
price. Then the all 4 parameters are passed to the buyer agent class i.e., Buyer class to 
process the order of the user. The Buyer agent stores these values and registers the user as a 
new one and checks if the product requested is available or not by interacting with the Broker 
agent or the Broker class. For this the product price range, quantity and product name are
passed to the checkOrder method inside Broker agent. It is a static method which returns a 
Boolean value. It iterates through the Arraylist of items and price ranges and checks for 
possible match. If a match is not found or is out of stock then the user is informed that the 
product is out of stock by the buyer agent.

If a match is found , the order progresses to the next stage of payment, which is facilitated by 
the Broker method initiatePayment. Here, the user is asked to desired payment option which 
could be Cash on delivery or card payment. Based on the user input it is checked whether the 
requested payment method is made available by the seller if not the user is asked to take the 
other payment option if they wish. There is an option for user to quit the shopping at this 
point. If the user continues then the order is placed and the user is shown the delivery time. 

Now, if the user is a seller, he/she is prompted to enter the product details which include 
name of product, delivery time, quantity, price and payment option. These parameters are 
then passes to the Seller agent or the Seller class, which stores the product details, payment 
option and delivery time and then the seller is registered. 
