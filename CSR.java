package CSR;
/*
This class is for customer support 
Contains the variables for Ticket ID and the issue entered
Pulls from User class
*/
public class CSR {
    public int csrID = (int)(Math.random()*2147483647);
    public String csrIssue;

    public String print(String userFirstName, String userLastName, String csrIssue, int csrID){
        System.out.println(" ");
        System.out.println("===== Customer Support =====");
        System.out.println("Name:"+userFirstName +" "+ userLastName);
        System.out.println("Issue: " + csrIssue);
        System.out.println("Ticket ID: "+ csrID);
        return             "=============================";
    }

}
