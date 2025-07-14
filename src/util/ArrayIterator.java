package util;

public class ArrayIterator<T> implements Iterable<T> {
    private final T[] data;

    public ArrayIterator(T[] data) {
        this.data = data;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public T next() {
                return data[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }
}
