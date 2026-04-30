package datastructure;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;
        int[][] world = new int[rows][columns];
        int[][] numbers = {{1, 2, 3}, {2, 12, 3}, {2, 10, 20}, {33, 22, 666}};
        int[] arr = {2, 10, 20};

        // Imprimir matriz 'numbers'
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir matriz 'world' inicial
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }

        // Llenar matriz 'world' con valores i+j
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                world[i][j] = i + j;
            }
        }

        // Imprimir matriz 'world' después de llenarla
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }

        // Matriz 3D
        int depth = 3;
        int[][][] minecraftworld = new int[rows][columns][depth];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Arrays.toString(minecraftworld[i][j]) + " ");
            }
            System.out.println();
        }

        // Llenar matriz 3D con valores i+j+k
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    minecraftworld[i][j][k] = i + j + k;
                }
            }
        }


        // Imprimir cada capa de profundidad
        for (int k = 0; k < depth; k++) {
            System.out.println("===== PROFUNDIDAD " + k + " =====");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(minecraftworld[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

