/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jos56
 */
public class Cubo {

        public static void Ordenar(int[] elementos, int numCubos) {
            if (elementos == null || elementos.length == 0 || numCubos <= 0) {
                return;
            }

            // Encontrar el valor máximo y mínimo en el array
            int max = elementos[0];
            int min = elementos[0];
            for (int i = 1; i < elementos.length; i++) {
                if (elementos[i] > max) {
                    max = elementos[i];
                }
                if (elementos[i] < min) {
                    min = elementos[i];
                }
            }

            // Calcular el rango de cada bucket
            double interval = (double) (max - min + 1) / numCubos;

            // Crear buckets
            ArrayList<Integer>[] Cubos = new ArrayList[numCubos];
            for (int i = 0; i < numCubos; i++) {
                Cubos[i] = new ArrayList<>();
            }

            // Asignar elementos a los buckets
            for (int i = 0; i < elementos.length; i++) {
                int index = (int) ((elementos[i] - min) / interval);
                Cubos[index].add(elementos[i]);
            }

            // Ordenar cada bucket y combinarlos
            int index = 0;
            for (int i = 0; i < numCubos; i++) {
                Collections.sort(Cubos[i]);
                for (int j = 0; j < Cubos[i].size(); j++) {
                    elementos[index++] = Cubos[i].get(j);
                }
            }
        }

        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


