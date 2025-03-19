
package Modelo;

public class ModeloCalefactor {
    private boolean encendido;

    public ModeloCalefactor() {
        this.encendido = false;
    }

    public void activar() {
        encendido = true;
        System.out.println("Calefactor activado.");
    }

    public void desactivar() {
        encendido = false;
        System.out.println("Calefactor desactivado.");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
