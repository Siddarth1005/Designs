package IceCreamShop.IcecreamDecoratorFactory;

import IceCreamShop.Icecream.IceCream;
import IceCreamShop.IcecreamDecorator.HotChocolateTopping;
import IceCreamShop.IcecreamDecorator.IcecreamDecorator;
import IceCreamShop.IcecreamDecorator.KitKatTopping;
import IceCreamShop.IcecreamDecorator.SprinklerTopping;

public class SimpleIcecreamDecorator implements IcecreamDecoratorFactory {
    @Override
    public IcecreamDecorator getInstance(String toppings, IceCream iceCream) {
        switch (toppings){
            case "KitKat":
                return new KitKatTopping(iceCream);
            case "Sprinkler":
                return new SprinklerTopping(iceCream);
            case "HotChocolate":
                return new HotChocolateTopping(iceCream);
        }
        return null;
    }
}
