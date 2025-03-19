
package Modelo;

public class Habitacion {
    private boolean hayMovimiento;

    public Habitacion() {
        this.hayMovimiento = false;
    }

    public boolean hayMovimiento() {
        return hayMovimiento;
    }

    public void setHayMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }
}
