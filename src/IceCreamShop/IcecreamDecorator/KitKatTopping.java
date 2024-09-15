package IceCreamShop.IcecreamDecorator;

import IceCreamShop.Icecream.IceCream;

public class KitKatTopping implements IcecreamDecorator {
    IceCream iceCream;
    public KitKatTopping(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Integer returnCost() {
        return iceCream.returnCost() + 100;
    }
}
