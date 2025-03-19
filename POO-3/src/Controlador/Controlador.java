package Controlador;

import Modelo.ModeloCalculadora;
import Vista.VistaUsuario;
import java.util.Scanner;

public class Controlador {

    private ModeloCalculadora modelo;
    private VistaUsuario vista;
    private double[] resultados;  
    private int contadorResultados;

    public Controlador(ModeloCalculadora modelo, VistaUsuario vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.resultados = new double[10]; 
        this.contadorResultados = 0;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.obtenerOpcion();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer numero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo numero: ");
                    double num2 = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Introduce la operacion (suma, resta, multiplicacion, division): ");
                    String operacion = scanner.nextLine();

                    double resultado = modelo.realizarOperacion(num1, num2, operacion);
                    if (!Double.isNaN(resultado)) {
                        vista.mostrarResultado(operacion, resultado);
                        if (contadorResultados < resultados.length) {
                            resultados[contadorResultados] = resultado;
                            contadorResultados++;
                        } else {
                            System.out.println("No hay más espacio en el array para resultados.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Vamos a hacer otro ejercicio!");
                    break;

                case 3:
                    System.out.println("Gracias por usar la calculadora. Hasta luego!");
                    System.out.println("Resultados de las operaciones realizadas:");
                    for (int i = 0; i < contadorResultados; i++) {
                        System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    }
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                    break;
            }
        }
    }
}


