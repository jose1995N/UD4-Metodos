/*4Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve una cadena de
caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”. */

import java.util.Scanner;

public class ejercicio04 {
   
    public static String convierteArrayEnString(int[] a) {
        String resultado = "";
        for (int numero : a) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de valores en el array:");
        int tamaño = entrada.nextInt();

        int[] ini = new int[tamaño]; // Inicializar el array con el tamaño especificado
        
        System.out.println("intronduce el valor de cada casilla del array:");
        for (int i = 0; i < tamaño; i++) {
            ini [i] = entrada.nextInt();
        }

        String resultado = convierteArrayEnString(ini);
        System.out.println("El array convertido en caracteres de cadena : " + resultado);
    }
}

