
package Controlador;

import java.util.Scanner;
import Modelo.ModeloPersona;
import Modelo.ModeloSala;
import Vista.VistaUsuario;

public class Controlador {
    
    private ModeloPersona objPersona;
    private ModeloSala objSala;
    private VistaUsuario objUsuario;
    
    public Controlador(ModeloPersona objPersona, ModeloSala objSala, VistaUsuario objUsuario){
        this.objPersona=objPersona;
        this.objSala=objSala;
        this.objUsuario=objUsuario;
    }
    
    public void ejecutar(){
    Scanner scanner = new Scanner(System.in);
        ModeloSala sala = new ModeloSala(50); 
        VistaUsuario usuario = new VistaUsuario();
        boolean salir = false;

        while (!salir) {
            usuario.mostrarMensajeDeBienvenida();
            usuario.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    ModeloPersona persona = usuario.crearPersona();
                    if (!sala.estaLlena()) {
                        int numeroSilla = usuario.pedirNumeroSilla();
                        sala.hacerReserva(persona, numeroSilla);
                    } else {
                        System.out.println("La sala esta llena.");
                    }
                    break;
                case 2:
                    sala.mostrarReservas();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Gracias por utilizar el sistema. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no valida, intente nuevamente.");
                    break;
            }
        }
    }
    
}
