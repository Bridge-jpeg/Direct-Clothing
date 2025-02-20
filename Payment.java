package Main;

public class Payment {

    int  paymentID = (int)(Math.random()*2147483647);
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


}
