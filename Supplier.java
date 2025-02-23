import java.util.Scanner;

Public class Supplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("Unfortunately, your desired item/s is out-of-stock.");
        System.out.println(" ");
        System.out.println("Please choose whether you want to Back Order or choose other items/exit:");
        System.out.println("1. Back Order");
        System.out.println("2. Choose other Items/Exit");
        System.out.print("Enter your Choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1){
            System.out.println("You chose the option 1. Back order ");
            System.out.println(" ");
            System.out.println("Your Item/s will be Back ordered to the supplier." );
            System.out.println(" ");
            System.out.println("We will notify you once we've acquired stock and prepared your order/s." );
            System.out.println("We are deeply sorry for the Inconvienence and Thank you for Purchasing." );
            System.out.println(" ");
            
        }
        else {
            System.out.println("We are deeply sorry for the Inconvienence and Thank you for Purchasing." );
        }
        System.out.println("Select from option below: ");
        System.out.println("1. Continue Shopping");
        System.out.println("2. End Shopping/Exit");
            
        int choiceS = scanner.nextInt();
            
        
    }
}
