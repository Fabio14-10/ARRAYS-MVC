
package Vista;

import java.util.Scanner;

public class VistaUsuario {
    private Scanner scanner;

    public VistaUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensajeDeBienvenida() {
        System.out.println("Bienvenido al juego FizzBuzz.");
        System.out.println("Si el numero es divisible por 3, se imprime 'Fizz'.");
        System.out.println("Si el numero es divisible por 5, se imprime 'Buzz'.");
        System.out.println("Si el numero es divisible por ambos, se imprime 'FizzBuzz'.");
        System.out.println("Si no es divisible por ninguno, se imprime el numero.");
    }

    public void mostrarMenu() {
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Jugar FizzBuzz");
        System.out.println("2. Volver al menu principal");
        System.out.println("3. Salir");
    }

    public int pedirOpcion() {
        return scanner.nextInt();
    }

    public int[] pedirNumeros() {
        System.out.println("Cuantos numeros deseas ingresar para evaluar FizzBuzz?");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }
}
