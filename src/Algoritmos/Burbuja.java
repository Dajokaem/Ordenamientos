
package Algoritmos;

public class Burbuja {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;

        // Iterar sobre todo el array
        for (int i = 0; i < n - 1; i++) {
            // Últimos i elementos ya están en su lugar
            for (int j = 0; j < n - i - 1; j++) {
                // Intercambiar si el elemento actual es mayor que el siguiente
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

 

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
