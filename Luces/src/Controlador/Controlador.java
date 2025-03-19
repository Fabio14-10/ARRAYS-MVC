package Controlador;

import Modelo.Casa;

public class Controlador {
    private boolean esDeDia;
    private Casa casa;
    

    private String[] historialLuces;
    private int contadorHistorial;

    public Controlador(Casa casa) {
        this.esDeDia = false;
        this.casa = casa;
        

        this.historialLuces = new String[10];
        this.contadorHistorial = 0;
    }

    public void setEsDeDia(boolean esDeDia) {
        this.esDeDia = esDeDia;
    }

    public void controlarLuces() {
        boolean lucesEncendidas = false;

        if (esDeDia) {
            lucesEncendidas = false;
        } else if (!esDeDia && casa.getHabitacion().hayMovimiento()) {
            lucesEncendidas = true;
        } else if (!esDeDia && !casa.getHabitacion().hayMovimiento()) {
            lucesEncendidas = false;
        }

        System.out.println("Luces " + (lucesEncendidas ? "Encendidas" : "Apagadas"));
        

        if (contadorHistorial < historialLuces.length) {
            historialLuces[contadorHistorial] = (lucesEncendidas ? "Encendidas" : "Apagadas");
            contadorHistorial++;
        }

        System.out.println("Las luces están en el estado deseado.");
    }


    public void mostrarHistorial() {
        System.out.println("Historial de luces:");
        for (int i = 0; i < contadorHistorial; i++) {
            System.out.println("Registro " + (i + 1) + ": " + historialLuces[i]);
        }
    }
}


