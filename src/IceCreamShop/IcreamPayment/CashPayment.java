package IceCreamShop.IcreamPayment;

public class CashPayment implements IcecreamPaymentStrategy {
    Integer amount;
    public  CashPayment(Integer amount){
        this.amount = amount;
    }
    @Override
    public String processPayment() {
        return "The payment has been successfully completed through Cash for the amount : " + amount;
    }
}
