
package Vista;

import java.util.Scanner;
import Modelo.ModeloSensor;
import Controlador.Controlador;

public class VistaSistema {
    private ModeloSensor[] sensores; 
    private Controlador controlador;

    public VistaSistema(ModeloSensor[] sensores, Controlador controlador) {
        this.sensores = sensores;
        this.controlador = controlador;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU DE INICIO =====");
            System.out.println("1. Resolver ejercicio");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                while (true) {
                    System.out.println("===== MENU DE CONTROL DE AIRE ACONDICIONADO =====");
                    System.out.println("1. Leer sensores y verificar estado del aire acondicionado");
                    System.out.println("2. Volver al menu de inicio");
                    System.out.print("Seleccione una opcion: ");
                    int accion = scanner.nextInt();

                    if (accion == 1) {

                        for (ModeloSensor sensor : sensores) {
                            sensor.leerSensor();
                        }

                        controlador.verificarAC(); 
                    } else if (accion == 2) {
                        break;
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}
