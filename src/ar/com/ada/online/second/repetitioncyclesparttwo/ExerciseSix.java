package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6: Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea\n" +
                "los nombres y las edades de diez alumnos, y que los datos se almacenen en dos\n" +
                "vectores, y con base en esto se determine el nombre del alumno con la edad mayor del\n" +
                "arreglo.\n");

        //Se definen las variables
        String[] name = new String[10];
        int[] age = new int[10];
        String auxName;
        int auxAge;
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        for (int i = 0; i < name.length; i++) {
            System.out.printf("\nIngrese el nombre del alumno numero %d: ", i + 1);
            name[i] = keyboard.nextLine();

        }
        for (int i = 0; i < name.length; i++) {
            System.out.printf("\nIngrese la edad para el alumno numero %d: \n", i + 1);
            age[i] = keyboard.nextInt();
        }

        //Se evalua cual es el alumno de mayor edad
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (age[j] > age[i]) {
                    auxAge = age[i];
                    age[i] = age[j];
                    age[j] = auxAge;

                    auxName = name[i];
                    name[i] = name[j];
                    name[j] = auxName;
                }
            }
        }

        //Se muestra el resultado
        for (int i = 0; i < name.length; i++) {
            System.out.printf("\nEl alumno %s de %d años ocupa la posicion %d. \n", name[i], age[i], i + 1);
        }
    }
}
