import java.util.Scanner;

public class DeliveryAppSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mainDish[] = {"Chicken", "Chicken Fillet", "Burger Steak"};
        int priceMainDish[] = {80,90,100};
        String sideDish[] = {"Burger","French Fries","Macaroni Soup"};
        int priceSideDish[]= {30,40,50};
        String drinks[] = {"Pineapple Juice","Iced Tea","Softdrinks"};
        int priceDrinks[] = {15,20,25};
        boolean orderAgain = true;
        int total = 0; // variable to store the total price

        System.out.print("Welcome to Jollibee's Delivery App");

        System.out.print("\nPress enter to start: ");
        String pressEnter = input.nextLine();
        
        int num = 1;
        while(orderAgain){
            int totalPrice = 0; // variable to store the total price of each order
            
            System.out.print("Main Dish :\n");    
            for(int i = 0 ; i < mainDish.length; i++){
                System.out.print(num + ") " + mainDish[i] + "\n");
                num++;
            }
            System.out.print("Please choose your order : ");
            int orderMainDish = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantityMainDish = input.nextInt();
            
            int totalMainDish = priceMainDish[orderMainDish - 1] * quantityMainDish;
            totalPrice += totalMainDish; // add main dish price to total price
            num = 1; // reset num for the next loop
            
            System.out.print("Side Dish :\n");    
            for(int i = 0 ; i < sideDish.length; i++){
                System.out.print(num + ") " + sideDish[i] + "\n");
                num++;
            }
            System.out.print("Please choose your order  : ");
            int orderSideDish = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantitySideDish = input.nextInt();
            
            int totalSideDish = priceSideDish[orderSideDish - 1] * quantitySideDish;
            totalPrice += totalSideDish; // add side dish price to total price
            num = 1; // reset num for the next loop
            
            System.out.print("Drinks:\n");    
            for(int i = 0 ; i < drinks.length; i++){
                System.out.print(num + ") " + drinks[i] + "\n");
                num++;
            }
            System.out.print("Please choose your order : ");
            int orderDrinks = input.nextInt();
            
            System.out.print("Enter quantity : ");
            int quantityDrinks = input.nextInt();
            
            int totalDrinks = priceDrinks[orderDrinks - 1] * quantityDrinks;
            totalPrice += totalDrinks; // add drinks price to total price
            num = 1; // reset num for the next loop
            
            total += totalPrice; // add the total price of this order to the overall total price
            
            System.out.print("Do you want to buy more ? (yes/no) : ");
            input.nextLine(); // consume the new line character left by the previous input
            String userAnswer = input.nextLine();
            
            if (userAnswer.equalsIgnoreCase("no")){
                orderAgain = false;
                System.out.print ("\nTotal price : P " + total);
                
                System.out.print("\nEnter payment : P ");
                int payment = input.nextInt();
                
                int change = payment - total;
                
                System.out.print("Change : P " + change);
                
                System.out.print("\nPress enter to exit : ");
                input.nextLine();
                String pressEnter2 = input.nextLine();
                
                System.out.print("\n\nTHANK YOU FOR ORDERING PLEASE WAIT FOR 10 MINUTES!");
                
                
            }
        }
    }
}
