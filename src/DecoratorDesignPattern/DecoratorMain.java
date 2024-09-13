package DecoratorDesignPattern;


import DecoratorDesignPattern.Pizzas.BasePizza;
import DecoratorDesignPattern.Pizzas.PlainCheese;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.ExtraJalepenio;
import DecoratorDesignPattern.Toppings.ExtraMushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza cheesePizza = new ExtraCheese(new ExtraJalepenio(new PlainCheese()));
        System.out.println(cheesePizza.cost());

    }
}