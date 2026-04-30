package datastructure;

import java.util.Arrays;

public class FlexibleArray<E> {
    private E[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 5;
    private static final int EXPANSION_FACTOR = 5;

    @SuppressWarnings("unchecked")
    public FlexibleArray() {
        // Correcto: Creamos un array de Object y lo casteamos a E[]
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public void add(E element) {
        // Redimensionar si está lleno
        if (size == elements.length) {
            int newCapacity = elements.length + EXPANSION_FACTOR;
            // Usamos Arrays.copyOf que es más limpio y eficiente que un for manual
            elements = Arrays.copyOf(elements, newCapacity);
        }

        // Añadir el elemento y luego incrementar el contador
        elements[size] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        // Desplazar elementos a la izquierda para "tapar" el hueco
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // Importante: limpiar la última posición para el Garbage Collector
        elements[size - 1] = null;
        size--;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }
}
