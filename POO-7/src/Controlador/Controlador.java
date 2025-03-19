package Controlador;

import Modelo.ModeloSensor;

public class Controlador {
    private ModeloSensor[] sensores;  

    public Controlador(ModeloSensor[] sensores) {
        this.sensores = sensores;
    }

    public void verificarAC() {
        for (ModeloSensor sensor : sensores) {
            if ((sensor.getTemperatura() > 28 && sensor.getHumedad() > 60) || sensor.getTemperatura() > 30) {
                System.out.println("El aire acondicionado esta ENCENDIDO.");
            } else {
                System.out.println("El aire acondicionado esta APAGADO.");
            }
        }
    }
}
