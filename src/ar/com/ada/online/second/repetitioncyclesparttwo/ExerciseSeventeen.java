package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17: Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento\n" +
                "negativo. Realice un algoritmo que indique la posición que ese elemento ocupa en el\n" +
                "arreglo (en la fila y la columna en la que se encuentra ese elemento). ");

        //Se definen las variables
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {10, 20, 30, 40, 50, 60, 70, 80},
                {100, 200, 300, 400, 500, 600, 700, 800},
                {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000},
                {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000},
                {100000, 200000, -300000, 400000, 500000, 600000, 700000, 800000},
        };
        Scanner keyboard = new Scanner(System.in);

        //Se determina cual es el numero negativo del arreglo
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0){
                    System.out.printf("\nEl elemento %d es negativo y se encuentra en la posicion %d de i y %d de j.", matrix[i][j], i, j);
                    System.exit(0);
                }
            }
        }
        System.out.println("\nNo se encuentran elementos negativos.");

    }
}
