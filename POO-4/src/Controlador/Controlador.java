
package Controlador;
import Modelo.ModeloCalefactor;
import Modelo.ModeloSensor;
import Modelo.ModeloVentilador;

public class Controlador {
    
    private ModeloSensor sensor;
    private ModeloVentilador ventilador;
    private ModeloCalefactor calefactor;
    
    private double[] historialTemperaturas;  
    private int contadorTemperaturas;  

    public Controlador(ModeloSensor sensor, ModeloVentilador ventilador, ModeloCalefactor calefactor){
        this.calefactor = calefactor;
        this.sensor = sensor;
        this.ventilador = ventilador;
        this.historialTemperaturas = new double[10]; 
        this.contadorTemperaturas = 0;
    }

    public void controlarTemperatura() {
        double temperatura = sensor.leerTemperatura();
        System.out.println("La Temperatura actual es : " + temperatura + "°C");

        if (contadorTemperaturas < historialTemperaturas.length) {
            historialTemperaturas[contadorTemperaturas] = temperatura;
            contadorTemperaturas++;
        } else {
            System.out.println("Historial de temperaturas lleno.");
        }

        if (temperatura < 10) {
            if (!calefactor.estaEncendido()) {
                calefactor.activar();
                ventilador.desactivar();
            }
        } else if (temperatura >= 10 && temperatura <= 25) {
            calefactor.desactivar();
            ventilador.desactivar();
            System.out.println("El Sistema se encuentra inactivo.");
        } else if (temperatura > 25) {
            if (!ventilador.estaEncendido()) {
                ventilador.activar();
                calefactor.desactivar();
            }
        }
    }

    public void mostrarHistorialTemperaturas() {
        System.out.println("Historial de temperaturas registradas:");
        for (int i = 0; i < contadorTemperaturas; i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + historialTemperaturas[i] + "°C");
        }
    }
}
