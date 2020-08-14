package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        System.out.println("Ejercicio 11: Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo para encontrar\n" +
                "todos sus elementos negativos y para que les cambie ese valor negativo por un cero.\n" +
                "Realice un algoritmo para tal fin y represéntelo mediante diagrama de flujo y\n" +
                "pseudocódigo.");


        //Se definen las variables
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
                {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900},
                {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000, 19000},
                {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000, 110000, 120000, 130000, 140000, 150000, 160000, 170000, 180000, 190000},
                {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000, 1100000, 1200000, 1300000, 1400000, 1500000, 1600000, 1700000, 1800000, 1900000},
                {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19},
                {-10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190},
                {-100, -200, -300, -400, -500, -600, -700, -800, -900, -1000, -1100, -1200, -1300, -1400, -1500, -1600, -1700, -1800, -1900},
                {-1000, -2000, -3000, -4000, -5000, -6000, -7000, -8000, -9000, -10000, -11000, -12000, -13000, -14000, -15000, -16000, -17000, -18000, -19000},
                {-10000, -20000, -30000, -40000, -50000, -60000, -70000, -80000, -90000, -100000, -110000, -120000, -130000, -140000, -150000, -160000, -170000, -180000, -190000},
                {-100000, -200000, -300000, -400000, -500000, -600000, -700000, -800000, -900000, -1000000, -1100000, -1200000, -1300000, -1400000, -1500000, -1600000, -1700000, -1800000, -1900000},

        };
        Scanner keyboard = new Scanner(System.in);

        //Se transforman los valores negativos a cero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}

