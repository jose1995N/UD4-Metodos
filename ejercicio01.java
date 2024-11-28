/*1. Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
Por ejemplo, el 470213 en decimal convertido al sistema palotes es:
| | | | - | | | | | | | - - | | - | - | | |
Utiliza esta función en un programa para comprobar que funciona correctamente. Desde la función no
se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. */
import java.util.Scanner;

public class ejercicio01 {

    static String convierteEnPalotes(int n) {
        String cadenacarct = String.valueOf(n);/*esta la funcion que convierte a entero */
        String caract = "";

        for (int i = 0; i < cadenacarct.length(); i++) {

            int num = cadenacarct.charAt(i) - 48;/*se le recta porque asi consigo el entero de cada digito por que lo pasa a ASSI*/
            for (int j = 0; j < num; j++) {
                caract = caract + "|";
            }
            if (i < cadenacarct.length() - 1) {/*el menos uno para no añada mas - cuando termine */
                caract = caract + "-";
            }
        }
        return caract;
    }

    public static void main(String[] args) {
                   int n;
                    Scanner entrada = new Scanner(System.in);
                    n = entrada.nextInt();
                    System.out.println("El número " + n+ " convertido a palotes es: " + convierteEnPalotes(n));
                }

}
