package IceCreamShop.IcecreamDecorator;

import IceCreamShop.Icecream.IceCream;

public class HotChocolateTopping implements IcecreamDecorator {

    IceCream iceCream;

    public HotChocolateTopping(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public Integer returnCost() {
        return iceCream.returnCost() + 400;
    }
}
