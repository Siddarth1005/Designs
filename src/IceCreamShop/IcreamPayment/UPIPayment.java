package IceCreamShop.IcreamPayment;

public class UPIPayment implements IcecreamPaymentStrategy {

    Integer amount;
    public  UPIPayment(Integer amount){
        this.amount = amount;
    }
    @Override
    public String processPayment() {
        return "The payment has been successfully completed through UPI for the amount : " + amount;
    }
}
