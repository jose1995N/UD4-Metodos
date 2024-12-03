/* 2. Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una
coma detrás de cada palabra salvo al final.*/

import java.util.Scanner;

public class ejercicio02 {
   
        static String convierteEnPalabras(int n) {
     
            String[] palabrasDeNumeros = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
            String numeroStr = String.valueOf(n);
            String nombres = "";
    
            for (int i = 0; i < numeroStr.length(); i++) {
                int num = numeroStr.charAt(i)-48;
                nombres = nombres + palabrasDeNumeros[num];
                if (i < numeroStr.length() - 1) {/*el menos uno para no añada mas - cuando termine */
                    nombres = nombres + ", ";
                }
            
            }
            return nombres;
        }
    
        public static void main(String[] args) {
    
           int n;
         Scanner entrada = new Scanner(System.in);
          n = entrada.nextInt();
        System.out.println("El número " + n + " convertido a palabras es: " + convierteEnPalabras(n));
        }
    }
    

