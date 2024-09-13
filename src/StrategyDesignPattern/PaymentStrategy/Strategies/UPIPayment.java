package StrategyDesignPattern.PaymentStrategy.Strategies;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void executePayment(int amount) {
        System.out.println("The payment is on UPI");
    }
}
