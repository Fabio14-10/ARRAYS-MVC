
package Modelo;

import Modelo.ModeloPersona;

public class ModeloSilla {
        private boolean reservada;
    private ModeloPersona persona;

    public ModeloSilla() {
        this.reservada = false;
    }

    public boolean estaReservada() {
        return reservada;
    }

    public void reservar(ModeloPersona persona) {
        if (!reservada) {
            this.reservada = true;
            this.persona = persona;
        }
    }

    public void liberar() {
        this.reservada = false;
        this.persona = null;
    }

    public ModeloPersona getPersona() {
        return persona;
    }
}
