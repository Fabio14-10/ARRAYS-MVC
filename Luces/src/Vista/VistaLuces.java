
package Vista;

import java.util.Scanner;
import Modelo.Casa;
import Controlador.Controlador;

public class VistaLuces {
    
    public static void mostrarMenu() {
        System.out.println("MENU PRINCIPAL:");
        System.out.println("1. Resolver ejercicio");
        System.out.println("2. Ver historial de luces");
        System.out.println("3. Volver a hacer otro ejercicio");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        Casa casa = new Casa();
        Controlador sistema = new Controlador(casa);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ejercicio: Control de Luces Automático");
                    System.out.println("Ingrese si es de día (true/false): ");
                    boolean esDeDia = scanner.nextBoolean();
                    sistema.setEsDeDia(esDeDia);

                    System.out.println("¿Hay movimiento en la habitación? (true/false): ");
                    boolean movimiento = scanner.nextBoolean();
                    casa.getHabitacion().setHayMovimiento(movimiento);

                    sistema.controlarLuces();
                    break;

                case 2:
                    sistema.mostrarHistorial();
                    break;

                case 3:
                    System.out.println("Reiniciando el ejercicio...");
                    break;

                case 4:
                    System.out.println("Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
