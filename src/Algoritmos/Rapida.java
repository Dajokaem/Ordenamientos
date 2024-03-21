/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

public class Rapida {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;
        quickSort(array, 0, n - 1);
    }

    public static void quickSort(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            // Encuentra la posición del pivote y ordena recursivamente los subarrays
            int indicePivote = particion(array, inicio, fin);

            // Ordena los elementos antes y después del pivote
            quickSort(array, inicio, indicePivote - 1);
            quickSort(array, indicePivote + 1, fin);
        }
    }

    public static int particion(int[] array, int inicio, int fin) {
        // Tomamos el último elemento como pivote
        int pivote = array[fin];
        int i = inicio - 1;

        // Recorremos el array, colocando los elementos menores que el pivote a la izquierda y los mayores a la derecha
        for (int j = inicio; j < fin; j++) {
            if (array[j] < pivote) {
                i++;
                // Intercambiamos array[i] y array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Intercambiamos array[i+1] y array[fin] (el pivote)
        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1;
    }

  
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
