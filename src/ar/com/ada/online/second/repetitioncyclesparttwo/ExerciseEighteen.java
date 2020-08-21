package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseEighteen {
    public static void main(String[] args) {
        System.out.println("Ejercicio 18: Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella\n" +
                "genere dos vectores que contengan la suma de sus renglones y la suma de sus columnas.\n");

        //Se define la variable para la dimension de la matriz
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese la cantidad de filas y columnas
        System.out.print("\nIngrese la cantidad de filas de la matriz: ");
        row = keyboard.nextInt();

        System.out.print("\nIngrese la cantidad de columnas de la matriz: ");
        column = keyboard.nextInt();

        //Se definen las variables de la matriz
        int[][] numberA = new int[row][column];
        int[] sumRows = new int[numberA.length];
        int[] sumColumns = new int[numberA[0].length];

        //Se le pide al usuario que ingrese los datos de la matriz
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\nIngrese el valor de la primera matriz en la posicion %d %d: ", i, j);
                numberA[i][j] = keyboard.nextInt();
            }
        }

        //Se hace la suma de las filas
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumRows[i] += numberA[i][j];
            }
            System.out.printf("\nLa suma de la fila %d es de %d", i, sumRows[i]);
        }

        //Se hace la suma de las columnas
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                sumColumns[j] += numberA[i][j];
            }
            System.out.printf("\nLa suma de la columna %d es de %d", j, sumColumns[j]);
        }

    }
}
