package Main;

import CSR.CSR;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CSR csr = new CSR();
        Customer user = new Customer();
        Payment payment = new Payment();

        Scanner input = new Scanner(System.in);

        int action = 0;

        System.out.println("=============================");
        System.out.print("Enter first name: ");
        user.userFirstName = input.nextLine();

        System.out.print("Enter last name: ");
        user.userLastName = input.nextLine();

        System.out.print("Enter address: ");
        user.userAddress = input.nextLine();

        System.out.print("Enter contact number: ");
        user.userContactNumber = input.nextInt();

        System.out.print("Enter email address: ");
        input.nextLine();
        user.userEmailAddress = input.nextLine();

        System.out.println("=============================");

        System.out.println("\n=============================");
        System.out.println("1: Shop");
        System.out.println("2: Customer support");
        System.out.print("Enter action: ");
        action = input.nextInt();
        System.out.println("=============================");

        if (action == 1){
            System.out.println("Shop");

            System.out.println("1: Cash on Delivery");
            System.out.println("2: Online Payment");
            System.out.print("Select Payment method: ");

            payment.paymentTypeNum = input.nextInt();
            payment.setPaymentTypeNum(payment.paymentTypeNum);

            if (payment.paymentTypeNum == 1){
                System.out.println(payment.printReceipt(user.userFirstName, user.userLastName, user.userAddress, user.userContactNumber, payment.testItem, payment.testPrice, payment.testItemAmount));
            }
            if (payment.paymentTypeNum == 2){
                System.out.println(payment.printReceipt(user.userFirstName, user.userLastName, user.userAddress, user.userContactNumber, payment.testItem, payment.testPrice, payment.testItemAmount));
            }
        }
        if (action == 2){
            System.out.print("What's your concern: ");
            input.nextLine();
            csr.csrIssue = input.nextLine();
            System.out.println(csr.printSupportTicket(user.userFirstName, user.userLastName, csr.csrIssue));
        }
    }
}
