
package Modelo;

public class ModeloCliente {
    private String nombre;
    private boolean tieneMembresia;

    public ModeloCliente(String nombre, boolean tieneMembresia) {
        this.nombre = nombre;
        this.tieneMembresia = tieneMembresia;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public String getNombre() {
        return nombre;
    }
}
