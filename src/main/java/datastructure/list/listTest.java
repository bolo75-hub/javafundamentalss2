package datastructure.list;

public class listTest {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);

        linkedListImpl<Integer> list = new linkedListImpl<Integer>();
        System.out.println("the first node of the list is" + list.getFirst());
        System.out.println("the last node of the list is" + list.getLast());

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(30);
        list.printList();
        list.remove();
    }
}
