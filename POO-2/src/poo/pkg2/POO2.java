
package poo.pkg2;

import Controlador.Controlador;
import Modelo.ModeloNumero;
import Vista.VistaUsuario;
public class POO2 {

    public static void main(String[] args) {
        ModeloNumero mod=new ModeloNumero();
        VistaUsuario vis=new VistaUsuario();
        Controlador con=new Controlador(mod, vis);
        con.ejecutar(); 
    }
}

