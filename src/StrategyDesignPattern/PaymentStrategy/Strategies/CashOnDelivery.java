package StrategyDesignPattern.PaymentStrategy.Strategies;

public class CashOnDelivery implements PaymentStrategy{
    @Override
    public void executePayment(int amount) {
        System.out.println("The payment is on Cash on Delivery");
    }
}
