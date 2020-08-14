package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        System.out.println("Ejercicio 16: Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce:\n" +
                "nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice\n" +
                "un algoritmo que:\n" +
                "a. Calcule el total de horas trabajadas a la semana para cada trabajador.\n" +
                "b. Calcule el sueldo semanal para cada uno de ellos.\n" +
                "c. Calcule el total que pagará la empresa.\n" +
                "d. Indique el nombre del trabajador que labora más horas el día lunes.\n" +
                "e. Imprima un reporte con todos los datos anteriores.\n");
        //Se definen las variables
        String[] name = new String[5];
        double[] pricePerHour = new double[5];
        double[][] workedHours = new double[5][6];
        double[] totalHours = new double[5];
        double[][] weeklySalary = new double[5][6];
        double companyPayment = 0;
        double mostTimeWorked;
        String mostTimeWorkedNAme = null;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese nombre, precio por horas y horas trabajadas
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nIngrese el nombre del trabajador %d: ", i + 1);
            keyboard.nextLine();
            name[i] = keyboard.nextLine();

            System.out.printf("\nIngrese el sueldo por hora del trabajador %d: ", i + 1);
            pricePerHour[i] = keyboard.nextDouble();

            for (int j = 0; j < 6; j++) {
                System.out.printf("\nIngrese las horas trabajadas del trabajador %d el dia %d: ", i + 1, j + 1);
                workedHours[i][j] = keyboard.nextDouble();
            }
        }

        //Se calcula el total de horas trabajadas
        for (int i = 0; i < 5; i++) {
            totalHours[i] = 0;
            for (int j = 0; j < 6; j++) {
                totalHours[i] += workedHours[i][j];
            }
        }

        //Se determina el sueldo semanal
        mostTimeWorked = workedHours[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                weeklySalary[i][j] = workedHours[i][j] * pricePerHour[i];
                companyPayment += weeklySalary[i][j];
            }
        }
        //Se determina el trabajador con las horas trabajadas el lunes
        mostTimeWorked = workedHours[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {

                if (workedHours[i][j] > mostTimeWorked) {
                    mostTimeWorked = workedHours[i][0];
                    mostTimeWorkedNAme = name[i];
                }
            }
        }

        System.out.println("\nEl sueldo a pagar por la empresa en total es de: " + companyPayment);
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nEl trabajador %s", name[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf(" realizo un total de %.2f horas el dia %d\n", workedHours[i][j], j + 1);
            }
            System.out.printf(" \n Con un total de %.2f semanales.\n", totalHours[i]);
        }
        System.out.printf("\nEl trabajador con mas horas el lunes es %s ", mostTimeWorkedNAme);


        /*//Se muestran los resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEl total a pagar por la empresa sera de: " + companyPayment);
            for (int j = 0; j < 6; j++) {
                System.out.printf("\nEl sueldo semanal del trabajador %d es de: %f \nCon un total de horas trabajadas de: %f", i + 1, weeklySalary[i][j], workedHours[i][j]);
                System.out.printf("\nEl trabajador con mas horas el lunes es %s ", mostTimeWorkedNAme);

            }
        }*/
    }
}
