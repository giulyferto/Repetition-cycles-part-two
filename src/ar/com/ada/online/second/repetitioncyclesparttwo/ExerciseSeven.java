package ar.com.ada.online.second.repetitioncyclesparttwo;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7: Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal\n" +
                "forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el\n" +
                "último pase a ser el primero, y así sucesivamente. Represéntelo mediante un diagrama\n" +
                "de flujo\n");

        //Se pide al usuario que ingrese el tamaño del array
        int arraySize;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de vectores: \n");
        arraySize = keyboard.nextInt();

        //Se define el vector para el array
        int[] number = new int[arraySize];
        int auxNumber;
        int auxNumberB;

        //Se pide al usuario que ingrese los numeros
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("\n Ingrese un numero para la posicion %d: ", i);
            number[i] = keyboard.nextInt();
        }

        //Se cambia el orden de los vectores

        auxNumber = number[0];
        number[0] = number[arraySize - 1];

        for (int i = 1; i < arraySize; i++) {
            auxNumberB = number[i];
            number[i] = auxNumber;
            auxNumber = auxNumberB;
        }

        //Se lee el resultado
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("\nAhora el numero %d ocupa la posicion %d\n", number[i], i);
        }
    }
}
