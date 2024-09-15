package IceCreamShop;
import IceCreamShop.Icecream.IceCream;
import IceCreamShop.IcecreamDecorator.IcecreamDecorator;
import IceCreamShop.IcecreamDecoratorFactory.IcecreamDecoratorFactory;
import IceCreamShop.IcecreamDecoratorFactory.SimpleIcecreamDecorator;
import IceCreamShop.IcecreamFactory.IceCreamFactory;
import IceCreamShop.IcecreamFactory.SimpleIcecreamCreation;
import IceCreamShop.IcecreamObserver.Observers.NewFlavoursPublisher;
import IceCreamShop.IcecreamObserver.Subscriber.EmailNotifications;
import IceCreamShop.IcecreamObserver.Subscriber.NotificationSubscriber;
import IceCreamShop.IcecreamObserver.Subscriber.PhoneNotifications;
import IceCreamShop.IcreamPayment.CardPayment;
import IceCreamShop.IcreamPayment.CashPayment;
import IceCreamShop.IcreamPayment.IcecreamPaymentStrategy;
import IceCreamShop.IcreamPayment.UPIPayment;

import java.util.Scanner;

public class ClientCode {

    public static void main(String[] args) {

        System.out.println("Hello! Welcome to the Ice Cream Shop, please choose the ice cream that you want to have");
        Scanner scanner = new Scanner(System.in);
        String flavour = scanner.nextLine();
        System.out.println("How many scopes would you like to have?");
        Integer scopesNo = Integer.valueOf(scanner.nextLine());


//        Creating an object of Icecreamfactory
        IceCreamFactory iceCream = new SimpleIcecreamCreation();
        IcecreamDecoratorFactory icreamDecorator = new SimpleIcecreamDecorator();


//        Getting an instance of which IceCream the userwants (The factory sublcass has the method to create the
//        instance iceream class
        IceCream CustomerIceCream = iceCream.getInstance(flavour, scopesNo);

//        ToppingDecorator Pattern Implemented
        System.out.println("What toppings do you want? KitKat, Sprinkler, HotChocolate");
        String preferredToping = scanner.nextLine();

//        Getting the instance of the object that is created.
        IcecreamDecorator topping1 = icreamDecorator.getInstance(preferredToping, CustomerIceCream);

//      Returning the final cost
        Integer finalCost = topping1.returnCost();

        System.out.println("The total cost is : " + finalCost + " How would you like to pay? UPI, Card, Cash?");
        String paymentMode = scanner.nextLine();


//        Implementing payment Stratergy
        if(paymentMode.equals("Card")){
            IcecreamPaymentStrategy payment = new CardPayment(123, finalCost);
            System.out.println(payment.processPayment());
        } else if (paymentMode.equals("Cash")) {
            IcecreamPaymentStrategy payment = new CashPayment(finalCost);
            System.out.println(payment.processPayment());
        }else {
            IcecreamPaymentStrategy payment =  new UPIPayment(finalCost);
            System.out.println(payment.processPayment());
        }

//        Implementing Observer
        System.out.println("Do you want to be notfied of any new flavours?");
        String userReply = scanner.nextLine();
        if(userReply.equals("Yes")){
            System.out.println("Do you wanna be notfied on Phone or via email?");
            String notificationMode = scanner.nextLine();
            if (notificationMode.equals("Phone")){
                System.out.println("Can you enter your phone number please");
                String phoneNumber = scanner.nextLine();
                NewFlavoursPublisher publisher = new NewFlavoursPublisher();
                NotificationSubscriber subscriber = new PhoneNotifications(publisher,phoneNumber);
                publisher.addSubscriber(subscriber);
                publisher.upDateAllSubscribers();
            }else{
                System.out.println("Can you enter your Email ID please");
                String phoneNumber = scanner.nextLine();
                NewFlavoursPublisher publisher = new NewFlavoursPublisher();
                NotificationSubscriber subscriber = new EmailNotifications(publisher,phoneNumber);
                publisher.addSubscriber(subscriber);
                publisher.upDateAllSubscribers();
            }
        }else{
            System.out.println("Thank you for the purchase");
        }
    }
}
