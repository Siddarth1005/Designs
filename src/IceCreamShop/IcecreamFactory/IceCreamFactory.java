package IceCreamShop.IcecreamFactory;

import IceCreamShop.Icecream.IceCream;

public interface IceCreamFactory {
    public IceCream getInstance(String flavour, Integer scoopes);
}
