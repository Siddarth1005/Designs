package IceCreamShop.IcreamPayment;

public class CardPayment implements IcecreamPaymentStrategy {

    Integer cvv;
    Integer amount;
    public CardPayment(Integer cvv, Integer amount){
        this.cvv = cvv;
        this.amount = amount;
    }
    @Override
    public String processPayment() {
        return "The payment has been successfully completed through Card for the amount : " + amount ;
    }
}
