package datastructure.list;

public class linkedListImpl<E> implements list<E> {
    // Referencia al último elemento de la lista
    private Node<E> last;

    // Referencia al primer elemento de la lista
    private Node<E> first;

    /**
     * this method removes a nodo from the tail of the list
     *
     * @param e
     * @throws Exception
     **/
    public void add(E e) {

        // 1. Comprobar si el parámetro es válido
        // Si el nodo que se pasa es null, lanzamos una excepción
        if (e == null) {
            try {
                throw new Exception("You can not pass a null node to the list");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        Node<E> node = new Node<E>(e);
        // 2. Añadir el nodo al final (cola) de la lista

        // 2.1 Comprobar primero si el primer elemento es null
        // Si first es null, significa que la lista está vacía
        if (first == null) { // Si la lista está vacía

            // Como la lista está vacía, el nuevo nodo será
            // tanto el primero como el último
            last = node;
            first = node;

            // first.next = last;  (comentado en el código original)

        } else {

            // Si la lista NO está vacía:

            // Hacemos que el último nodo actual apunte al nuevo nodo
            last.next = node;

            // Actualizamos la referencia last para que ahora
            // el nuevo nodo sea el último de la lista
            last = node;

            // Código alternativo comentado en el original:
            // Node temp = last;
            // last = node;
            // temp.next = last;
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

    }

    // Devuelve el último nodo de la lista
    public Node<E> getLast() {
        return last;
    }

    // Devuelve el primer nodo de la lista
    public Node<E> getFirst() {
        return first;
    }

    public Node<E> remove() {

        Node<E> temp2;
        Node<E> temp = first;
        while (temp != null && temp.next != null) {
            temp2 = temp;
            //move to the next line
            temp = temp.next;

        }

        return null;
    }

    // Método para imprimir la lista
    public void printList() {

        // Imprime el dato del primer nodo
        System.out.println(first.getData());

        // Imprime el dato del segundo nodo
        System.out.println(first.getNext().getData());

        // Imprime el dato del tercer nodo
        System.out.println(first.getNext().getNext().getData());

        // Imprime el dato del cuarto nodo
        System.out.println(first.getNext().getNext().getNext().getData());

        // Imprime el dato del quinto nodo
        System.out.println(first.getNext().getNext().getNext().getNext().getData());

        // Imprime el dato del sexto nodo
        System.out.println(first.getNext().getNext().getNext().getNext().getNext().getData());
    }


}

class Node<E> {

    // Constructor: crea un nodo con el dato que se pasa como parámetro
    public Node(E e) {
        data = e;
    }

    // Dato almacenado en el nodo
    private E data;

    // Cada nodo apunta al siguiente nodo de la lista
    protected Node<E> next;

    // Devuelve el dato almacenado en el nodo
    public E getData() {
        return data;
    }

    // Modifica el dato almacenado en el nodo
    public void setData(E data) {
        this.data = data;
    }

    // Devuelve el siguiente nodo
    public Node<E> getNext() {
        return next;
    }

    // Establece cuál es el siguiente nodo
    public void setNext(Node<E> next) {
        this.next = next;
    }
}