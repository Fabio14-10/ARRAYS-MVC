
package Modelo;


public class ModeloSensor {
    private double temperatura;
    private double humedad;

    public ModeloSensor(double temperatura, double humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void leerSensor() {
        this.temperatura = 25 + Math.random() * 10;  
        this.humedad = 50 + Math.random() * 20;      
    }
}
