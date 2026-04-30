package datastructure;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class SortingTest {
    public static void main(String[] args) {
        int[] scores = {12, 24, 3232, 323, 3232, 32332, 32323, 323};
        String[] names = {"pablo", "diego", "jorge", "juan", "ana"};

        // Ordenar es obligatorio para la búsqueda binaria
        sort(scores);
        sort(names);

        // Corregido: punto y coma y coincidencia de nombres de variables
        boolean isExisting = binarySearching(234, scores);
        System.out.println("¿Existe (Binary)?: " + isExisting);

        isExisting = linearSearching(234, scores);
        System.out.println("¿Existe (Linear)?: " + isExisting);
    }

    /**
     * Búsqueda Lineal: Compara uno a uno.
     */
    private static boolean linearSearching(int element, int[] elements) {
        if (elements == null) return false;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Búsqueda Binaria: Divide el array en mitades.
     * Requiere que el array esté ORDENADO.
     */
    private static boolean binarySearching(int element, int[] elements) {
        if (elements == null || elements.length == 0) return false;

        int low = 0;
        int high = elements.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Evita desbordamiento en arrays gigantes

            if (elements[mid] == element) {
                return true; // Encontrado
            }

            if (elements[mid] > element) {
                high = mid - 1; // Buscar en la mitad izquierda
            } else {
                low = mid + 1; // Buscar en la mitad derecha
            }
        }
        return false; // No se encontró
    }
}