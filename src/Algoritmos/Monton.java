package Algoritmos;

public class Monton {

    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;

        // Construir un montón (heap)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Extraer elementos uno a uno del montón
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final del array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Llamar a heapify en el montón reducido
            heapify(array, i, 0);
        }
    }

    // Función para convertir un array dado en un montón (heap)
    public static void heapify(int[] array, int n, int i) {
        int mayor = i; // Inicializar el mayor como la raíz
        int izquierda = 2 * i + 1; // índice del hijo izquierdo
        int derecha = 2 * i + 2; // índice del hijo derecho

        // Si el hijo izquierdo es mayor que la raíz
        if (izquierda < n && array[izquierda] > array[mayor])
            mayor = izquierda;

        // Si el hijo derecho es mayor que el mayor hasta ahora
        if (derecha < n && array[derecha] > array[mayor])
            mayor = derecha;

        // Si el mayor no es la raíz
        if (mayor != i) {
            int temp = array[i];
            array[i] = array[mayor];
            array[mayor] = temp;

            // Recursivamente heapify the affected sub-tree
            heapify(array, n, mayor);
        }
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
