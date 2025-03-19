package Vista;

import java.util.Scanner;
import Controlador.Controlador;

public class VistaInvernadero {
    
    private Controlador controlador;

    public VistaInvernadero(Controlador controlador) {
        this.controlador = controlador;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean seguirEjecutando = true;

        while (seguirEjecutando) {
            System.out.println("Bienvenido al sistema de control de temperatura de un invernadero.");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Resolver ejercicio");
            System.out.println("2. Ver historial de temperaturas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando control de temperatura...");
                    controlador.controlarTemperatura();
                    break;

                case 2:
                    controlador.mostrarHistorialTemperaturas();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    System.out.println("Se ha salido correctamente");
                    System.out.println("Gracias y hasta luego");
                    seguirEjecutando = false;
                    break;

                default:
                    System.out.println("Opcion invalida, por favor elija una opcion valida.");
            }
        }
    }
}

