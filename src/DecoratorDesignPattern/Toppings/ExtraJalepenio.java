package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizzas.BasePizza;

public class ExtraJalepenio extends ToppingDecorator{

    BasePizza basePizza;
    public ExtraJalepenio(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 150;
    }
}
