package FactoryDesignPattern.Buttons;

public class WindowsButtons implements  Buttons{
    @Override
    public String buttonFunctionality() {
        return "This is a windows button";
    }
}
