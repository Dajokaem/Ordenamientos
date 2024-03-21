package Algoritmos;

import java.util.Arrays;

public class Raiz {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        // Encuentra el valor máximo para saber el número de dígitos
        int maximo = Arrays.stream(array).max().getAsInt();

        // Realiza la ordenación utilizando conteo por cada dígito
        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            conteoPorDigito(array, exp);
        }
    }

    public static void conteoPorDigito(int[] array, int exp) {
        int n = array.length;
        int[] salida = new int[n];
        int[] conteo = new int[10]; // Hay 10 dígitos posibles

        // Almacena la cantidad de ocurrencias de cada dígito en el conteo
        for (int i = 0; i < n; i++)
            conteo[(array[i] / exp) % 10]++;

        // Cambia conteo[i] para que ahora contenga la posición actual de cada dígito en la salida
        for (int i = 1; i < 10; i++)
            conteo[i] += conteo[i - 1];

        // Construye la salida
        for (int i = n - 1; i >= 0; i--) {
            salida[conteo[(array[i] / exp) % 10] - 1] = array[i];
            conteo[(array[i] / exp) % 10]--;
        }

        // Copia la salida al array original
        for (int i = 0; i < n; i++)
            array[i] = salida[i];
    }

 

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
