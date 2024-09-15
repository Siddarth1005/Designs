package IceCreamShop.Icecream;

public class VanillaIcecream implements IceCream {

    Integer cost = 0;
    public VanillaIcecream(int scopes){
        if(scopes == 1){
            cost = 10;
        }else{
            cost =  30;
        }
    }

    @Override
    public Integer returnCost() {
        return cost;
    }

}
