package _3_iterator.arbre;

import _3_iterator.Iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ArbreIterator implements Iterator {

    private Arbre arbre;
    private Deque<Arbre> arbreIterators = new ArrayDeque<Arbre>();

    public ArbreIterator(Arbre arbre) {
        this.arbre = arbre;
    }

    @Override
    public String getNext() {
        String elem = null;
        while (!this.arbreIterators.isEmpty() || this.arbre != null) {
            if (this.arbre != null) {
                arbreIterators.push(this.arbre);
                this.arbre = this.arbre.getSousArbreGauche();
            } else {
                this.arbre = arbreIterators.pop();
                elem = this.arbre.getValeur();
                this.arbre = this.arbre.getSousArbreDroit();
                break;
            }
        }
        return elem;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return (!this.arbreIterators.isEmpty() || this.arbre != null);
    }
}
