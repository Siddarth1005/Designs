package IceCreamShop.IcecreamFactory;

import IceCreamShop.Icecream.ButterscotchIcecream;
import IceCreamShop.Icecream.ChocolateIcecream;
import IceCreamShop.Icecream.IceCream;
import IceCreamShop.Icecream.VanillaIcecream;

public class SimpleIcecreamCreation implements IceCreamFactory {
    @Override
    public IceCream getInstance(String flavour, Integer scoopes) {
        switch (flavour){
            case "Vanilla":
                return new VanillaIcecream(scoopes);
            case "Chocolate":
                return new ChocolateIcecream(scoopes);
            case "ButterscothIcecream":
                return new ButterscotchIcecream(scoopes);
        }
        return null;
    }
}
