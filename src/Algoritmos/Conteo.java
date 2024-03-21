package Algoritmos;

import java.util.Arrays;

public class Conteo {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int maximo = Arrays.stream(array).max().getAsInt();
        int minimo = Arrays.stream(array).min().getAsInt();
        int rango = maximo - minimo + 1;
        int[] conteo = new int[rango];
        int[] resultado = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            conteo[array[i] - minimo]++;
        }

        for (int i = 1; i < rango; i++) {
            conteo[i] += conteo[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            resultado[conteo[array[i] - minimo] - 1] = array[i];
            conteo[array[i] - minimo]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = resultado[i];
        }
    }


    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

