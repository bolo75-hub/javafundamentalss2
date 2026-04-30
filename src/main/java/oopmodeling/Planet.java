package oopmodeling;

public class Planet extends CelestialBody {

    public Planet() {
        super();
    }

    public Planet(double mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    public Planet(double mass, String name, float radius) {
        this.mass = mass;
        this.name = name;
        this.radius = radius;
    }
}