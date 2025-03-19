
package poo.pkg7;

import Modelo.ModeloSensor;
import Vista.VistaSistema;
import Controlador.Controlador;

public class POO7 {

    public static void main(String[] args) {
        ModeloSensor[] sensores = new ModeloSensor[3];
        sensores[0] = new ModeloSensor(0, 0);
        sensores[1] = new ModeloSensor(0, 0);
        sensores[2] = new ModeloSensor(0, 0);
        

        Controlador con = new Controlador(sensores);
        VistaSistema vis = new VistaSistema(sensores, con);
        
        vis.ejecutar();  
        con.verificarAC();  
    }
}

