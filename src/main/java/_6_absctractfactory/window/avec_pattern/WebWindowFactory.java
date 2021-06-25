package _6_absctractfactory.window.avec_pattern;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;
import _6_absctractfactory.window.exercice.web.WebButton;
import _6_absctractfactory.window.exercice.web.WebInput;
import _6_absctractfactory.window.exercice.web.WebScreen;

public class WebWindowFactory implements EcranConnexionFactory{

    @Override
    public void dessinerEcran() {
        Screen screen = createScreen();
        screen.add(createInput());
        screen.add(createInput());
        screen.add(createButton());
        System.out.println("Ecran web crée");
    }

    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Input createInput() {
        return new WebInput();
    }

    @Override
    public Screen createScreen() {
        return new WebScreen();
    }
}
