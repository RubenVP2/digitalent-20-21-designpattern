package _3_iterator;

public class MaLinkedListStringIterator implements Iterator {
    private MaLinkedListString maLinkedListString;
    private Integer currentPosition = 0;

    public MaLinkedListStringIterator(MaLinkedListString maLinkedListString) {
        this.maLinkedListString = maLinkedListString;
    }

    @Override
    public String getNext() {
        if ( !hasNext() ) {
            return null;
        }
        String nextElement = maLinkedListString.get(currentPosition);
        currentPosition++;
        return nextElement;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < maLinkedListString.count();
    }
}
