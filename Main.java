import ForImplementation.SpringCatalog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        currentCatalog springCatalog = new testCatalog();
        Inventory inventory = new Inventory();
        Order order = new Order();
        Payment payment = new Payment();
        SpringCatalog item1 = new SpringCatalog("1: Linen Button-Down Shirt", 2800 , 25);
/*
        To be implemented
        SpringCatalog item1 = new SpringCatalog("1: Linen Button-Down Shirt", 2800 , 25);
        SpringCatalog item2 = new SpringCatalog("2: Slim-Fit Chino Pants", 3360, 30);
        SpringCatalog item3 = new SpringCatalog("3: Casual Loafers", 4480, 0);

        WinterCatalog item4 = new WinterCatalog("4: Wool Overcoat", 10080, 10);
        WinterCatalog item5 = new WinterCatalog("5: Thermal Knit Sweater", 3920, 20);
        WinterCatalog item6 = new WinterCatalog("6: Leather Lace-Up Boots", 6720 , 15);

        SpringCatalog [] items = {item1, item2, item3};
        WinterCatalog [] items2 = {item4, item5, item6};



        for (SpringCatalog i:items){
            System.out.println("Spring Collection - Fresh & Casual");
            i.itemInfo();
        }
        for (WinterCatalog x:items2){
            System.out.print("Winter Collection ️- Cozy & Functional");
            x.itemInfo();
        }
*/

//       Test variables, to be transferred to other class
        int testChooseGender;
        int chooseACatalog;

//      For entering customer information
//      To be printed on the receipt
        System.out.println("====== User form ======");
        System.out.print("Enter name: ");
        customer.userName = input.nextLine();

        System.out.print("Enter Address: ");
        customer.userAddress = input.nextLine();

        System.out.print("Enter contact number: ");
        customer.userContactNumber = input.nextLine();;
        System.out.println("=======================");

        System.out.println("1: Male\n2: Female");
        System.out.print("Choose: ");
        testChooseGender = input.nextInt();

        if (testChooseGender == 1){
            System.out.println("\n1: Spring Catalog - Fresh and Casual \uD83C\uDF3F\uD83C\uDF1E");
            System.out.print("Pick a catalog: ❄ \uFE0F\uD83E\uDDE5");
            chooseACatalog = input.nextInt();

            switch (chooseACatalog){
                case 1:
                    System.out.println(" ");
                    inventory.displayCatalog(testCatalog.getSpringCatalogItem(), testCatalog.getSpringCatalogPrice(), springCatalog.isCurrent());
                    System.out.print("Choose an item: ");
                    inventory.chooseItem = input.nextInt();
                    System.out.println("\n"+inventory.showItemInfo(inventory.chooseItem, testCatalog.getSpringCatalogItem(), testCatalog.getSpringCatalogItemStock()));
                    order.itemName = inventory.showItemName(inventory.chooseItem, testCatalog.getSpringCatalogItem());
                    order.itemPrice = inventory.showItemPrice(inventory.chooseItem, testCatalog.getSpringCatalogPrice());

                    if(inventory.ifInStock(inventory.chooseItem, testCatalog.getSpringCatalogItemStock())){
                        System.out.print("Enter item quantity: ");
                        order.itemQuantity = input.nextInt();
                        System.out.println("Proceed to check out");
                        break;
                }
                    System.out.println("This item is out of stock, do you want to pre order?");

            }
        }
        System.out.println("\n===== Payment =====");
        System.out.print("1: Cash on Delivery\n2: Credit Card\n3: Pay by Check (eCheck)\nChoose mode of payment: ");
        payment.modeOfPayment = input.nextInt();

        switch (payment.modeOfPayment){
            case 1:
                break;
            case 2:
                System.out.print("Enter bank name: ");
                input.nextLine();
                payment.bankName = input.nextLine();

                System.out.print("Enter Credit card number: ");
                payment.accountNumber = input.nextLine();
                break;
            case 3:
                System.out.print("Enter bank name: ");
                input.nextLine();
                payment.bankName = input.nextLine();

                System.out.print("Enter Checking account number: ");
                payment.accountNumber = input.nextLine();
                break;
        }
        order.printReceipt(customer.userName, customer.userAddress, customer.userContactNumber, order.itemName, order.itemPrice, order.itemQuantity, payment.paymentType(payment.modeOfPayment, payment.bankName, payment.accountNumber), payment.paymentID);
    }
}
