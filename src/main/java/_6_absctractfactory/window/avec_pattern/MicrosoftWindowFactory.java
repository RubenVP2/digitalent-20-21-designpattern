package _6_absctractfactory.window.avec_pattern;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowButton;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowInput;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowScreen;

public class MicrosoftWindowFactory implements EcranConnexionFactory{

    @Override
    public void dessinerEcran() {
        Screen screen = createScreen();
        screen.add(createInput());
        screen.add(createButton());
        System.out.println("Ecran windows crée");
    }

    @Override
    public Button createButton() {
        return new MicrosoftWindowButton();
    }

    @Override
    public Input createInput() {
        return new MicrosoftWindowInput();
    }

    @Override
    public Screen createScreen() {
        return new MicrosoftWindowScreen();
    }
}
