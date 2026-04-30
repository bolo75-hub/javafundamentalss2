package algorithm;

import oopmodeling.Planet;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BuiltinDataStructure {

    // Definimos una clase interna User para que el código compile
    // Si ya tienes una clase User en otro archivo, asegúrate de importarla
    public static class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // planet1 usa el constructor vacío (asegúrate que existe en Planet.java)
        Planet planet1 = new Planet();
        Planet planet2 = new Planet(123, "Mars");

        Planet[] pls = new Planet[5];
        pls[0] = planet1;
        pls[1] = planet2;

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(planet1);
        planets.add(planet2);
        planets.get(1);

        LinkedList<String> names = new LinkedList<>();
        names.add("diego");
        names.add("rubibia");
        names.get(1);

        Stack<Integer> callstack = new Stack<>();
        callstack.push(34);
        callstack.push(10);
        callstack.push(2);

        System.out.println("Stack Peek: " + callstack.peek());
        System.out.println("Stack Pop: " + callstack.pop());
        System.out.println("Stack Peek after pop: " + callstack.peek());

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(123);
        queue.add(12);
        queue.add(12300);
        System.out.println("Queue Poll 1: " + queue.poll());
        System.out.println("Queue Poll 2: " + queue.poll());

        Queue<String> printedTask = new LinkedList<>();
        printedTask.add("task 1");
        printedTask.add("task 2");
        printedTask.add("task 3");

        System.out.println("Task Peek: " + printedTask.peek());
        System.out.println("Task Poll 1: " + printedTask.poll());
        System.out.println("Task Poll 2: " + printedTask.poll());

        // CORRECCIÓN AQUÍ:
        // 1. Inicializamos los Maps (si no, darán NullPointerException al usarlos)
        // 2. Cambiamos 'user' por 'User' (la clase que definimos arriba)
        TreeMap<String, Planet> tree = new TreeMap<>();
        TreeMap<String, User> users = new TreeMap<>();

        // Ejemplo de uso:
        users.put("admin", new User(1, "Diego"));
        System.out.println("User in Map: " + users.get("admin").name);
    }
}