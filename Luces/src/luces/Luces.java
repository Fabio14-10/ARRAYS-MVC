package luces;

import Modelo.Casa;
import Modelo.Habitacion;
import Vista.VistaLuces;
import Controlador.Controlador;

public class Luces {

    public static void main(String[] args) {
        Casa ca = new Casa();
        Habitacion hab = new Habitacion();
        VistaLuces vis = new VistaLuces();
        Controlador con = new Controlador(ca);

        vis.ejecutar();
        con.controlarLuces();
    }
}

