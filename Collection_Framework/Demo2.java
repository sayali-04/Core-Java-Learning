package Collection_Framework;

import java.util.Iterator;

public class Demo2 {
    
}
class ArrayList implements Iterable<Integer> {

    Integer[] arr;
    int size;

    public Iterator<Integer> iterator() {
        return new ArrayListIterator();
    }

    class ArrayListIterator implements Iterator<Integer> {

        int pos = 0;

        public boolean hasNext() {
            return pos < size;
        }

        public Integer next() {
            return arr[pos++];
        }
    }
}

