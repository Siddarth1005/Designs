package FactoryDesignPattern.Buttons;

public class HTMLButtons implements Buttons{
    @Override
    public String buttonFunctionality() {
        return "This is a HTML button";
    }
}
