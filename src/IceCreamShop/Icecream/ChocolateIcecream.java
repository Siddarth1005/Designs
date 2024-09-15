package IceCreamShop.Icecream;

public class ChocolateIcecream implements IceCream {

    Integer cost = 0;
    public ChocolateIcecream(int scopes){
        if(scopes == 1){
            cost =  30;
        }else{
            cost =  50;
        }
    }
    @Override
    public Integer returnCost() {
        return cost;
    }
}
