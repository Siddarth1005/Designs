package IceCreamShop.Icecream;

public class ButterscotchIcecream implements IceCream {
    Integer cost = 0;
    public ButterscotchIcecream(int scopes){
        if(scopes == 1){
            cost = 20;
        }else{
            cost = 40;
        }
    }
    @Override
    public Integer returnCost() {
        return cost;
    }
}
