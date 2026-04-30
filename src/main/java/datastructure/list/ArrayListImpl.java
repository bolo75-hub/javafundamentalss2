package datastructure.list;

public class ArrayListImpl<E> implements list<E> {

    private Object[] elements = new Object[10];
    private int size = 0;

    @Override
    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
            size++;
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E removeFromTail() {
        return null;
    }

    @Override
    public E removeFromHead() {
        return null;
    }

    @Override
    public void addToHead() {

    }

    @Override
    public void addToHead(E e) {
        // Si el array está lleno, no hacemos nada (o podrías agrandarlo)
        if (size >= elements.length) {
            return;
        }

        // Movemos todos los elementos una posición a la derecha
        for (int i = size; i > 0; i--) {
            elements[i] = elements[i - 1];
        }

        // Insertamos el nuevo elemento al principio
        elements[0] = e;
        size++;
    }
}

