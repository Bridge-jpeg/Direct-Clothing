import java.util.Scanner;

public class Customer{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please proceed to fill up all the necesssary informations for your account");
        System.out.println("Please enter your Last Name:");
        String lastName = scanner.nextLine();
        
        System.out.println("Please enter your First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your Complete Address:");
        String Address = scanner.nextLine();

        System.out.println("Please enter your Email Address:");
        String emailAddress = scanner.nextLine();

        System.out.println("Please enter your Contact Number:");
        int contactNumber = scanner.nextInt();

        scanner.close();

        System.out.println("===============================");
        System.out.println("Customer Details: ");
        System.out.println("Name: " + lastName + "," + firstName );
        System.out.println("Address: " + Address);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("===============================");
    
	}
}
