
package Modelo;

import java.util.ArrayList;
import Modelo.ModeloPersona;
import Modelo.ModeloSilla;

public class ModeloSala {
    private ArrayList<ModeloSilla> sillas;
    private int capacidad;

    public ModeloSala(int capacidad) {
        this.capacidad = capacidad;
        this.sillas = new ArrayList<>();
        for (int i = 0; i < capacidad; i++) {
            sillas.add(new ModeloSilla());
        }
    }

    public boolean hacerReserva(ModeloPersona persona, int numeroSilla) {
        if (numeroSilla < 1 || numeroSilla > capacidad) {
            System.out.println("Numero de silla invalido. Debe ser entre 1 y " + capacidad);
            return false;
        }

        ModeloSilla silla = sillas.get(numeroSilla - 1);
        if (silla.estaReservada()) {
            System.out.println("La silla " + numeroSilla + " ya está reservada.");
            return false;
        }

        silla.reservar(persona);
        System.out.println("Reserva realizada para " + persona.getNombre() + " en la silla " + numeroSilla);
        return true;
    }

    public void mostrarReservas() {
        System.out.println("Estado de las reservas:");
        for (int i = 0; i < sillas.size(); i++) {
            ModeloSilla silla = sillas.get(i);
            if (silla.estaReservada()) {
                System.out.println("Silla " + (i + 1) + " reservada por " + silla.getPersona().getNombre());
            } else {
                System.out.println("Silla " + (i + 1) + " libre");
            }
        }
    }

    public boolean estaLlena() {
        for (ModeloSilla silla : sillas) {
            if (!silla.estaReservada()) {
                return false;
            }
        }
        return true;
    }
}



