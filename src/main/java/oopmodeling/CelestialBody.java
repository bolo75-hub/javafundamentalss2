package oopmodeling;

public class CelestialBody { // Corregido a CamelCase: CelestialBody

    // Atributos con diferentes modificadores de acceso
    protected double mass = 1000000;

    // Sin modificador (package-private): accesible solo dentro del paquete oopmodeling
    String name = "Unknown";

    public float radius = 1234343.3f;

    private int age = 1000; // Solo accesible dentro de esta clase

    // Constructor vacío
    public CelestialBody() {
    }

    // --- Getters y Setters ---

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) { // Completado el método que faltaba
        this.radius = radius;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
