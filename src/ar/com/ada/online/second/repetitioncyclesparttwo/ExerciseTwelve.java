package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        System.out.println("Ejercicio 12: Se tiene en un arreglo cien elementos representando calificaciones de los estudiantes\n" +
                "de una escuela. Realice un algoritmo que lea el arreglo y calcule la calificación promedio\n" +
                "del grupo, además, que cuente los estudiantes que obtuvieron calificaciones arriba del\n" +
                "promedio del grupo. Represéntelo mediante diagrama de flujo y pseudocódigo.\n");

        //Se definen las variables
        double[] gpa = new double[100];
        double generalGPA;
        double auxGPA = 0;
        int students = 0;
        Scanner keyboard = new Scanner(System.in);

        //Se pide al usuario que ingrese los datos
        for (int i = 0; i < gpa.length; i++) {
            System.out.printf("\nIngrese el promedio del alumno %d: ", i+1);
            gpa[i] = keyboard.nextDouble();
        }

        //Se calcula el promedio general
        for (int i = 0; i < gpa.length; i++) {
            auxGPA += gpa[i];
        }
        generalGPA = auxGPA / 100;

        //Se calcula la cantidad de alumnos que tienen una nota mayor al promedio general
        for (int i = 0; i < gpa.length; i++) {
            if (gpa[i] >= generalGPA){
                students += 1;
            }
        }
        //Se muestra el resultado
        System.out.printf("\nEl promedio general de los alumnos es de %.2f y hay una cantidad de %d alumnos que igualan o superan ese promedio.", generalGPA, students);
    }
}
