package _6_absctractfactory.window.avec_pattern;

public class Application {

    public static void main(String[] args) {

        EcranConnexionFactory ecranConnexionFactory = new MicrosoftWindowFactory();

        EcranConnexionFactory ecranConnexionFactory2 = new WebWindowFactory();

        ecranConnexionFactory.dessinerEcran();

        ecranConnexionFactory2.dessinerEcran();


    }
}
