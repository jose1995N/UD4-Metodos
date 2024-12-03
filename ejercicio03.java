/* 3. Realiza un programa que pinte un triángulo relleno tal como se muestra en los ejemplos. El usuario
debe introducir la altura de la figura. Usar una función para que la implementación sea más sencilla.
Por ejemplo, se puede crear una función linea(char caracter, int repeticiones)
que pinte una línea con el carácter especificado.*/
import java.util.Scanner;

public class ejercicio03 {
    static void linea(char caracter, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int entrada = scanner.nextInt();

        for (int i = 1; i <= entrada; i++) {
            linea('*', i);
        }
    }
}

