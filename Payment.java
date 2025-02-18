package Main;

public class Payment {
    String testItem = "Test Item";
    double testPrice = 4040;
    int testItemAmount = 1;
    String  paymentID = "testID";
    int paymentTypeNum;
    String paymentType;

    public void setPaymentTypeNum(int paymentTypeNum){
        if (paymentTypeNum == 1){
            paymentType = "Cash on Delivery";
        }
        if (paymentTypeNum == 2){
            paymentType = "Online payment";
        }
    }

    public String printReceipt(String userFirstName, String userLastName, String userAddress, int userContactNumber, String testItem, double testPrice, int testItemAmount){
        System.out.println(" ");
        System.out.println("===========Receipt===========");
        System.out.println("Name:"+userFirstName +" "+ userLastName);
        System.out.println("Address: " + userAddress);
        System.out.println("Contact number: "+userContactNumber);
        System.out.println("Item: " + testItem);
        System.out.println("Price: " + testPrice);
        System.out.println("Quantity: " + testItemAmount);
        System.out.println("Payment type: " + paymentType);
        return "=============================";
    }

}
