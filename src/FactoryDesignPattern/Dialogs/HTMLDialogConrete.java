package FactoryDesignPattern.Dialogs;

import FactoryDesignPattern.Buttons.Buttons;
import FactoryDesignPattern.Buttons.HTMLButtons;

public class HTMLDialogConrete extends DialogAbstract{
    @Override
    public Buttons createButtons() {
        return new HTMLButtons();
    }
}
