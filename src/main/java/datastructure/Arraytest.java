package datastructure;

import oopmodeling.Planet;

import java.util.Arrays;
import java.util.Random;

public class Arraytest {

    public static void main(String[] args) {
        int[] scores = {12, 34, 3224, 32};
        int[] arr = {1, 20, 40, 80};

        String[] names = {"pablo", "diego", "jorge"};
        Planet[] planets = {new Planet(), new Planet()};

        // Accedemos a los nombres
        System.out.println(names[0]);
        System.out.println(names[1]);

        sumup();

        // Crear un array para almacenar 10000 enteros
        int[] nums = new int[10000];
        System.out.println("The length of the number array is " + nums.length);

        initializeArray(nums);
        findMaxMin(nums);

        // Aumentar salarios
        float[] salaries = {4.5f, 5.6f, 6.7f, 45.4484f};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += 10;
            System.out.println("Salario actualizado [" + i + "]: " + salaries[i]);
        }

        // Intercambiar valores
        switchValues(scores, 0, 2);

        // Invertir array
        reverse(arr);
        System.out.println("Scores actuales: " + Arrays.toString(scores));

        // Crear subarray (slice)
        int[] sliced = slice(scores, 0, 2);
        System.out.println("Subarray (0,2): " + Arrays.toString(sliced));
    }

    /** Crea una porción del array entre los índices start y end */
    private static int[] slice(int[] arr, int start, int end) {
        if (arr == null) return null;
        if (start < 0 || end < 0 || start >= arr.length || end >= arr.length) return null;
        if (start > end) return null;

        int[] result = new int[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[start + i];
        }

        System.out.println("Slice result: " + Arrays.toString(result));
        return result;
    }

    /** Invierte el orden de un array y lo devuelve */
    private static int[] reverse(int[] list) {
        if (list == null || list.length == 0) return list;

        int[] nuevo = new int[list.length];
        for (int j = 0; j < list.length; j++) {
            nuevo[nuevo.length - 1 - j] = list[j];
        }

        System.out.println("Array invertido: " + Arrays.toString(nuevo));
        return nuevo;
    }

    /** Intercambia los valores de dos posiciones si son válidas */
    public static void switchValues(int[] arr, int index1, int index2) {
        if (arr == null) return;
        if (index1 < 0 || index2 < 0) return;
        if (index1 >= arr.length || index2 >= arr.length) return;

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("Valores intercambiados: " + Arrays.toString(arr));
    }

    /** Muestra la suma total y parcial de los valores de un array */
    private static void sumup() {
        int[] scores = {12, 34, 3224, 32};
        int totalScore = 0;

        for (int score : scores) {
            totalScore += score;
            System.out.println("Suma parcial: " + totalScore);
        }

        System.out.println("Suma total: " + totalScore);
    }

    /** Llena un array con números aleatorios */
    private static void initializeArray(int[] nums) {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(-1000000, 100000000);
        }
        System.out.println("Array inicializado con valores aleatorios.");
    }

    /** Encuentra el valor máximo y mínimo de un array */
    private static void findMaxMin(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int mayor = nums[0];
        int menor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mayor) mayor = nums[i];
            if (nums[i] < menor) menor = nums[i];
        }

        System.out.println("El número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);
    }
}
