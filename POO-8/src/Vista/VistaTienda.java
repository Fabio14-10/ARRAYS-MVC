package Vista;

import java.time.LocalTime;
import java.util.Scanner;
import Modelo.ModeloCliente;
import Modelo.ModeloEmpleado;
import Controlador.Controlador;

public class VistaTienda {
    private ModeloEmpleado ModeloEmpleado;
    private ModeloCliente ModeloCliente;
    private Controlador Controlador;

    public VistaTienda(ModeloEmpleado ModeloEmpleado, ModeloCliente ModeloCliente, Controlador Controlador) {
        this.ModeloEmpleado = ModeloEmpleado;
        this.ModeloCliente = ModeloCliente;
        this.Controlador = Controlador;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al sistema de control de acceso a la tienda.");
            System.out.println("Problema a resolver: Acceso permitido solo si el cliente tiene membresia valida y la hora actual esta dentro del horario de atencion, o si es un empleado.");
            System.out.println("1. Resolver ejercicio");
            System.out.println("2. Hacer otro ejercicio");
            System.out.println("3. Mostrar empleados y clientes registrados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("El cliente es empleado? (true/false): ");
                    boolean esEmpleado = scanner.nextBoolean();
                    scanner.nextLine(); 

                    ModeloEmpleado empleado = null;
                    ModeloCliente cliente = null;

                    if (esEmpleado) {
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombreEmpleado = scanner.nextLine();
                        empleado = new ModeloEmpleado(nombreEmpleado);
                        Controlador.agregarEmpleado(empleado); 
                    } else {
                        System.out.print("¿El cliente tiene membresia? (true/false): ");
                        boolean tieneMembresia = scanner.nextBoolean();
                        scanner.nextLine(); 
                        
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombreCliente = scanner.nextLine();
                        cliente = new ModeloCliente(nombreCliente, tieneMembresia);
                        Controlador.agregarCliente(cliente); 
                    }

                    System.out.print("Ingrese la hora actual (formato HH:mm): ");
                    String horaActualStr = scanner.nextLine();
                    LocalTime horaActual = LocalTime.parse(horaActualStr);

                    if (Controlador.controlarAcceso(empleado, cliente, horaActual)) {
                        System.out.println("Acceso permitido.");
                    } else {
                        System.out.println("Acceso denegado.");
                    }
                    break;
                case 2:
                    System.out.println("Volver a hacer otro ejercicio.");
                    break;
                case 3:

                    Controlador.mostrarEmpleados();
                    Controlador.mostrarClientes();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                    break;
            }
        }
    }
}
