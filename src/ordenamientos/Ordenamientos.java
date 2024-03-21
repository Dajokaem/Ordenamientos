package ordenamientos;

import Algoritmos.*;
import java.util.Scanner;

public class Ordenamientos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op = "", parte = " ", ex = "";
        int[] ejemplo = {1, 4, 8, 7, 45, 123, 5, 6, 9, 78, 22, 124, 48, 56, 888, 9542, 1313, 25, 14, 0, 6997, 4563, 126, 1548};
        int tipo = 0;
        System.out.println("El array de prueba es el siguiente");
        for (int num : ejemplo) {
            ex = ex + String.valueOf(num) + parte;
        }
        System.out.println(ex);

       

            System.out.println("Que algoritmo desea para ordenar?");
            System.out.println("1. Burbuja");
            System.out.println("2. Combinacion");
            System.out.println("3. Conteo");
            System.out.println("4. Cubo");
            System.out.println("5. Insercion");
            System.out.println("6. Monton");
            System.out.println("7. Raiz");
            System.out.println("8. Rapida");
            System.out.println("9. Seleccion");
            tipo = leer.nextInt();
            switch (tipo) {
                case 1:
                    Burbuja burbuja = new Burbuja();
                    burbuja.Ordenar(ejemplo);
                    System.out.println("El array ordenado por burbuja");
                    burbuja.imprimirArray(ejemplo);
                    break;
                case 2:
                    Combinacion combi = new Combinacion();
                    combi.Ordenar(ejemplo);
                    System.out.println("El array ordenao por Combinacion");
                    combi.imprimirArray(ejemplo);
                    break;
                case 3:
                    Conteo conteo = new Conteo();
                    conteo.Ordenar(ejemplo);
                    System.out.println("El array ordenado por Conteo");
                    conteo.imprimirArray(ejemplo);
                    break;
                case 4:
                    Cubo cubo = new Cubo();
                    System.out.println("Cual sera el tamaño de las cubetas a usar?");
                    int tamaño = leer.nextInt();
                    cubo.Ordenar(ejemplo, tamaño);
                    System.out.println("El array ordenado por Bucket Sort");
                    cubo.printArray(ejemplo);
                    
                    break;
                case 5:
                    Insercion inser = new Insercion();
                    inser.Ordenar(ejemplo);
                    System.out.println("El array Ordenado por Insercion");
                    inser.imprimirArray(ejemplo);
                    break;
                case 6:
                    Monton monton = new Monton();
                    monton.Ordenar(ejemplo);
                    System.out.println("El array ordenado por Montones");
                    monton.imprimirArray(ejemplo);
                    break;
                case 7:
                    Raiz raiz = new Raiz();
                    raiz.Ordenar(ejemplo);
                    System.out.println("El array ordenado por Raiz");
                    raiz.imprimirArray(ejemplo);
                    
                    break;
                case 8:
                    Rapida rapida = new Rapida();
                    rapida.Ordenar(ejemplo);
                    System.out.println("El array ordenado por Rapida");
                    rapida.imprimirArray(ejemplo);
                    
                    break;
                case 9:
                    Seleccion sele = new Seleccion();
                    sele.Ordenar(ejemplo);
                    System.out.println("El array ordenado por Seleccion");
                    sele.imprimirArray(ejemplo);
                    break;
                default:
                    System.out.println("fuera de Rango");
                    break;
            }
        

    }

}
