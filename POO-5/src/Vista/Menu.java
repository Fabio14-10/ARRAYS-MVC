
package Vista;

import java.util.Scanner;
import Controlador.SistemaSeguridad;

public class Menu {
    private SistemaSeguridad sistema;
    private Scanner scanner;

    public Menu() {
        this.sistema = new SistemaSeguridad();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Sistema de Seguridad");
            System.out.println("1. Resolver ejercicio (Activar/desactivar alarma)");
            System.out.println("2. Ver historial de sensores");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    resolverEjercicio();
                    break;
                case 2:
                    sistema.mostrarHistorialSensores();
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente");
            }
        } while (opcion != 3);
    }

    private void resolverEjercicio() {
        System.out.println("Resolviendo ejercicio: Deteccion de Intrusos con Sensores de Movimiento");
        
        System.out.print("Es de noche? (true/false): ");
        boolean esNoche = scanner.nextBoolean();
        sistema.setEsNoche(esNoche);

        System.out.println("Simulando sensores...");
        System.out.print("¿Sensor 1 detecta movimiento? (true/false): ");
        sistema.setSensor1Detectando(scanner.nextBoolean());
        System.out.print("¿Sensor 2 detecta movimiento? (true/false): ");
        sistema.setSensor2Detectando(scanner.nextBoolean());
        System.out.print("¿Sensor 3 detecta movimiento? (true/false): ");
        sistema.setSensor3Detectando(scanner.nextBoolean());

        sistema.verificarAlarma();
        sistema.mostrarEstadoAlarma();

        System.out.println("Opciones de alarma:");
        System.out.println("1. Activar alarma manualmente");
        System.out.println("2. Desactivar alarma manualmente");
        System.out.println("3. Volver al menu");
        System.out.print("Elija una opcion: ");
        int opcionAlarma = scanner.nextInt();

        switch (opcionAlarma) {
            case 1:
                sistema.activarAlarma();
                break;
            case 2:
                sistema.desactivarAlarma();
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }  
}
