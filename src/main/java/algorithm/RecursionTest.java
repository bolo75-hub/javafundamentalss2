package algorithm;

public class RecursionTest {
    public static void main(String[] args) {
    addByOne(0);
    }
    public static void addByOne(int num) {
        num++;
        System.out.println(num);
        addByOne(num);
    }
}
