package _6_absctractfactory.window.avec_pattern;

import _6_absctractfactory.window.correction.Button;
import _6_absctractfactory.window.correction.Input;
import _6_absctractfactory.window.correction.Screen;

public interface EcranConnexionFactory {

    void dessinerEcran();

    Button createButton();

    Input createInput();

    Screen createScreen();
}
