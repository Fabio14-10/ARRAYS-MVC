
package Modelo;

public class ModeloEmpleado {
    private String nombre;
    private boolean esEmpleado;

    public ModeloEmpleado(String nombre) {
        this.nombre = nombre;
        this.esEmpleado = true;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }

    public String getNombre() {
        return nombre;
    }
}
