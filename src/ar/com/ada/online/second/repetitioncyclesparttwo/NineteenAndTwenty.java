package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class NineteenAndTwenty {
    public static void main(String[] args) {
        System.out.println("Ejercicio 19 y 20: Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los\n" +
                "elementos de la diagonal principal de una matriz de 5 por 5 elementos. \n" +
                " Realice un algoritmo que a partir de la matriz del problema anterior encuentre cuántos\n" +
                "elementos tienen valor par y cuántos valores impares\n");

        //Se definen las variables
        int[][] matrix = new int[5][5];
        int result = 1;
        int evenNumbers = 0;
        int oddNumbers = 0;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que se ingresen los valores
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Ingrese un valor para la posicion %d, %d de la matrix: ", i, j);
                matrix[i][j] = keyboard.nextInt();
            }
        }


        //Se realiza la multiplicacion de la diagonal principal
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    result = result * matrix[i][j];
                }
            }
        }

        //Se cuentan cuantos numeros son pares y cuantos son impares
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] % 2 == 0) {
                 evenNumbers += 1;
                } else{
                    oddNumbers += 1;
                }
            }
        }

        //Se muestea el resultado
        System.out.println("\nEl resultado del producto de la diagonal principal es de "+ result +
                "\nCon una cantidad de "+ evenNumbers + " numeros pares " +
                "\nY "+ oddNumbers + " numeros impares.");

    }
}
