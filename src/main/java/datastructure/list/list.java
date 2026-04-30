package datastructure.list;

/**
 * interface oriented development: we use iterfaces to
 * abstract different solutions
 * in a interface, you can declare methods, but without
 * implementations, in other words, without method body,
 * or only with method signature (firma). As each method
 * could have multiples different implementation in different
 * class
 *
 * @param <E>
 * @author diego
 * feb 19, 2026
 *
 **/
public interface list<E> {
    /*add on element to the tail of thew list
     * @param eL
     * */
    public void add(E e);

    public E remove(int index);
    /*remove the last element
     * @return*/

    public E removeFromTail();
    /*remove */

    public E removeFromHead();
    /*add on element to the specified position
     * @param e
     */

    public void addToHead();


    void addToHead(E e);
}
