
package Vista;

import java.util.Scanner;

public class VistaUsuario {
    private String nombre;

    public VistaUsuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Realizar una operacion.");
        System.out.println("2. Volver a hacer otro ejercicio.");
        System.out.println("3. Salir.");
        System.out.print("Selecciona una opcion (1/2/3): ");
    }

    public int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }

    public void Vistazo() {
        System.out.println("Bienvenido al sistema de calculadora!");
        System.out.println("Este programa te permitira realizar operaciones matematicas como suma, resta, multiplicacion y division.");
    }
}
