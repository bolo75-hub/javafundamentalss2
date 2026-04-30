package datastructure;

import oopmodeling.CelestialBody; // Asegúrate de que el nombre sea exacto (Celestialbody vs CelestialBody)

public class ConversionTest {

    // Clase auxiliar interna para que el código compile si no tienes el archivo Planet.java
    public static class Planet extends CelestialBody {
        public String name;
        public Planet() {}
        public Planet(String name) { this.name = name; }
    }

    // Clase base para el ejemplo de polimorfismo
    public static class CelestialBody {}

    public static void main(String[] args) {
        // Llamada al método corregido
        primitiveConversion();

        // --- Polimorfismo ---
        Planet p1 = new Planet();

        // Un planeta es de tipo CelestialBody y Object
        CelestialBody p2 = new Planet();
        Object p3 = new Planet(); // 'Object' siempre empieza con Mayúscula
        Object p4 = new CelestialBody();

        // Casting (Conversión explícita)
        Planet p5 = (Planet) p3;

        System.out.println(p5);
        System.out.println(p3);
        System.out.println(p5 == p3); // Compara si apuntan al mismo objeto en memoria

        // --- Manejo de Arrays ---
        Object[] objArray = new Object[20];

        // Llenar con Planet
        for (int i = 0; i < 20; i++) {
            objArray[i] = new Planet("P" + i);
        }

        // Convertir explícitamente a Planet[]
        Planet[] planetArray = new Planet[20];
        for (int i = 0; i < 20; i++) {
            planetArray[i] = (Planet) objArray[i];
        }

        polymorphismMethod(p2);
    }

    // El método debe estar FUERA del main
    private static void primitiveConversion() {
        int num1 = 234234234;
        byte num2 = 127;
        float num3 = 324.4f;

        // Conversión implícita (byte cabe en int)
        num1 = num2;
        System.out.println("num1 (desde byte): " + num1);

        // Conversión explícita (Casting)
        num1 = 1235;
        num2 = (byte) num1; // Aquí habrá pérdida de datos porque 1235 > 127
        System.out.println("num2 (casting de 1235): " + num2);
    }

    private static void polymorphismMethod(CelestialBody cb) {
        System.out.println("Ejecutando método polimórfico");
    }
}
