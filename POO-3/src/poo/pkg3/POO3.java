
package poo.pkg3;

import Controlador.Controlador;
import Modelo.ModeloCalculadora;
import Vista.VistaUsuario;

public class POO3 {

    public static void main(String[] args) {

        ModeloCalculadora mod = new ModeloCalculadora();
        VistaUsuario vis = new VistaUsuario("");
        Controlador con = new Controlador(mod, vis);
        vis.Vistazo(); 
        con.ejecutar();
    }
}
