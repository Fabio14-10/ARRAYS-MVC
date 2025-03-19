
package Modelo;

import java.util.Random;
public class ModeloSensor {
    private double temperatura;

    public ModeloSensor() {
        this.temperatura = 20.0; 
    }

    public double leerTemperatura() {
       
        Random random = new Random();
        temperatura = 5+(35 - 5)*random.nextDouble();
        return temperatura;
    }
}
