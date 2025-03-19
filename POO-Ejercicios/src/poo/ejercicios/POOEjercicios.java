
package poo.ejercicios;

import Controlador.Controlador;
import Modelo.ModeloPersona;
import Modelo.ModeloSala;
import Modelo.ModeloSilla;
import Vista.VistaUsuario;

public class POOEjercicios {

    public static void main(String[] args) {
        
        ModeloPersona per=new ModeloPersona("");
        ModeloSala sal=new ModeloSala(0);
        ModeloSilla sill=new ModeloSilla();
        VistaUsuario usu=new VistaUsuario();
        Controlador objControlador=new Controlador(per, sal, usu);
        objControlador.ejecutar();
    }
}
