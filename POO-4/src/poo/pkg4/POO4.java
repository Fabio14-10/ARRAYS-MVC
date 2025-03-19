
package poo.pkg4;

import Controlador.Controlador;
import Modelo.ModeloCalefactor;
import Modelo.ModeloSensor;
import Modelo.ModeloVentilador;
import Vista.VistaInvernadero;

public class POO4 {

    public static void main(String[] args) {
        ModeloSensor sen=new ModeloSensor();
        ModeloVentilador ven=new ModeloVentilador();
        ModeloCalefactor cal=new ModeloCalefactor();
        Controlador con=new Controlador(sen, ven, cal);
        VistaInvernadero vis=new VistaInvernadero(con);
        
        vis.ejecutar();
    }
    
}
