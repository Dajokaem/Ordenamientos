package Algoritmos;

public class Insercion {


    public static void Ordenar(int[] array) {
        if (array == null || array.length == 0)
            return;

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int clave = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
       
        
    }

  
  
    



    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
