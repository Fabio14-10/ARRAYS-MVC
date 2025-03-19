
package Modelo;

public class Sensor {
    private boolean detectaMovimiento;


    public Sensor() {
        this.detectaMovimiento = false;
    }

    public void detectarMovimiento(boolean movimiento) {
        this.detectaMovimiento = movimiento;
    }

    public boolean estaDetectandoMovimiento() {
        return this.detectaMovimiento;
    }
}
