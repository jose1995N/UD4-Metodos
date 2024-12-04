/*5. Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar
ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }. */

import java.util.Scanner;

    public class ejercicio05 {
        static int[] concatena(int[] a, int[] b) {
            int[] resultado = new int[a.length + b.length];
            
            
            for (int i = 0; i < a.length; i++) {
                resultado[i] = a[i];
            }
    
           
            for (int i = 0; i < b.length; i++) {
                resultado[a.length + i] = b[i];
            }
    
            return resultado;
        }
    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
    
           
            System.out.println("Introduce la cantidad de valores que quieras en el primer array: ");
            int tamaño1 = entrada.nextInt();
            int[] a = new int[tamaño1];
            System.out.println("Introduce el valor para cada casilla de tu primer array: ");
            for (int i = 0; tamaño1 != 0 && i < tamaño1; i++) {
                a[i] = entrada.nextInt();
            }
    
           
            System.out.println("Introduce la cantidad de valores que quieras en el segundo array: ");
            int tamaño2 = entrada.nextInt();
            int[] b = new int[tamaño2];
            System.out.println("Introduce el valor para cada casilla de tu segundo array: ");
            for (int i = 0; tamaño2 != 0 && i < tamaño2; i++) {
                b[i] = entrada.nextInt();
            }
    
            
            int[] resultado = concatena(a, b);
    
            
            System.out.print("Unidos serían: ");
            for (int num + resultado) {
                System.out.print(num + " ");
            }
        }
    }
     
   
   
    

