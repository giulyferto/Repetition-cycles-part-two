package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz\n" +
                "transpuesta de cualquier matriz de orden M x N.\n");

        //Se definen las variables
        int[][] arrayNumber;
        int[][] auxNumber;
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);

        //Se piden las filas y las columbas
        System.out.print("Ingrese la cantidad de filas: ");
        row = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        column = keyboard.nextInt();

        //Se le asignan los valores a los elementos de la matriz

        arrayNumber = new int[row][column];
        auxNumber = new int[column][row];

        //Se piden los datos al usuario
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Ingrese el valor para la posicion %d %d del arreglo: ", i, j);
                arrayNumber[i][j] = keyboard.nextInt();
            }
        }

        //Se transpone la matriz
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                auxNumber[j][i] = arrayNumber[i][j];
            }
        }

        //Se muestra el resultado
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("\nEl valor en la posicion %d %d ahora es de: %d", i,j, auxNumber[j][i]);
            }
        }


    }
}
