package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9: Realice un algoritmo que lea dos vectores de cien elementos y que calcule la suma de\n" +
                "éstos guardando su resultado en otro vector, el cual se debe presentar en forma\n" +
                "impresa.\n");

        //Se definen las variables
        double[] arrayNumberOne = new double[100];
        double[] arrayNumberTwo = new double[100];
        double[] sumResult = new double[100];


        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);


        //Se le piden los numeros al usuario

        for (int i = 0; i < arrayNumberOne.length; i++) {
            System.out.printf("\nIngrese el valor del primer numero en la posicion %d del arreglo: ", i + 1);
            arrayNumberOne[i] = keyboard.nextDouble();

            System.out.printf("\nIngrese el valor del segundo numero en la posicion %d del arreglo: ", i + 1);
            arrayNumberTwo[i] = keyboard.nextDouble();


        }

        //Se hace la suma
        for (int i = 0; i < arrayNumberOne.length; i++) {
            sumResult[i] = arrayNumberOne[i] + arrayNumberTwo[i];
        }

        //Se muestra el resultado
        System.out.println("El resultado de la suma de los elementos de los arreglos es: ");
        for (int i = 0; i < arrayNumberOne.length; i++) {
            System.out.printf("\nindice: %d, valor %.2f\n", i, sumResult[i]);
        }
    }
}
