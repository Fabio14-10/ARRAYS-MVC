
package Modelo;

public class ModeloVentilador {
    private boolean encendido;

    public ModeloVentilador() {
        this.encendido = false;
    }

    public void activar() {
        encendido = true;
        System.out.println("Ventilador activado.");
    }

    public void desactivar() {
        encendido = false;
        System.out.println("Ventilador desactivado.");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
