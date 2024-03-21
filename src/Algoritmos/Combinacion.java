/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

public class Combinacion {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;

        // Inicializa el tamaño del gap
        int gap = n;

        // Inicializa la variable de intercambio
        boolean intercambiado = true;

        // Itera sobre el array hasta que no se realicen intercambios y el gap sea 1
        while (gap != 1 || intercambiado) {
            // Encoge el gap usando un factor de reducción de 1.3
            gap = siguienteGap(gap);

            // Inicializa la variable de intercambio
            intercambiado = false;

            // Compara todos los elementos con el gap actual
            for (int i = 0; i < n - gap; i++) {
                // Si el elemento en la posición i es mayor que el elemento en la posición i + gap, intercámbialos
                if (array[i] > array[i + gap]) {
                    // Realiza el intercambio
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Establece la variable de intercambio en true
                    intercambiado = true;
                }
            }
        }
    }

    // Función para calcular el siguiente gap utilizando el factor de reducción 1.3
    public static int siguienteGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1)
            return 1;
        return gap;
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
