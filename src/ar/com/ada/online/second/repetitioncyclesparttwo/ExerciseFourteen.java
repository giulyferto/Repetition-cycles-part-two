package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        System.out.println("Ejercicio 14: Realice un algoritmo que lea una matriz de cinco filas y seis columnas y que cuente los\n" +
                "elementos negativos que contiene, así como también cuántos elementos de la diagonal principal son igual a cero.\n");
        //Se definen las variables
        int[][] matrix = new int[5][6];
        int zero = 0;
        int negative = 0;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese los datos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("\nIngrese un numero para la posicion %d %d de la matriz: ", i , j);
                matrix[i][j] = keyboard.nextInt();
            }
        }

        //Se cuentan los elementos negativos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    negative += 1;
                }
            }
        }


        //Se cuentan los elementos de la diagonal principal iguales a 0

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] == 0) {
                        zero += 1;
                    }
                }
            }
        }

        //Se muestra el resultado
        System.out.println("\nLa cantidad de elementos negativos de la matriz es igual a " + negative +
                "\n Y la cantidad de elementos de la diagonal principal iguales a 0 es de: " + zero);
    }
}
