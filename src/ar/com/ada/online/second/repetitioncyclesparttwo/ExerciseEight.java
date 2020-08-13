package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8: Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el\n" +
                "arreglo y que calcule y presente los resultados siguientes:\n" +
                "El menor elemento del arreglo; la suma de los elementos de las cinco primeras filas del\n" +
                "arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.\n");

        //Se definen las variables
        int[][] numbers = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150},
                {100, 200, 300, 400, 500, 6000, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500},
                {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15},
                {-10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150},
                {-100, -200, -300, -400, -500, -600, -700, -800, -900, -1000, -1100, -1200, -1300, -1400, -1500},
                {-1000, -2000, -3000, -4000, -5000, -6000, -7000, -8000, -9000, -10000, -11000, -12000, -13000, -14000, -15000},
                {-100000, -20000, -30000, -40000, -50000, -6000000, -70000, -80000, -90000, -100000, -110000, -120000, -130000, -140000, -150000},
                {1000, 2000, 3000, 4000, 5000, 60000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000},
                {10000, 20000, 30000, 40000, 50000, 600000, 70000, 80000, 90000, 100000, 110000, 120000, 130000, 140000, 150000},
                {100000, 20000, 30000, 40000, 50000, 600000, 700000, 8000000, 900000, 1000000, 10100, 10200, 10300, 10400, 10500},
                {1001, 2002, 3003, 4004, 5050, 60060, 7070, 8800, 9090, 10010, 11010, 12020, 13003, 14004, 15005},

        };
        int sum = 0;
        int neg = 0;
        int minor = numbers[0][0];
        Scanner keyboard = new Scanner(System.in);

        //Se suman las primeras 5 filas del arreglo y se cuentan los numeros negativos
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i < 5) {
                    sum += numbers[i][j];
                } else if (i < 9) {
                    if (numbers[i][j] < 0) {
                        neg += 1;
                    }
                }
            }
        }

        //Se determina cual es el menor valor
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < minor) {
                    minor = numbers[i][j];
                }
            }
        }

        //se muestra el resultado
        System.out.println("El menor numero de la matriz es " + minor + "\nLa cantidad de numeros negativos  de la fila 5 a 9 son " + neg + "\nY la suma de las primeras 5 filas da como resultado " +sum);
    }
}
