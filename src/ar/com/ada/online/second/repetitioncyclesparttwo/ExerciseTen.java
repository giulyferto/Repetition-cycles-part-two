package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10: Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un\n" +
                "algoritmo que lea los arreglos y que determine si la diagonal principal de la primera es\n" +
                "igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I,\n" +
                "J son iguales). Represente la solución mediante el diagrama de flujo y el pseudocódigo.\n");
        //Se definen las variables
        int[][] numberA = new int[12][12];
        int[][] numberB = new int[12][12];
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese los valores de las matrices
        for (int i = 0; i < numberA.length; i++) {
            for (int j = 0; j < numberA[i].length; j++) {
                System.out.printf("\nIngrese el valor para la posicion %d %d de la primera matriz: ", i, j);
                numberA[i][j] = keyboard.nextInt();

                System.out.printf("Ingrese el valor para la posicion %d %d de la segunda matriz: ", i, j);
                numberB[i][j] = keyboard.nextInt();
            }
        }

        //Se determina si las diagonales principales son iguales
        for (int i = 0; i < numberA.length; i++) {
            for (int j = 0; j < numberA[i].length; j++) {
                if (i == j) {
                    if (numberA[i][j] == numberB[i][j]) {

                    } else {
                        System.out.println("Las diagonales principales de las matrices no son iguales.");
                        System.exit(0);
                    }
                }
            }
        }

        //Si son iguales se lee el resultado
        System.out.println("Las diagonales principales de las matrices son iguales.");

    }
}
