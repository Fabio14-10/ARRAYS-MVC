package poo.pkg8;

import Modelo.ModeloCliente;
import Modelo.ModeloEmpleado;
import Controlador.Controlador;
import Vista.VistaTienda;

public class POO8 {
    public static void main(String[] args) {
        ModeloEmpleado emple = new ModeloEmpleado("");
        ModeloCliente clien = new ModeloCliente("", true);
        Controlador con = new Controlador();
        VistaTienda vis = new VistaTienda(emple, clien, con);
        
        vis.ejecutar();
    }
}





