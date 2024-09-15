package IceCreamShop.IcecreamDecoratorFactory;

import IceCreamShop.Icecream.IceCream;

public interface IcecreamDecoratorFactory {
    IceCreamShop.IcecreamDecorator.IcecreamDecorator getInstance(String toppings, IceCream iceCream);
}
