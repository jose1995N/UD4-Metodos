import java.util.Arrays;
import java.util.Random;
import EJER6.bibliotecas;

public class ejercicio06 {
  
   
    
        // Programa principal para probar las funciones
        public static void main(String[] args) {
            int[] array = EJER6.bibliotecas.generaArrayInt(10, 1, 100);
            System.out.println("Array generado: " + Arrays.toString(array));
    
            System.out.println("Mínimo del array: " + EJER6.bibliotecas.minimoArrayInt(array));
            System.out.println("Máximo del array: " + EJER6.bibliotecas.maximoArrayInt(array));
            System.out.println("Media del array: " + EJER6.bibliotecas.mediaArrayInt(array));
    
            int numero = 50;
            System.out.println("¿Está " + numero + " en el array? " + (EJER6.bibliotecas.estaEnArrayInt(array, numero) ? "Sí" : "No"));
            System.out.println("Posición de " + numero + " en el array: " + EJER6.bibliotecas.posicionEnArray(array, numero));
    
            System.out.println("Array volteado: " + Arrays.toString(EJER6.bibliotecas.volteaArrayInt(array)));
    
            int n = 3;
            System.out.println("Array rotado " + n + " posiciones a la derecha: " + Arrays.toString(EJER6.bibliotecas.rotaDerechaArrayInt(array, n)));
            System.out.println("Array rotado " + n + " posiciones a la izquierda: " + Arrays.toString(EJER6.bibliotecas.rotaIzquierdaArrayInt(array, n)));
        }
    }
    

