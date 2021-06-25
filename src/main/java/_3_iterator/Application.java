package _3_iterator;

import _3_iterator.arbre.Arbre;

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        MaArrayListeString maListeString = new MaArrayListeString();

        maListeString.add("toto");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        maListeString.add("tata");
        System.out.println(maListeString.count());
        System.out.println(maListeString.get(1));

        for (String value : maListeString) {
            System.out.println(value);
        }

        for (int i = 0; i < maListeString.count(); i++) {
            System.out.println(maListeString.get(i));
        }

        for (Iterator iterator = maListeString.createIterator(); iterator.hasNext(); ) {
            String elem = iterator.getNext();
        }


        System.out.println("------- MaLinkedListString -------");
        MaLinkedListString maLinkedListString = new MaLinkedListString();
        maLinkedListString.add("A");
        maLinkedListString.add("B");
        maLinkedListString.add("C");

        for (Iterator iterator = maLinkedListString.createIterator(); iterator.hasNext();) {
            String e = iterator.getNext();
            System.out.println(e);
        }


        System.out.println("------- ArbreIterator -------");
        Arbre arbreA = new Arbre();
        arbreA.setValeur("A");
        Arbre arbreB = new Arbre();
        arbreB.setValeur("B");
        Arbre arbreC = new Arbre();
        arbreC.setValeur("C");
        Arbre arbreD = new Arbre();
        arbreD.setValeur("D");

        arbreA.setSousArbreDroit(arbreC);
        arbreA.setSousArbreGauche(arbreB);
        arbreB.setSousArbreGauche(arbreD);

        for ( Iterator iterator = arbreA.createIterator(); iterator.hasNext();) {
            System.out.println(iterator.getNext());
        }

    }
}
