package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2: Realice y represente mediante un diagrama de flujo el algoritmo para obtener el\n" +
                "producto de dos matrices de orden M x N y P x Q\n");

        //Se definen las variables de las filas y las columnas
        int rowA;
        int columnA;
        int rowB;
        int columnB;

        Scanner keyboard = new Scanner(System.in);

        //Se piden los valores del tamaño de las matrices
        System.out.print("Ingrese la cantidad de filas para la primera matriz: ");
        rowA = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas para la  primera matriz: ");
        columnA = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de filas para la segunda matriz: ");
        rowB = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas para la segunda matriz: ");
        columnB = keyboard.nextInt();

        if (columnA == rowB) {

            rowB = columnA;
        } else {
            System.out.println("No se pueden multiplicar las matrices");
        }

        //si coincide las columnas con la cantidad de filas se establecen las variables de las matrices

        int[][] numberA = new int[rowA][columnA];
        int[][] numberB = new int[rowB][columnB];
        int[][] result = new int[rowA][columnB];

        //Se pide que se ingresen los datos de la primera matriz
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.printf("Ingrese un valor para la posicion %d %d de la primera matriz: ", i, j);
                numberA[i][j] = keyboard.nextInt();
            }
        }

        //Se pide que se ingresen los datos de la segunda matriz
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.printf("\nIngrese un valor para la posicion %d %d de la segunda matriz: ", i, j);
                numberB[i][j] = keyboard.nextInt();
            }
        }

        //Se realiza la multiplicacion de las matrices
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                //Se inicializa el resultado a 0
                result[i][j] = 0;

                for (int k = 0; k < columnA; k++) {
                    result[i][j] = result[i][j] + (numberA[i][k] * numberB[k][j]);
                }
            }
        }

        //Se muestra el resultado
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.printf("\nEl resultado de la multiplicacion en la posicion %d %d de la matriz es de: %d\n", i, j, result[i][j]);
            }
        }
    }
}
