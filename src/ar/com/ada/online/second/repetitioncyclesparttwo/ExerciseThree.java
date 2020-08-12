package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea\n" +
                "un arreglo de M filas y N columnas y que calcule la suma de los elementos de la\n" +
                "diagonal principal\n");

        //Se definen las variables de m y n
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese las dimensiones de la matriz
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        row = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        column = keyboard.nextInt();

        //Se corrobora si m = n
        if (row == column) {

        } else {
            System.out.println("Para realizar la suma de la diagonal principal M y N tienen que ser iguales.");
            System.exit(0);
        }

        //Se le asignan los valores a la matriz
        int[][] number = new int[row][column];
        int sum = 0;

        //Se pide al usuario que ingrese los numeros para la matriz
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Ingrese el valor para la matriz en la posicion %d %d: \n", i, j);
                number[i][j] = keyboard.nextInt();
            }
        }

        //Se realiza la suma de la diagonal principal
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    sum += number[i][j];
                }
            }
        }

        //Se muestra el resultado
        System.out.println("\nEl resultado de la suma de la diagonal principal es de: " + sum);

    }
}
