package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Realice un diagrama de flujo que represente el algoritmo para determinar si una matriz\n" +
                "es de tipo diagonal: es una matriz cuadrada en la cual todos sus elementos son cero,\n" +
                "excepto los electos de la diagonal principal.\n");

        //Se declaran las filas y columnas de la matriz
        int row;
        int column;

        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese la dimension de la matriz
        System.out.println("Ingrese la cantidad de filas de la matriz: \n");
        row = keyboard.nextInt();

        System.out.println("Ingrese la cantidad de columnas de la matriz: \n");
        column = keyboard.nextInt();

        //Se corrobora si M y N son iguales
        if (row == column) {

        } else {
            System.out.println("Los valores de las filas y columnas tienen que ser iguales");
            System.exit(0);
        }

        //Se le asignan las dimensiones a la matriz
        int[][] number = new int[row][column];

        //Se pide al usuario que ingrese los valores de la matriz

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Ingrese el valor de la matriz en la posicion %d %d de la matriz: \n", i, j);
                number[i][j] = keyboard.nextInt();
            }
        }

        //Se corrobora si la matriz es de tipo diagonal
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j){
                   if (number[i][j] == 0 ){

                   } else {
                       System.out.println("\nLa matriz no es de tipo diagonal.");
                       System.exit(0);
                   }
                }
            }
        }

        //Se muestra el resultado
        System.out.println("\nLa matriz si es de tipo diagonal.");

    }
}
