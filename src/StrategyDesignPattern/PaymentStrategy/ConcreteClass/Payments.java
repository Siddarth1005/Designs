package StrategyDesignPattern.PaymentStrategy.ConcreteClass;

import StrategyDesignPattern.PaymentStrategy.Strategies.PaymentStrategy;

public class Payments {
    PaymentStrategy paymentMode;

    public Payments(PaymentStrategy payment){
       this.paymentMode  = payment;
    }
    public void payForTheOrder(int amount){
        paymentMode.executePayment(amount);
    }
}
