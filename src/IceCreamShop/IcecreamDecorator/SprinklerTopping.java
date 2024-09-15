package IceCreamShop.IcecreamDecorator;

import IceCreamShop.Icecream.IceCream;

public class SprinklerTopping implements IcecreamDecorator {

    IceCream iceCream;
    public SprinklerTopping(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Integer returnCost() {
        return iceCream.returnCost() + 200;
    }
}
