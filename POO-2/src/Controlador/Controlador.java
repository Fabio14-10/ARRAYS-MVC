package Controlador;

import Modelo.ModeloNumero;
import Vista.VistaUsuario;

public class Controlador {
    
    private ModeloNumero objModeloNumero;
    private VistaUsuario objVistaUsuario;
    
    public Controlador(ModeloNumero objModeloNumero, VistaUsuario objVistaUsuario) {
        this.objModeloNumero = objModeloNumero;
        this.objVistaUsuario = objVistaUsuario;
    }
    
    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            objVistaUsuario.mostrarMensajeDeBienvenida();
            objVistaUsuario.mostrarMenu();
            int opcion = objVistaUsuario.pedirOpcion();

            switch (opcion) {
                case 1:
                    int[] numerosIngresados = objVistaUsuario.pedirNumeros();
                    for (int numero : numerosIngresados) {
                        objModeloNumero.jugarFizzBuzz(numero);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    salir = true;
                    System.out.println("Gracias por jugar! Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
            }
        }
    }
}

