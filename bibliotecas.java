package EJER6;

import java.util.Random;

public class bibliotecas {
    
        // Genera un array de tamaño n con números aleatorios dentro del intervalo (mínimo y máximo)
        public static int[] generaArrayInt(int n, int min, int max) {
            int[] array = new int[n];
            Random rand = new Random();
            
            for (int i = 0; i < n; i++) {
                array[i] = rand.nextInt((max - min) + 1) + min;
            }
            return array;
        }
    
        // Devuelve el mínimo del array
        public static int minimoArrayInt(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    
        // Devuelve el máximo del array
        public static int maximoArrayInt(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    
        // Devuelve la media del array
        public static double mediaArrayInt(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / array.length;
        }
    
        // Dice si un número está o no dentro de un array
        public static boolean estaEnArrayInt(int[] array, int num) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    return true;
                }
            }
            return false;
        }
    
        // Busca un número en un array y devuelve la posición (el índice) en la que se encuentra
        public static int posicionEnArray(int[] array, int num) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    return i;
                }
            }
            return -1; // Devuelve -1 si el número no se encuentra en el array
        }
    
        // Le da la vuelta a un array
        public static int[] volteaArrayInt(int[] array) {
            int[] result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[array.length - 1 - i];
            }
            return result;
        }
    
        // Rota n posiciones a la derecha los números de un array
        public static int[] rotaDerechaArrayInt(int[] array, int n) {
            int[] result = new int[array.length];
            n = n % array.length; // En caso de que n sea mayor que la longitud del array
            for (int i = 0; i < array.length; i++) {
                result[(i + n) % array.length] = array[i];
            }
            return result;
        }
    
        // Rota n posiciones a la izquierda los números de un array
        public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
            int[] result = new int[array.length];
            n = n % array.length; // En caso de que n sea mayor que la longitud del array
            for (int i = 0; i < array.length; i++) {
                result[(i - n + array.length) % array.length] = array[i];
            }
            return result;
        }
}
