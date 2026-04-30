package datastructure;

import oopmodeling.Planet;

public class FlexibleArrayTest {

    static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray =
                new FlexibleArray<>();
        System.out.println("the curent size = " + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);

    }
}
