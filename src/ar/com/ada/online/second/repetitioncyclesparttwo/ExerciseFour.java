package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        System.out.println(" Realice un algoritmo para obtener una matriz como el resultado de la resta de dos\n" +
                "matrices de orden M x N. Represéntelo mediante diagrama de flujo y pseudocódigo\n");

        //Se declaran las dimensiones de la matriz
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);

        //Se pide que se ingresen las dimensiones de la matriz
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        row = keyboard.nextInt();

        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        column = keyboard.nextInt();

        //Se comprueba si M y N son iguales
        if (row == column) {

        } else {
            System.out.println("No se puede realizar la operacion");
            System.exit(0);
        }

        //Se definen las dimensiones de las matrices

        int[][] numberA = new int[row][column];
        int[][] numberB = new int[row][column];
        int[][] result = new int[row][column];

        //Se pide al usuario que ingrese los valores para la suma
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\nIngrese el valor para la posicion %d %d de la primera matriz: \n", i , j);
                numberA[i][j] = keyboard.nextInt();

                System.out.printf("Ingrese el valor para la posicion %d %d de la segunda matriz: \n", i , j);
                numberB[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = numberA[i][j] - numberB[i][j];
            }
        }

        //Se muestra el resultado
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\nEl resultado de la suma en la posicion %d %d es de: %d\n", i, j, result[i][j]);
            }
        }
    }
}
