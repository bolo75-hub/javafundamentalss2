package oopmodeling;

public class ObjectCreation {
    public static void main(String[] args) {
        Object obj = new Planet();
        Planet obj2 =   new Planet();
        Planet jupiter = new Planet(324234, "jupiter");
        Planet mars = new Planet(435345, "mars", 2343);

    }
}
