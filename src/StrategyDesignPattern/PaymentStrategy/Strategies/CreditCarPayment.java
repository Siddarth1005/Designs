package StrategyDesignPattern.PaymentStrategy.Strategies;

public class CreditCarPayment implements PaymentStrategy{
    @Override
    public void executePayment(int amount) {
        System.out.println("This is a payment through Credit Card");

    }
}
