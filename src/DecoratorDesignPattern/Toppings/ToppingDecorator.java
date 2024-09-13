package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizzas.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    @Override
    public abstract int cost();
}
