package FactoryDesignPattern.Dialogs;

import FactoryDesignPattern.Buttons.Buttons;
import FactoryDesignPattern.Buttons.WindowsButtons;

public class WindowsDialogConcrete extends DialogAbstract{
    @Override
    public Buttons createButtons() {
        return new WindowsButtons();
    }
}
