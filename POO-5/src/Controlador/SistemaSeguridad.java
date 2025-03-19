package Controlador;

import Modelo.Sensor;

public class SistemaSeguridad {
    private Sensor sensor1;
    private Sensor sensor2;
    private Sensor sensor3;
    private boolean alarmaActivada;
    private boolean esNoche;
    
    private boolean[] historialSensores;  
    private int contadorSensores;

    public SistemaSeguridad() {
        this.sensor1 = new Sensor();
        this.sensor2 = new Sensor();
        this.sensor3 = new Sensor();
        this.alarmaActivada = false;
        this.esNoche = false;
        
        this.historialSensores = new boolean[10];  
        this.contadorSensores = 0;
    }

    public void setEsNoche(boolean esNoche) {
        this.esNoche = esNoche;
    }

    public void verificarAlarma() {
        if (esNoche) {
            int sensoresActivos = 0;
            if (sensor1.estaDetectandoMovimiento()) sensoresActivos++;
            if (sensor2.estaDetectandoMovimiento()) sensoresActivos++;
            if (sensor3.estaDetectandoMovimiento()) sensoresActivos++;

            if (sensoresActivos >= 2) {
                this.alarmaActivada = true;
            } else {
                this.alarmaActivada = false;
            }

            if (contadorSensores < historialSensores.length) {
                historialSensores[contadorSensores] = (sensoresActivos >= 2);  
                contadorSensores++;
            }
        } else {
            this.alarmaActivada = false; 
        }
    }

    public void mostrarEstadoAlarma() {
        if (alarmaActivada) {
            System.out.println("Alarma activada! Movimiento detectado en multiples sensores.");
        } else {
            System.out.println("Alarma desactivada. No hay movimiento suficiente.");
        }
    }

    public void setSensor1Detectando(boolean movimiento) {
        sensor1.detectarMovimiento(movimiento);
    }

    public void setSensor2Detectando(boolean movimiento) {
        sensor2.detectarMovimiento(movimiento);
    }

    public void setSensor3Detectando(boolean movimiento) {
        sensor3.detectarMovimiento(movimiento);
    }

    public void activarAlarma() {
        this.alarmaActivada = true;
        System.out.println("Alarma activada manualmente.");
    }

    public void desactivarAlarma() {
        this.alarmaActivada = false;
        System.out.println("Alarma desactivada manualmente.");
    }

    public void mostrarHistorialSensores() {
        System.out.println("Historial de sensores:");
        for (int i = 0; i < contadorSensores; i++) {
            System.out.println("Registro " + (i + 1) + ": " + (historialSensores[i] ? "Alarma activada" : "Alarma desactivada"));
        }
    }
}



