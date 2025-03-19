
package Vista;

import java.util.Scanner;
import Modelo.ModeloPersona;

public class VistaUsuario {
    private Scanner scanner;

    public VistaUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public ModeloPersona crearPersona() {
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        return new ModeloPersona(nombre);
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de reservas.");
        System.out.println("1. Hacer una reserva");
        System.out.println("2. Ver reservas actuales");
        System.out.println("3. Salir");
    }

    public void mostrarMensajeDeBienvenida() {
        System.out.println("Este sistema permite reservar asientos en una sala de cine.");
    }

    public int pedirNumeroSilla() {
        System.out.println("Que numero de silla desea reservar? (1-" + 50 + "):");
        int numeroSilla = scanner.nextInt();
        scanner.nextLine(); 
        return numeroSilla;
    }
}
    

