import java.util.Scanner;

public class ArregloInvertido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo (debe ser mayor a 1 y menor que 15): ");
        int tamano = scanner.nextInt();

        // Validar tamaño del arreglo
        if (tamano <= 2 || tamano >= 15) {
            System.out.println("El tamaño del arreglo debe ser mayor a 1 y menor que 15.");
            return; // Salir del programa si el tamaño no es válido
        }

        int[] arreglo = new int[tamano];
        llenarArreglo(arreglo);

        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        int[] arregloInvertido = invertirArreglo(arreglo);

        System.out.println("Arreglo invertido:");
        mostrarArreglo(arregloInvertido);

        scanner.close();
    }

    public static void llenarArreglo(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            try {
                System.out.println("Ingrese el elemento en la posición " + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor entero válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                i--; // Volver a pedir el mismo índice
            }
        }
        scanner.close();
    }

    public static int[] invertirArreglo(int[] arreglo) {
        int[] arregloInvertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloInvertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return arregloInvertido;
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
// Rafael Antonio Espinoza Sandoval 
// número de carnet 2024-1642U