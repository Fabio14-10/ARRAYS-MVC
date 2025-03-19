package Controlador;

import java.time.LocalTime;
import Modelo.ModeloCliente;
import Modelo.ModeloEmpleado;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private LocalTime horaApertura = LocalTime.of(9, 0); 
    private LocalTime horaCierre = LocalTime.of(21, 0);

    private List<ModeloEmpleado> empleados = new ArrayList<>();
    private List<ModeloCliente> clientes = new ArrayList<>();

    public boolean controlarAcceso(ModeloEmpleado empleado, ModeloCliente cliente, LocalTime horaActual) {
        if (empleado != null && empleado.esEmpleado()) {
            return true; 
        }

        if (cliente != null && cliente.tieneMembresia() && horaActual.isAfter(horaApertura) && horaActual.isBefore(horaCierre)) {
            return true; 
        }

        return false; 
    }

    public void agregarEmpleado(ModeloEmpleado empleado) {
        empleados.add(empleado);
    }

    public void agregarCliente(ModeloCliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados registrados:");
        for (ModeloEmpleado empleado : empleados) {
            System.out.println(empleado.getNombre());
        }
    }

    public void mostrarClientes() {
        System.out.println("Clientes registrados:");
        for (ModeloCliente cliente : clientes) {
            System.out.println(cliente.getNombre());
        }
    }
}


