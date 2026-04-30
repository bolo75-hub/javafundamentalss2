package Test;

import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {
    public static void main(String[] args) {
        // Inicialización de objetos
        Star sun = new Star();
        Star sun2 = new Star();
        Planet planet = new Planet();
        Planet planet2 = new Planet();

        // Configuración de masas
        sun.setMass(75667);
        sun2.setMass(234);
        planet.setMass(5855858);
        planet2.setMass(45454);

        // Impresiones
        System.out.println("Masa de sun: " + sun.getMass());

        // toString() de Planet (Asegúrate de que Planet tenga este método definido)
        System.out.println(planet);

        System.out.println("The mass of the planet is now " + (int) planet.getMass());

        // MANEJO DE NULL
        Star utus = null;

        if (utus == null) {
            System.out.println("Error: La estrella 'utus' no ha sido inicializada.");
        } else {
            System.out.println("the mass of the star utus is " + utus.getMass());
        }

    } // Cierre del método main
} // Cierre de la clase Test
