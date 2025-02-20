package Main;
import Item.forFemale;
import Item.forMale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSR csr = new CSR();
        Customer user = new Customer();
        Payment payment = new Payment();
        Inventory inventory = new Inventory();
        forMale male = new forMale();
        forFemale female = new forFemale();
        Order order = new Order();

        Scanner input = new Scanner(System.in);

        int action;
/*
        This code block is for entering the information of the user
        Includes: First and Last name, Address, Email Address, Contact number
 */
        System.out.println("=============================");
        System.out.print("Enter first name: ");
        user.userFirstName = input.nextLine();

        System.out.print("Enter last name: ");
        user.userLastName = input.nextLine();

        System.out.print("Enter address: ");
        user.userAddress = input.nextLine();

        System.out.print("Enter contact number: ");
        user.userContactNumber = input.nextLine();

        System.out.println("=============================");

        System.out.println("\n=============================");
        System.out.println("1: Shop");
        System.out.println("2: Customer support");
        System.out.print("Enter action: ");
        action = input.nextInt();
        System.out.println("=============================");
/*
        Shop function
        Allows users to place their orders and choose between payment methods
        Shop function is almost complete
 */
        if (action == 1){
            System.out.println("Shop");

            System.out.println("\n1: Male");
            System.out.println("2: Female");
            System.out.print("Select: ");
            inventory.genderSelect = input.nextInt();

            if (inventory.genderSelect == 1){
                System.out.println("\nMale");
                System.out.println("Top or Bottom clothes");
                System.out.println("1. Top \n2: Bottom");
                System.out.print("Choose: ");
                inventory.topOrBottom = input.nextInt();

//                This is for displaying and ordering the items for male
                if (inventory.topOrBottom ==1){
                    inventory.displayItemAndPrice(male.getForMaleTop(), male.getForMaleTopPrice());
                    System.out.print("Choose Item: ");
                    int chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.order(chooseItem, male.getForMaleTop())+ ": " + inventory.orderPrice(chooseItem, male.getForMaleTopPrice()));
                    order.itemName = inventory.order(chooseItem, male.getForMaleTop());
                    order.itemPrice = inventory.orderPrice(chooseItem, male.getForMaleTopPrice());
                    System.out.print("Item quantity: ");
                    order.itemQuantity = input.nextInt();
                }
                if (inventory.topOrBottom ==2){
                    inventory.displayItemAndPrice(male.getForMaleBottom(), male.getForMaleBottomPrice());
                    System.out.print("Choose Item: ");
                    int chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.order(chooseItem, male.getForMaleBottom())+ ": " + inventory.orderPrice(chooseItem, male.getForMaleBottomPrice()));
                    order.itemName = inventory.order(chooseItem, male.getForMaleBottom());
                    order.itemPrice = inventory.orderPrice(chooseItem, male.getForMaleBottomPrice());
                    System.out.print("Item quantity: ");
                    order.itemQuantity = input.nextInt();
                }
            }

//          This is for displaying and ordering the items for female
            if (inventory.genderSelect == 2){
                System.out.println("\nFemale");
                System.out.println("Top or Bottom clothes");
                System.out.println("1. Top \n2: Bottom");
                System.out.print("Choose: ");
                inventory.topOrBottom = input.nextInt();

                if (inventory.topOrBottom ==1){
                    inventory.displayItemAndPrice(female.getFemaleTop(), female.getFemaleTopPrice());
                    System.out.print("Choose Item: ");
                    int chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.order(chooseItem, female.getFemaleTop())+ ": " + inventory.orderPrice(chooseItem, female.getFemaleTopPrice()));
                    order.itemName = inventory.order(chooseItem, male.getForMaleTop());
                    order.itemPrice = inventory.orderPrice(chooseItem, female.getFemaleTopPrice());
                    System.out.print("Item quantity: ");
                    order.itemQuantity = input.nextInt();
                }
                if (inventory.topOrBottom ==2){
                    inventory.displayItemAndPrice(female.getFemaleBottom(), female.getFemaleBottomPrice());
                    System.out.print("Choose Item: ");
                    int chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.order(chooseItem, female.getFemaleBottom())+ ": " + inventory.orderPrice(chooseItem, female.getFemaleBottomPrice()));
                    order.itemName = inventory.order(chooseItem, female.getFemaleBottom());
                    order.itemPrice = inventory.orderPrice(chooseItem, female.getFemaleBottomPrice());
                    System.out.print("Item quantity: ");
                    order.itemQuantity = input.nextInt();
                }
            }

//          This is for selecting the mode of payment for the user

            System.out.println("\n1: Cash on Delivery");
            System.out.println("2: Online Payment");
            System.out.print("Select Payment method: ");

            payment.paymentTypeNum = input.nextInt();
            payment.setPaymentTypeNum(payment.paymentTypeNum);

//          This prints the receipt to the user
            order.receiptToUser(user.userFirstName, user.userLastName, user.userAddress, user.userContactNumber, order.itemName, order.itemPrice, order.itemQuantity, payment.paymentType, payment.paymentID);
        }
        if (action == 2){
            System.out.print("What's your concern: ");
            input.nextLine();
            csr.csrIssue = input.nextLine();
            System.out.println(csr.print(user.userFirstName, user.userLastName, csr.csrIssue, csr.csrID));
        }
    }
}
