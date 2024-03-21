package Algoritmos;

public class Seleccion{

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;

        // Iterar sobre todo el array
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el elemento mínimo en el array no ordenado
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
        }
    }

 
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
