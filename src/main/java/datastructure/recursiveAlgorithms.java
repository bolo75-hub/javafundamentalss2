package datastructure;

import java.util.List;

public class recursiveAlgorithms { // Clase empieza con Mayúscula

    // Hace una escalera de asteriscos que crece en cada fila.
    public static void draw(int n) {
        if (n <= 0) {
            return;
        }
        draw(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Pone los números en orden y luego al revés con un palo en medio.
    public static void pattern(int n) {
        if (n <= 0) {
            System.out.print("|");
            return;
        }
        System.out.print(n);
        pattern(n - 1);
        System.out.print(n);
    }

    // Imprime asteriscos seguidos usando recursión.
    public static void printStars(int count) {
        if (count <= 0) return; // Mejorado para evitar bucles infinitos con negativos
        System.out.print("* ");
        printStars(count - 1);
    }

    // Corregido: Se agregaron las llaves faltantes
    public static void printStarsWithLoop(int count) {
        if (count <= 0) return;
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Salto de línea opcional para limpieza
    }

    // Dibuja un rectángulo de asteriscos usando filas y columnas.
    public static void drawGrid(int rows, int cols) {
        if (rows <= 0) return;
        printStars(cols);
        System.out.println();
        drawGrid(rows - 1, cols);
    }

    // Cuenta cuántas formas hay de moverse por una cuadrícula.
    public static int paths(int row, int col) {
        if (row == 0 || col == 0) {
            return 1;
        }
        return paths(row - 1, col) + paths(row, col - 1);
    }

    // Suma todos los dígitos de un número.
    public static int transform(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + transform(n / 10);
    }

    // Suma solo los números que sean impares de una lista.
    // Nota: subList crea vistas, es eficiente pero cuidado con listas muy largas (StackOverflow).
    public static int process(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int head = list.get(0);
        List<Integer> rest = list.subList(1, list.size());

        if (head % 2 != 0) {
            return head + process(rest);
        } else {
            return process(rest);
        }
    }

    // Mira qué tan alto o profundo es un árbol de datos.
    public static <T> int analyze(Node<T> node) {
        if (node == null) {
            return 0;
        }
        int a = analyze(node.left);
        int b = analyze(node.right);
        return 1 + Math.max(a, b);
    }

    // Le da la vuelta a una palabra o frase.
    public static String execute(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return execute(s.substring(1)) + s.charAt(0);
    }

    // Corregido: Clase Static para ser accesible por métodos estáticos
    public static class Node<T> {
        public Node<T> left;
        public Node<T> right;
        public T data; // Opcional: para guardar valor
    }

    public static void main(String[] args) {
        System.out.println("--- Stars ---");
        printStars(5);
        System.out.println("\n--- Pattern ---");
        pattern(3);
        System.out.println("\n--- Execute (Reverse) ---");
        System.out.println(execute("Recursion"));
    }
}