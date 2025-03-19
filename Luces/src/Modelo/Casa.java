
package Modelo;

public class Casa {
    private Modelo.Habitacion habitacion;

    public Casa() {
        this.habitacion = new Modelo.Habitacion();
    }

    public Modelo.Habitacion getHabitacion() {
        return habitacion;
    }
}
